package com.bing.geocoder.model;

import java.util.List;

public class GeocodePoint {

    private Type type;
    private List<Double> coordinates;
    private CalculationMethod calculationMethod;
    private List<UsageType> usageTypes;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public CalculationMethod getCalculationMethod() {
        return calculationMethod;
    }

    public void setCalculationMethod(CalculationMethod calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    public List<UsageType> getUsageTypes() {
        return usageTypes;
    }

    public void setUsageTypes(List<UsageType> usageTypes) {
        this.usageTypes = usageTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeocodePoint that = (GeocodePoint) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (coordinates != null ? !coordinates.equals(that.coordinates) : that.coordinates != null) return false;
        if (calculationMethod != null ? !calculationMethod.equals(that.calculationMethod) : that.calculationMethod != null) return false;
        if (usageTypes != null ? !usageTypes.equals(that.usageTypes) : that.usageTypes != null) return false;
        
        return true;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (coordinates != null ? coordinates.hashCode() : 0);
        result = 31 * result + (calculationMethod != null ? calculationMethod.hashCode() : 0);
        result = 31 * result + (usageTypes != null ? usageTypes.hashCode() : 0);
        return result;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                "type=" + type +
                ", coordinates=" + coordinates +
                ", calculationMethod=" + calculationMethod +
                ", usageTypes=" + usageTypes +
                '}';
    }
    
}
