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
    Scenario:login as a driver
      Given the user is on the login page
      And user logged in as "salesmanager"
     # When the user should be able to login
      Then the title contains "Dashboard"
