package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;

public class NavigationMenuStepDefs {

    @Then("user navigate to Fleet Vehicle")
    public void user_navigate_to_Fleet_Vehicle_module() {
        System.out.println("Navigate to Flee Vehicle Module");
    }

    @Then("verify that title is Vehicle")
    public void verify_that_title_is_Vehicle() {
        System.out.println("Title is vehicle");


    }

    @Then("user navigate to Marketing Campaigns")
    public void user_navigate_to_Marketing_Campaigns_module() {
        System.out.println("Navigate to Marketing Campaigns module");

    }

    @Then("verify that title is Campaigns")
    public void verify_that_title_is_Campaigns() {
        System.out.println("Title is Campaigns");

    }

    @Then("user navigate to Activities Caledars Events")
    public void user_navigate_to_Activities_Caledars_Events_module() {
        System.out.println("Navigate to Activities Calendar Events module");

    }

    @Then("verify that title is Calendars")
    public void verify_that_title_is_Calendars() {
        System.out.println("Title is Calendars");

    }

}
