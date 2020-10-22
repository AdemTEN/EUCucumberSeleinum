package com.vytrack.step_definitions;


import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

    @Then("user navigate to Activities Calendars Events")
    public void user_navigate_to_Activities_Calendars_Events_module() {
        System.out.println("Navigate to Activities Calendar Events module");

    }

    @Then("verify that title is Calendars")
    public void verify_that_title_is_Calendars() {
        System.out.println("Title is Calendars");

    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String model) {

        new DashboardPage().navigateToModule(tab,model);


    }
    @Then("verify that pageSubTitle is {string}")
    public void verify_that_pageSubTitle_is(String expectedPageSubTitle) {
        ContactsPage contactsPage = new ContactsPage();
        BrowserUtils.waitFor(10);
        Assert.assertEquals(expectedPageSubTitle,contactsPage.getPageSubTitle());
        System.out.println("contactsPage.getPageSubTitle() = " + contactsPage.getPageSubTitle());

    }





    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNumber) {

        ContactsPage contactsPage = new ContactsPage();

        BrowserUtils.waitFor(3);
        Integer actualpageNumber = Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(expectedPageNumber,actualpageNumber);
        System.out.println("contactsPage.pageNumber.getAttribute(\"value\") = " + contactsPage.pageNumber.getAttribute("value"));
    }

}
