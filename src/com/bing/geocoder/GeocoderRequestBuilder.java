package com.bing.geocoder;

import com.bing.geocoder.model.GeocoderRequest;
import com.bing.geocoder.model.LatLng;

public class GeocoderRequestBuilder {
    private final GeocoderRequest geocoderRequest = new GeocoderRequest();

    public GeocoderRequestBuilder setQuery(String query) {
        geocoderRequest.setQuery(query);
        return this;
    }

    public GeocoderRequestBuilder setCulture(String culture) {
        geocoderRequest.setCulture(culture);
        return this;
    }

    public GeocoderRequestBuilder setLocation(LatLng location) {
        geocoderRequest.setLocation(location);
        return this;
    }

    public GeocoderRequestBuilder setMaxResults(int maxResults) {
        geocoderRequest.setMaxResults(maxResults);
        return this;
    }

    public GeocoderRequest build() {
        return geocoderRequest;
    }
}
