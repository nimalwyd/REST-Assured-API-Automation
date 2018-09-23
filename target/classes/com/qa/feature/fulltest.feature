@FunctionalTest
Feature: flight portal full test
# without example keyword 
#  Scenario:
#    Given home page is loaded with "YYZ" and "BLR"
#    When homepage title is verified
#    Then round trip journey is selected
#    Then one adult is selected
#    Then economy is selected
#    Then origin is entered as YYZ
#    Then destination is entered as BLR
#    Then departure date is selcted
#    Then Arrival date is selected
#    And Search button is clicked
   
   
# with example keyword
@SmokeTest  @RegresstionTest @End2End
Scenario Outline:
    Given home page is loaded with "<origin>" and "<destination>"
    When homepage title is verified
    Then round trip journey is selected
    Then one adult is selected
    Then economy is selected
    Then origin is entered as YYZ
    Then destination is entered as BLR
    Then departure date is selcted
    Then Arrival date is selected
    And Search button is clicked
Examples:
  			| origin  | destination  |
  			| yyz	   |  BLR        |
  			| asc	   |  reg        |
  			