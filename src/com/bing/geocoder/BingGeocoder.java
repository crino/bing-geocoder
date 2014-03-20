package com.bing.geocoder;

import com.bing.geocoder.model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class BingGeocoder {

    private static final String GEOCODE_REQUEST_SERVER_HTTP = "http://dev.virtualearth.net";
    private static final String GEOCODE_REQUEST_PATH = "/REST/v1/Locations/";
    private static final String ENCODING = "UTF-8";

    private Logger logger;
    
    private final String clientKey;

    public BingGeocoder(final String clientKey) {
        if (clientKey == null || clientKey.length() == 0) {
            throw new IllegalArgumentException("ClientKey is not defined");
        }

        this.clientKey = clientKey;
    }

    public BingGeocoder setLogger(Logger logger) {
    	this.logger = logger;
    	return this;
    }

    public GeocoderResponse geocode(final GeocoderRequest geocoderRequest) {
        try {
            final Gson gson = new GsonBuilder()
            	.registerTypeAdapter(Status.class, Status.getJsonDeserializer())
            	.create();
            
            final String urlString = getURL(geocoderRequest);

            return request(gson, urlString);
        } catch (Exception e) {
            if (logger != null && logger.isDebugEnabled()) logger.e(e);
            return new GeocoderResponse(); // empty response
        }
    }

    protected GeocoderResponse request(Gson gson, String urlString) throws IOException {
        URL url = new URL(urlString);
                
        HttpURLConnection uc = (HttpURLConnection) url.openConnection();
        
        Reader reader = null;
        try {
        	reader = new BufferedReader(new InputStreamReader(uc.getInputStream(), ENCODING));	
        }
        catch (IOException e) {
        	reader = new BufferedReader(new InputStreamReader(uc.getErrorStream(), ENCODING));
        }
        
        try {
            return gson.fromJson(reader, GeocoderResponse.class);
        }
        finally {
            reader.close();
        }
    }

    protected String getURL(final GeocoderRequest geocoderRequest) throws UnsupportedEncodingException {
        if (logger != null && logger.isDebugEnabled()) {
            logger.d("Request: %s", geocoderRequest);
        }
        final StringBuilder url = getURLQuery(geocoderRequest);
        url.append("&key=").append(URLEncoder.encode(clientKey, ENCODING));
        
        // add server name
        url.insert(0, GEOCODE_REQUEST_SERVER_HTTP);

        if (logger != null && logger.isDebugEnabled()) {
            logger.d("Request URL Full: %s", url);
        }
        return url.toString();
    }

    protected StringBuilder getURLQuery(GeocoderRequest geocoderRequest) throws UnsupportedEncodingException {
    	
    	final String query = geocoderRequest.getQuery();
    	final String culture = geocoderRequest.getCulture();
    	final Integer maxResults = geocoderRequest.getMaxResults();
    	final LatLng location = geocoderRequest.getLocation();    	

        final StringBuilder url = new StringBuilder(GEOCODE_REQUEST_PATH);

        if (location != null) {
            url.append(URLEncoder.encode(location.toUrlValue(), ENCODING)).append("?");
        }
        else if (query != null && query.length() > 0) {
        	url.append("?q=").append(URLEncoder.encode(query, ENCODING));
        }
        else {
            throw new IllegalArgumentException("Query or location must be defined");
        }
        
        if (culture != null && culture.length() > 0) {
            url.append("&c=").append(URLEncoder.encode(culture, ENCODING));
        }
        
        if (maxResults != null && maxResults > 0) {
            url.append("&maxResults=").append(maxResults.toString());
        }
        
        if (logger != null && logger.isDebugEnabled()) {
            logger.d("Request URL: %s", url);
        }
        
        return url;
    }
    
    public abstract interface Logger {
    	public abstract boolean isDebugEnabled();
      
    	public abstract void d(String format, Object... args);
      
    	public abstract void e(Throwable throwable);
    }
}