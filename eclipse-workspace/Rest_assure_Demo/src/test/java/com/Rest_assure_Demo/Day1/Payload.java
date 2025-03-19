package com.Rest_assure_Demo.Day1;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Payload {
	private String data;

	@Test
	public void payloasd1() {
		
		Map<String,String>obj=new HashMap<>();
		obj.put("name", "Prasad");
		obj.put("job", "tester");
		RestAssured
		.given()
		.contentType("application/json")
		.body(obj)
		.when()
		.post("https://reqres.in/api/users")
		.then().log().all();
		
		
	}

}
