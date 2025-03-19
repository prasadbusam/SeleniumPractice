package com.Rest_assure_Demo.Day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

class User
{
	private String name;
	private String job;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
}

public class Pojopayload {
	@Test
	public void payload2() {
		User data=new User();
		data.setJob("Devops");
		data.setName("balu");
		RestAssured
		.given()
		.contentType("application/json")
		.body(data)
		.when()
		.post("https://reqres.in/api/users")
		.then().log().all();
		
	}

}
