package com.vytrack.step_definitions;

import com.vytrack.pages.ContactInfoPage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.DBUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {

        System.out.println(menuOptions.size());
        System.out.println(menuOptions);

        BrowserUtils.waitFor(2);
        //get the list of webelement and convert them to list of string and assert
        List<String> actualOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);

        Assert.assertEquals(menuOptions,actualOptions);
        System.out.println("menuOptions = " + menuOptions);
        System.out.println("actualOptions = " + actualOptions);
    }

    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userInfo) {
        System.out.println(userInfo);
        //use map information to login and also verify firstname and lastname
        //login with map info
        new LoginPage().login(userInfo.get("username"), userInfo.get("password"));

        //verify first name and lastname
        String expectedResult = userInfo.get("firstname") + " " + userInfo.get("lastname");
        String actualResult = new DashboardPage().getUserName();

        Assert.assertEquals(expectedResult,actualResult);

    }

    @When("the user clicks the {string} from contacts")
    public void the_user_clicks_the_from_contacts(String email) {
       BrowserUtils.waitFor(2);
        //we have ready method to find email webwelement in pom class before
        //we just get the email from feature file and pass to that method and will click that webelement
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.getContactEmail(email).click();


    }

    @Then("the information should be same with database")
    public void the_information_should_be_same_with_database() {
       BrowserUtils.waitFor(2);
        //get information from UI
        ContactInfoPage contactInfoPage = new ContactInfoPage();
        String actualFullName = contactInfoPage.contactFullName.getText();
        String actualEmail = contactInfoPage.email.getText();
        String actualPhone = contactInfoPage.phone.getText();

        System.out.println("actualFullName = " + actualFullName);
        System.out.println("actualEmail = " + actualEmail);
        System.out.println("actualPhone = " + actualPhone);



        //get information from database
        //create connection to db


        //we are getting only one row of result
        //query for retrieving firstname,lastname,email,phone
        String query = "select concat (c. first_name,' ', c.last_name) as  \"full_name\", e.email, p.phone\n" +
                "from orocrm_contact c inner join orocrm_contact_email e\n" +
                "on c.id = e.owner_id\n" +
                "inner join orocrm_contact_phone p\n" +
                "on c.id = p.owner_id\n" +
                "where e.email = 'dragana.ivanovic@gmail.com';\n";

        //get info and save in the map
        Map<String, Object> rowMap = DBUtils.getRowMap(query);
        String expectedFullName = (String) rowMap.get("full_name");
        String expectedphone = (String) rowMap.get("phone");
        String expectedEmail = (String) rowMap.get("email");

        System.out.println("expectedFullName = " + expectedFullName);
        System.out.println("expectedphone = " + expectedphone);
        System.out.println("expectedEmail = " + expectedEmail);




        System.out.println(rowMap.toString());

        //close connection

        //assertion

        //assertion, Compare UI against to DB
        Assert.assertEquals(actualFullName,expectedFullName);
        Assert.assertEquals(actualPhone,expectedphone);
        Assert.assertEquals(actualEmail,expectedEmail);



    }
    @Then("the information for {string} should be same with database")
    public void the_information_for_should_be_same_with_database(String email) {

        BrowserUtils.waitFor(2);
        //get information from UI
        ContactInfoPage contactInfoPage = new ContactInfoPage();
        String actualFullName = contactInfoPage.contactFullName.getText();
        String actualEmail = contactInfoPage.email.getText();
        String actualPhone = contactInfoPage.phone.getText();

        System.out.println("actualFullName = " + actualFullName);
        System.out.println("actualEmail = " + actualEmail);
        System.out.println("actualPhone = " + actualPhone);



        //get information from database
        //create connection to db


        //we are getting only one row of result
        //query for retrieving firstname,lastname,email,phone
        String query = "select concat (c. first_name,' ', c.last_name) as  \"full_name\", e.email, p.phone\n" +
                "from orocrm_contact c inner join orocrm_contact_email e\n" +
                "on c.id = e.owner_id\n" +
                "inner join orocrm_contact_phone p\n" +
                "on c.id = p.owner_id\n" +
                "where e.email = '"+email+"';\n";

        //get info and save in the map
        Map<String, Object> rowMap = DBUtils.getRowMap(query);
        String expectedFullName = (String) rowMap.get("full_name");
        String expectedphone = (String) rowMap.get("phone");
        String expectedEmail = (String) rowMap.get("email");

        System.out.println("expectedFullName = " + expectedFullName);
        System.out.println("expectedphone = " + expectedphone);
        System.out.println("expectedEmail = " + expectedEmail);




        System.out.println(rowMap.toString());

        //close connection

        //assertion

        //assertion, Compare UI against to DB
        Assert.assertEquals(actualFullName,expectedFullName);
        Assert.assertEquals(actualPhone,expectedphone);
        Assert.assertEquals(actualEmail,expectedEmail);


    }






}
