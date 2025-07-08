package com.api.base;

import static io.restassured.RestAssured.*;

import com.api.models.requests.LoginRequest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService { // Wrapper for Rest Assured!!

	// Handle Base URI
	// For creating the request
	// for handling the response
	private static final String BASE_URL="http://64.227.160.186:8080";
	private RequestSpecification requestSpecification;

	public BaseService() {
		requestSpecification=given().baseUri(BASE_URL);
	}

	protected Response postRequest(Object payLoad,String endPoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payLoad).post(endPoint);
	}

}
