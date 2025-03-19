package com.Rest_assure_Demo.Day1;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;


import io.restassured.RestAssured;

public class JsonObjectPayload {
	@Test
	public void payload2() {
		JSONObject data=new JSONObject();
		data.put("name", "jitendra");
		data.put("job", "selenium");
		RestAssured
		.given()
		.contentType("application/json")
		.body(data.toString())
		.when()
		.post("https://reqres.in/api/users")
		.then().log().all();
		
	}

}
