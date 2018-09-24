package com.qa.test;

import static io.restassured.RestAssured.given;
import org.hamcrest.Matcher;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.gson.Gson;
import com.qa.base.BaseClass;
import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import com.qa.testUtil.TestUtil;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java. util. *;

public class TestApiScenario1<T,K,V> extends BaseClass {

	TestUtil testUtil;
	String sheetName = "Sheet3";


	public TestApiScenario1() {
		super();
		TestUtil testUtil;
	}

	@BeforeMethod
	public void setUp() {
		initilisation();
		testUtil = new TestUtil();

	}

	@DataProvider
	public Object[][] getdata() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;

	}

	// query with a specific end point without passing query parameters
	@Test(priority = 1, groups = "Basic Tests", dataProvider = "getdata")
	public void getUsers(String testCaseNo, String toBeExecuted, String message) {

		// given().get("https://reqres.in/api/users?page=2").then().statusCode(200).log();
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get(prop.getProperty("getUsersApiLink"));
		ResponseBody body = response.getBody();
		System.out.println("Response Body is: " + body.asString());
		response.then().statusCode(200);
	}

	// Query with passing query parameters
	@Test(priority = 2, groups = "Basic Tests")
	public void getSpecificUser() {

		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get(prop.getProperty("getUsersApiLink") + "?id=2");
		ResponseBody body = response.getBody();
		System.out.println("Response Body is: " + body.asString());
		response.then().statusCode(200);
		// verify the response
		Map<K, V> company = response.jsonPath().getMap("data");
		assertEquals(company.get("id"), 2);
		

	}

	// post query

	@Test(priority = 3, groups = "Basic Tests")
	public void postSpecificUser() {

		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "Nimal");
		requestParams.put("job", "Test Automation Developer");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.post(prop.getProperty("createUserLink"));
		response.then().statusCode(201);
		// verify the response
		//inline validation
		//hard assertion
		response.then().body("name",equalTo("Nimal")).body("job",equalTo("Test Automation Developer"));
		//soft assertion
		response.then().body("name",equalTo("Nimal"),"job",equalTo("Test Automation Developer"));
		//path validation
		//hard validation
		Assert.assertEquals(response.path("name"), "Nimal");
		Assert.assertEquals(response.path("job"), "Test Automation Developer");

		//soft validation
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(response.path("name"), "Nimal");
		softAssert.assertEquals(response.path("job"), "Test Automation Developer");
		softAssert.assertAll();
		
	}

}
