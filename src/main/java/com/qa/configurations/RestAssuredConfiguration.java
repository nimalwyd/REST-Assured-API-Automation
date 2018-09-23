package com.qa.configurations;

import org.testng.annotations.BeforeSuite;
import com.qa.base.BaseClass;
import io.restassured.RestAssured;

public class RestAssuredConfiguration extends BaseClass {
	
	public RestAssuredConfiguration() {
		super();
	}

	@BeforeSuite(alwaysRun = true)
	public void Configuration() {
		RestAssured.baseURI = "https://reqres.in";
	}
}
