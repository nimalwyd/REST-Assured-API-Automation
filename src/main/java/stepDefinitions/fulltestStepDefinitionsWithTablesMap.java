/**********************************************************************;
* Project           : Selenium webdriver Mobile automation front end Hybrid framework
*
* Program name      : AppiumAutomationFramework
*
* Author            : Nimal krishna
*
* Date created      : 20160816
*
* Purpose           : Simple Gui Web portal automation framework
*
* Revision History  :
*
* Date        Author      Ref    Revision (Date in YYYYMMDD format) 
* 20180818    Nimal      1      added BDD,TDD characters to the framework 
*
|**********************************************************************/

package stepDefinitions;

import java.util.List;
import java.util.Map;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fulltestStepDefinitionsWithTablesMap {
// DataTable with Maps	
//Global hooks
@Before(order=1)
public void setUp()
{

	System.out.println("initial setup..");
	
}


//Global hooks
@After(order=1)
public void tearDown()
{
	System.out.println("final  setup..");

	
}

@Before("@scenarioOne")  //local hook, only for first scenario
public void setUpScenarioOne()
{

	System.out.println("initialising  scenarioOne..");
	
}
//Global hooks
@Before(order=0)
public void setUp1()
{

	System.out.println("initial setup..");
	
}


//Global hooks
@After(order=0)
public void tearDown1()
{
	System.out.println("final  setup..");

	
}

	
	@Given("^home page is loaded with origin and destination_ok$")
	public void home_page_is_loaded_with_origin_and_destination_ok(DataTable arg1) throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions

	}


@When("^homepage title is verified ok$")
public void homepage_title_is_verified_ok()  {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^round trip journey is selected ok$")
public void round_trip_journey_is_selected_ok()  {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^one adult is selected ok$")
public void one_adult_is_selected_ok()  {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^economy is selected ok$")
public void economy_is_selected_ok()  {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^origin is entered as YYZ ok$")
public void origin_is_entered_as_YYZ_ok() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^destination is entered as BLR ok$")
public void destination_is_entered_as_BLR_ok(){
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^departure date is selcted ok$")
public void departure_date_is_selcted_ok() {
    // Write code here that turns the phrase above into concrete actions
}

@Then("^Arrival date is selected ok$")
public void arrival_date_is_selected_ok() {
    // Write code here that turns the phrase above into concrete actions
}

@Then("^Search button is clicked ok$")
public void search_button_is_clicked_ok() {
    // Write code here that turns the phrase above into concrete actions
}


}
