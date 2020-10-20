@sales_manager_navigation
Feature: Sales managers should be able to navigate to pages using the top menu
@Fleet-Vehicle
  Scenario: Sales manager navigate to Fleet Vehicle module
    Given the user is on the login page
    When the user enters the sales manager information
    And the user should be able to login
    Then user navigate to Fleet Vehicle module
    Then verify that title is Vehicle

@Marketing-Campaigns
    Scenario: Sales manager navigate to Marketing Campaignss module
      Given the user is on the login page
      When the user enters the sales manager information
      And the user should be able to login
      Then user navigate to Marketing Campaigns module
      Then verify that title is Campaigns

@Activities-Calendar-Events
  Scenario: Sales manager navigate to Activities Caledars Events module
    Given the user is on the login page
    When the user enters the sales manager information
    And the user should be able to login
    Then user navigate to Activities Caledars Events module
    Then verify that title is Calendars