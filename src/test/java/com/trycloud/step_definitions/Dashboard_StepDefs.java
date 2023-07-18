package com.trycloud.step_definitions;

import com.trycloud.pages.Dashboard_Page;
import com.trycloud.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class Dashboard_StepDefs {

    Dashboard_Page dashboard_page = new Dashboard_Page();
    LoginPage loginPage = new LoginPage();

    @Given("user is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        loginPage.login("User1" , "Userpass123");
    }


    @And("user sees Dashboard Module")
    public void userSeesDashboardModule() {
        Assert.assertTrue(dashboard_page.dashboardModule.isDisplayed());
    }

    @And("user sees Files Module")
    public void userSeesFilesModule() {
        Assert.assertTrue(dashboard_page.filesModule.isDisplayed());
    }

    @And("user sees Photos Module")
    public void userSeesPhotosModule() {
        Assert.assertTrue(dashboard_page.photosModule.isDisplayed());
    }

    @And("user sees Activity Module")
    public void userSeesActivityModule() {
        Assert.assertTrue(dashboard_page.activityModule.isDisplayed());
    }

    @And("user sees Talk Module")
    public void userSeesTalkModule() {
        Assert.assertTrue(dashboard_page.talkModule.isDisplayed());
    }

    @And("user sees Mail Module")
    public void userSeesMailModule() {
        Assert.assertTrue(dashboard_page.mailModule.isDisplayed());
    }

    @And("user sees Contact Module")
    public void userSeesContactModule() {
        Assert.assertTrue(dashboard_page.contactModule.isDisplayed());
    }

    @And("user sees Circles Module")
    public void userSeesCirclesModule() {
        Assert.assertTrue(dashboard_page.circlesModule.isDisplayed());
    }

    @And("user sees Calender Module")
    public void userSeesCalenderModule() {
        Assert.assertTrue(dashboard_page.calenderModule.isDisplayed());
    }

    @And("user sees Deck Module")
    public void userSeesDeckModule() {
        Assert.assertTrue(dashboard_page.deckModule.isDisplayed());
    }

    @And("user sees Username displayed")
    public void userSeesUsernameDisplayed() {
        dashboard_page.userIconButton.click();
        Assert.assertTrue(dashboard_page.username.isDisplayed());
    }

    
}
