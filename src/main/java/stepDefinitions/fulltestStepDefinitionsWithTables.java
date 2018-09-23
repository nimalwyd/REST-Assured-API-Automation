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

/*

package stepDefinitions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class fulltestStepDefinitionsWithTables {
//DataTable with list
	WebDriver driver;
	
@Before
public void setUp()
{

	System.out.println("initial setup..");
	
}

@After
public void tearDown()
{
	System.out.println("final  setup..");

	
}	
	
	@Given("^home page is loaded with origin and destination_ok$")
	public void home_page_is_loaded_with_origin_and_destination_ok(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nimal\\eclipse-workspace\\NimalAutomationFramework\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.get("https://www.ca.kayak.com/flights");
		Thread.sleep(1000);
		List<WebElement> fromPlace = driver.findElements(By.xpath("//*[contains(@id,'-origin-airport-display-inner')]"));
		fromPlace.get(0).click();
		Thread.sleep(1000);

		List<WebElement> fromPlaceTextBox = driver.findElements(By.xpath("//*[contains(@id,'-origin-airport-smarty-wrapper')]//*[contains(@id,'-origin-airport')]"));
		fromPlaceTextBox.get(0).sendKeys(data.get(0).get(0)); //0th row 0th column		
		
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
public void economy_is_selected_ok() {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^origin is entered as YYZ ok$")
public void origin_is_entered_as_YYZ_ok() {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^destination is entered as BLR ok$")
public void destination_is_entered_as_BLR_ok() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^departure date is selcted ok$")
public void departure_date_is_selcted_ok()  {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^Arrival date is selected ok$")
public void arrival_date_is_selected_ok() {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^Search button is clicked ok$")
public void search_button_is_clicked_ok(){
    // Write code here that turns the phrase above into concrete actions
}



}
*/