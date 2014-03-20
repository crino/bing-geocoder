package com.bing.geocoder.model;

import java.io.Serializable;
import java.util.List;

public class Point implements Serializable {
    private static final long serialVersionUID = 1L;

    private Type type;
    private List<Double> coordinates;

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point that = (Point) o;

        if (coordinates != null ? !coordinates.equals(that.coordinates) : that.coordinates != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = coordinates != null ? coordinates.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
        		"type=" + type +
        		", coordinates=" + coordinates +
                '}';
    }
}