@FunctionalTest
Feature: flight portal full test
 # with tables
 @SmokeTest  @RegressionTest  @End2End
Scenario:
    Given home page is loaded with origin and destination_ok
    | yyz	   |  BLR        |
  	| asc	   |  reg        |
    When homepage title is verified ok
    Then round trip journey is selected ok
    Then one adult is selected ok
    Then economy is selected ok
    Then origin is entered as YYZ ok
    Then destination is entered as BLR ok
    Then departure date is selcted ok
    Then Arrival date is selected ok
    And Search button is clicked ok
    
    @scenarioOne
    Scenario:
    Given home page is loaded with origin and destination_ok
    | yyz	   |  BLR        |
  	| asc	   |  reg        |
    When homepage title is verified ok
    Then round trip journey is selected ok
    Then one adult is selected ok
    Then economy is selected ok
    Then origin is entered as YYZ ok
    Then destination is entered as BLR ok
    Then departure date is selcted ok
    Then Arrival date is selected ok
    And Search button is clicked ok

  			