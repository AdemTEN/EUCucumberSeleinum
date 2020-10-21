@sales_manager_navigation
Feature: Sales managers should be able to navigate to pages using the top menu

@Fleet-Vehicle
  Scenario: Sales manager navigate to Fleet Vehicle
    Given the user is on the login page
    And the user enters the sales manager information
    When user navigate to Fleet Vehicle
    Then verify that title is Vehicle

@Marketing-Campaigns @db
    Scenario: Sales manager navigate to Marketing Campaigns
      Given the user is on the login page
      And the user enters the sales manager information
      When user navigate to Marketing Campaigns
      Then verify that title is Campaigns

@Activities-Calendar-Events
  Scenario: Sales manager navigate to Activities Caledars Events
    Given the user is on the login page
    And the user enters the sales manager information
    When user navigate to Activities Caledars Events
    Then verify that title is Calendars