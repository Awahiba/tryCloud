package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login_StepDefinitions {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("user1")){
            username = ConfigurationReader.getProperty("User1_username");
            password = ConfigurationReader.getProperty("User_password");

        }else if(userType.equalsIgnoreCase("user2")){
            username = ConfigurationReader.getProperty("User2_username");
            password = ConfigurationReader.getProperty("User_password");

        }else if(userType.equalsIgnoreCase("user3")){
            username = ConfigurationReader.getProperty("User3_username");
            password = ConfigurationReader.getProperty("User_password");


        }else if(userType.equalsIgnoreCase("employee1")){
            username = ConfigurationReader.getProperty("Employee1_username");
            password = ConfigurationReader.getProperty("Employee_password");

        }else if(userType.equalsIgnoreCase("employee2")){
            username = ConfigurationReader.getProperty("Employee2_username");
            password = ConfigurationReader.getProperty("Employee_password");

        }else if(userType.equalsIgnoreCase("employee3")){
            username = ConfigurationReader.getProperty("Employee3_username");
            password = ConfigurationReader.getProperty("Employee_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }


    @Then("the user is on the home page")
    public void theUserIsOnTheHomePage() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.trycloud.net/index.php/apps/dashboard/"));
    }
}
