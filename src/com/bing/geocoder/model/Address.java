package com.bing.geocoder.model;

import java.io.Serializable;

/**
 * 
 * @author a37502y
 *	@link  http://msdn.microsoft.com/en-us/library/ff701726.aspx
 */
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    private String addressLine;
    private String locality;
    private String neighborhood;
    private String adminDistrict;
    private String adminDistrict2;
    private String formattedAddress;
    private String postalCode;
    private String countryRegion;
    private String countryRegionIso2;
    private String landmark;

    /**
     * 
     * @return The official street line of an address relative to the area, as specified by the Locality, or PostalCode, properties. 
     * 		Typical use of this element would be to provide a street address or any official address.
     * 		Example: 1 Microsoft Way
     */
    public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	/**
	 * 
	 * @return A string specifying the populated place for the address. 
	 * 		This typically refers to a city, but may refer to a suburb or a neighborhood in certain countries.
	 * 		Example: Seattle
	 */
	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	/**
	 * 
	 * @return A string specifying the neighborhood for an address.
	 * 		You must specify includeNeighborhood=1 in your request to return the neighborhood.
	 * 		Example: Ballard
	 */
	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	/**
	 * 
	 * @return A string specifying the subdivision name in the country or region for an address. 
	 * 		This element is typically treated as the first order administrative subdivision, but in some cases it is the second, third, or fourth order subdivision in a country, dependency, or region.
	 * 		Example: WA
	 */
	public String getAdminDistrict() {
		return adminDistrict;
	}

	public void setAdminDistrict(String adminDistrict) {
		this.adminDistrict = adminDistrict;
	}

	/**
	 * 
	 * @return A string specifying the subdivision name in the country or region for an address. 
	 * 		This element is used when there is another level of subdivision information for a location, such as the county.
	 * 		Example: King
	 */
	public String getAdminDistrict2() {
		return adminDistrict2;
	}

	public void setAdminDistrict2(String adminDistrict2) {
		this.adminDistrict2 = adminDistrict2;
	}

	/**
	 * 
	 * @return A string specifying the complete address. 
	 * 		This address may not include the country or region.
	 * 		Example: 1 Microsoft Way, Redmond, WA 98052-8300
	 */
	public String getFormattedAddress() {
		return formattedAddress;
	}

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}

	/**
	 * 
	 * @return A string specifying the post code, postal code, or ZIP Code of an address. 
	 * 		Example: 98178
	 */
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * 
	 * @return A string specifying the country or region name of an address.
	 * 		Example: United States
	 */
	public String getCountryRegion() {
		return countryRegion;
	}

	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}

	/**
	 * 
	 * @return A string specifying the two-letter ISO country code.	{@link http://www.iso.org/iso/country_codes.htm}
	 * 		You must specify include=ciso2 in your request to return this ISO country code.
	 * 		Example: US
	 */
	public String getCountryRegionIso2() {
		return countryRegionIso2;
	}

	public void setCountryRegionIso2(String countryRegionIso2) {
		this.countryRegionIso2 = countryRegionIso2;
	}

	/**
	 * 
	 * @return A string specifying the name of the landmark when there is a landmark associated with an address.
	 * 		Example: Eiffel Tower
	 */
	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address that = (Address) o;

        if (addressLine != null ? !addressLine.equals(that.addressLine) : that.addressLine != null) return false;
        if (locality != null ? !locality.equals(that.locality) : that.locality != null) return false;
        if (neighborhood != null ? !neighborhood.equals(that.neighborhood) : that.neighborhood != null) return false;
        if (adminDistrict != null ? !adminDistrict.equals(that.adminDistrict) : that.adminDistrict != null) return false;
        if (adminDistrict2 != null ? !adminDistrict2.equals(that.adminDistrict2) : that.adminDistrict2 != null) return false;
        if (formattedAddress != null ? !formattedAddress.equals(that.formattedAddress) : that.formattedAddress != null) return false;
        if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) return false;
        if (countryRegion != null ? !countryRegion.equals(that.countryRegion) : that.countryRegion != null) return false;
        if (countryRegionIso2 != null ? !countryRegionIso2.equals(that.countryRegionIso2) : that.countryRegionIso2 != null) return false;
        if (landmark != null ? !landmark.equals(that.landmark) : that.landmark != null) return false;        

        return true;
    }

    @Override
    public int hashCode() {
        int result = addressLine != null ? addressLine.hashCode() : 0;
        result = 31 * result + (locality != null ? locality.hashCode() : 0);
        result = 31 * result + (neighborhood != null ? neighborhood.hashCode() : 0);
        result = 31 * result + (adminDistrict != null ? adminDistrict.hashCode() : 0);
        result = 31 * result + (adminDistrict2 != null ? adminDistrict2.hashCode() : 0);
        result = 31 * result + (formattedAddress != null ? formattedAddress.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (countryRegion != null ? countryRegion.hashCode() : 0);
        result = 31 * result + (countryRegionIso2 != null ? countryRegionIso2.hashCode() : 0);
        result = 31 * result + (landmark != null ? landmark.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "addressLine='" + addressLine + '\'' +
                ", locality='" + locality + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", adminDistrict='" + adminDistrict + '\'' +
                ", adminDistrict2='" + adminDistrict2 + '\'' +
                ", formattedAddress='" + formattedAddress + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", countryRegion='" + countryRegion + '\'' +
                ", countryRegionIso2='" + countryRegionIso2 + '\'' +
                ", landmark='" + landmark + '\'' +
                '}';
    }
}
