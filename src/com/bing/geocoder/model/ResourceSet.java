package com.bing.geocoder.model;

import java.io.Serializable;
import java.util.List;

public class ResourceSet implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Resource> resources;
	private Integer estimatedTotal;

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public Integer getEstimatedTotal() {
		return estimatedTotal;
	}

	public void setEstimatedTotal(Integer estimatedTotal) {
		this.estimatedTotal = estimatedTotal;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		ResourceSet that = (ResourceSet) o;

		if (resources != null ? !resources.equals(that.resources) : that.resources != null) return false;
		if (estimatedTotal != null ? !estimatedTotal.equals(that.estimatedTotal) : that.estimatedTotal != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = resources != null ? resources.hashCode() : 0;
		result = 31 * result + (estimatedTotal != null ? estimatedTotal.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " {" 
				+ "estimatedTotal=" + estimatedTotal + 
				", resources=" + resources + 
				'}';
	}
}
