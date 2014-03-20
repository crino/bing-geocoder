package com.bing.geocoder.model;

import java.io.Serializable;

public class GeocoderRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String query;         	// query. Optional.
    private LatLng location;        // LatLng about which to search. Optional.
    private String culture;     	// Preferred language for results. Optional.
    private Integer maxResults;		// Max results for the request
    
    
    public GeocoderRequest() {
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    
    public LatLng getLocation() {
        return location;
    }

    public void setLocation(LatLng location) {
        this.location = location;
    }
    
    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }
    
    public Integer getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(int maxResults) {
        this.maxResults = maxResults;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeocoderRequest that = (GeocoderRequest) o;

        if (query != null ? !query.equals(that.query) : that.query != null) return false;
        if (culture != null ? !culture.equals(that.culture) : that.culture != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (maxResults != null ? !maxResults.equals(that.maxResults) : that.maxResults != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (query != null ? query.hashCode() : 0);
        result = 31 * result + (culture != null ? culture.hashCode() : 0);
        result = 31 * result + (maxResults != null ? maxResults.hashCode() : 0);       
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GeocoderRequest{" +
                ", address='" + query + '\'' +
                ", location=" + location +                
                ", culture='" + culture + '\'' +
                ", maxResults='" + maxResults + '\'' +
                '}';
    }
}