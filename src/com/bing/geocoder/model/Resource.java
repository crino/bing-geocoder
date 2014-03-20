package com.bing.geocoder.model;

import java.io.Serializable;
import java.util.List;

public class Resource implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Point point;
    private List<Double> bbox;
    private EntityType entityType;
    private Address address;    
    private Confidence confidence;
    private List<MatchCode> matchCodes;    
    private List<GeocodePoint> geocodePoints;
    //queryParseValues

    public List<Double> getBbox() {
        return bbox;
    }

    public void setBbox(List<Double> bbox) {
        this.bbox = bbox;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Confidence getConfidence() {
        return confidence;
    }

    public void setConfidence(Confidence confidence) {
        this.confidence = confidence;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public List<GeocodePoint> getGeocodePoints() {
        return geocodePoints;
    }

    public void setGeocodePoints(List<GeocodePoint> geocodePoints) {
        this.geocodePoints = geocodePoints;
    }

    public List<MatchCode> getMatchCodes() {
        return matchCodes;
    }

    public void setMatchCodes(List<MatchCode> matchCodes) {
        this.matchCodes = matchCodes;
    }

    @Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Resource that = (Resource) o;

		if (bbox != null ? !bbox.equals(that.bbox) : that.bbox != null) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (point != null ? !point.equals(that.point) : that.point != null) return false;
		if (address != null ? !address.equals(that.address) : that.address != null) return false;
		if (confidence != null ? !confidence.equals(that.confidence) : that.confidence != null) return false;
		if (entityType != null ? !entityType.equals(that.entityType) : that.entityType != null) return false;
		if (geocodePoints != null ? !geocodePoints.equals(that.geocodePoints) : that.geocodePoints != null) return false;
		if (matchCodes != null ? !matchCodes.equals(that.matchCodes) : that.matchCodes != null) return false;
	    
		return true;
	}

	@Override
	public int hashCode() {
		int result = bbox != null ? bbox.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (point != null ? point.hashCode() : 0);
		result = 31 * result + (address != null ? address.hashCode() : 0);
		result = 31 * result + (confidence != null ? confidence.hashCode() : 0);
		result = 31 * result + (entityType != null ? entityType.hashCode() : 0);
		result = 31 * result + (geocodePoints != null ? geocodePoints.hashCode() : 0);
		result = 31 * result + (matchCodes != null ? matchCodes.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " {" 
				+ "bbox=" + bbox + 
				", name='" + name + '\'' +
				", point=" + point +
				", address=" + address +
				", confidence=" + confidence +
				", entityType=" + entityType +
				", geocodePoints=" + geocodePoints +
				", matchCodes=" + matchCodes +
				'}';
	}
}