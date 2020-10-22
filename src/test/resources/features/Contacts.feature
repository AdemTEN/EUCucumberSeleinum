Feature: Contacts page

  Scenario:Default page number

    Given the user is on the login page
    And the user enters the driver information
    When the user navigates to "Customers" "Contacts"
    Then verify that pageSubTitle is "Contacts"
    Then default page number should be 1

    #  #homework
    #  Scenario: login as a driver
    #    Given the user logged in as "usertype"
    #    Then the user should be able to login
    #    And the title contains "Dashboard"
    #    #driver,storemanager,salesmanager
    #   #you will have one step definition and it will handle differnet usertypes

@wip
    Scenario:login as a user
      Given the user is on the login page
      And the user logged in as "driver"
      Then the title contains "Dashboarda"



  Scenario: Menu Options
    Given the user is on the login page
    Then the user logged in as "salesmanager"
    Then the user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  Scenario: login as a given user
    Given the user is on the login page
    When the user logs in using following credentials
      | username  | user10      |
      | password  | UserUser123 |
      | firstname | Brenden     |
      | lastname  | Schneider   |
    Then the user should be able to login