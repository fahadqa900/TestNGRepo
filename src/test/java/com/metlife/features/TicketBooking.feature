@all @booking
Feature: Ticket booking
  This file covers the following scenarios
  1.No Busses Found
  2.One Bus Found
  3.Multiple Busses Found

  @sanity @negative
  Scenario: No Busses Found
    Given I log into redbus.in as a user
    When I update the source as "Jaipur"
    And I update the destination as "Chennai"
    And I choose the date as 4th of next month
    And I click on Search Busses
    Then I should get the message as "Oops! No Busses Found"

 @smoke @positive
  Scenario Outline: One Bus Found
    Given I log into redbus.in as a user
    When I update the source as "<src>"
    And I update the destination as "<dest>"
    And I choose the date as 4th of next month
    And I click on Search Busses
    Then I should see one bus available
    Examples:
    |src|dest|
    |chennai|bengaluru|
    |bengaluru|Hyderabad|

