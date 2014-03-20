package com.bing.geocoder.model;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public enum Status {

	/**
	 * 200 - The request is successful.
	 */
    OK,
	/**
	 * 201 - A new resource is created.
	 */
    Created,
	/**
	 * 202 - The request has been accepted for processing.
	 */
    Accepted,
	/**
	 * 400 - The request contained an error.
	 */
    BadRequest,
	/**
	 * 401 - Access was denied. You may have entered your credentials incorrectly, or you might not have access to the requested resource or operation.
	 */
    Unauthorized,
	/**
	 * 403 - The request is for something forbidden. Authorization will not help.
	 */
    Forbidden,
	/**
	 * 404 - The requested resource was not found.
	 */
    NotFound,
	/**
	 * 500 - Your request could not be completed because there was a problem with the service.
	 */
    InternalServerError,
	/**
	 * 503 - There's a problem with the service right now. Please try again later.
	 */
    ServiceUnavailable;

    public static JsonDeserializer<Status> getJsonDeserializer() {
    	return new JsonDeserializer<Status>() {
			@Override
			public Status deserialize(JsonElement json, Type typeOf, JsonDeserializationContext context) throws JsonParseException {
				String enumStr = json.getAsString();
				enumStr = enumStr.replaceAll(" ", "");
				return Status.valueOf(enumStr);
			}
   		};
    }
    
}