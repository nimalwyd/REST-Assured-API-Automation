package com.qa.test;

import static io.restassured.RestAssured.given;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.base.BaseClass;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import com.qa.testUtil.TestUtil;;

public class TestApiScenario1 extends BaseClass {

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

	@Test(priority = 1, dataProvider = "getdata")
	public void testUsers(String testCaseNo, String toBeExecuted, String message) {
		// given().get("https://reqres.in/api/users?page=2").then().statusCode(200).log();
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/api/users?page=2");
		ResponseBody body = response.getBody();
		System.out.println("Response Body is: " + body.asString());
		response.then().statusCode(200);
	}

}
