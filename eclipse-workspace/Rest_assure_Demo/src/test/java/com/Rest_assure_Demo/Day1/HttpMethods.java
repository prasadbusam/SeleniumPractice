package com.Rest_assure_Demo.Day1;

import io.restassured.RestAssured;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class HttpMethods {
	@Test(priority=2)
    public void getSingleUser() {
		RestAssured
    	.given()
    	.when()
    	.get("http://localhost:3000/Students")
    	.then()
    	.log().all();
    	
    }
	@Test(priority=1)
	public void getSingleUser1() {
		Response res = RestAssured
		.given()
		.when()
		.get("http://localhost:3000/Students");
		res.then().log().body();
		res.then().log().headers();
		res.then().log().status();
		
	}
}
