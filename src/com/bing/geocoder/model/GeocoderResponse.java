package com.bing.geocoder.model;

import java.io.Serializable;
import java.util.List;

public class GeocoderResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private AuthenticationResultCode authenticationResultCode;
    private String brandLogoUri;
    private String copyright;
    private List<ResourceSet> resourceSets;
    private Integer statusCode;
    private String statusDescription;
    private String traceId;    

    public AuthenticationResultCode getAuthenticationResultCode() {
        return authenticationResultCode;
    }

    public void setAuthenticationResultCode(AuthenticationResultCode authenticationResultCode) {
        this.authenticationResultCode = authenticationResultCode;
    }

    public String getBrandLogoUri() {
        return brandLogoUri;
    }

    public void setBrandLogoUri(String brandLogoUri) {
        this.brandLogoUri = brandLogoUri;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public List<ResourceSet> getResourceSets() {
        return resourceSets;
    }

    public void setResourceSets(List<ResourceSet> resourceSets) {
        this.resourceSets = resourceSets;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeocoderResponse that = (GeocoderResponse) o;

        if (traceId != null ? !traceId.equals(that.traceId) : that.traceId != null) return false;
        if (authenticationResultCode != null ? !authenticationResultCode.equals(that.authenticationResultCode) : that.authenticationResultCode != null) return false;
        if (brandLogoUri != null ? !brandLogoUri.equals(that.brandLogoUri) : that.brandLogoUri != null) return false;
        if (copyright != null ? !copyright.equals(that.copyright) : that.copyright != null) return false;
        if (resourceSets != null ? !resourceSets.equals(that.resourceSets) : that.resourceSets != null) return false;
        if (statusCode != null ? !statusCode.equals(that.statusCode) : that.statusCode != null) return false;
        if (statusDescription != null ? !statusDescription.equals(that.statusDescription) : that.statusDescription != null) return false;
        
        return true;
    }

    @Override
    public int hashCode() {
        int result = authenticationResultCode != null ? authenticationResultCode.hashCode() : 0;
        result = 31 * result + (brandLogoUri != null ? brandLogoUri.hashCode() : 0);
        result = 31 * result + (copyright != null ? copyright.hashCode() : 0);
        result = 31 * result + (resourceSets != null ? resourceSets.hashCode() : 0);
        result = 31 * result + (statusCode != null ? statusCode.hashCode() : 0);
        result = 31 * result + (statusDescription != null ? statusDescription.hashCode() : 0);
        result = 31 * result + (traceId != null ? traceId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                "authenticationResultCode='" + authenticationResultCode + '\'' +
                ", brandLogoUri='" + brandLogoUri + '\'' +
                ", copyright='" + copyright + '\'' +
                ", resourceSets=" + resourceSets +
                ", statusCode=" + statusCode +
                ", statusDescription='" + statusDescription + '\'' +
                ", traceId='" + traceId + '\'' +
                '}';
    }
}