package com.trycloud.step_definitions;

import com.trycloud.pages.Customize_Page;
import com.trycloud.pages.Dashboard_Page;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.Status_Page;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Dashboard_StepDefs {

    Dashboard_Page dashboard_page = new Dashboard_Page();
    LoginPage loginPage = new LoginPage();
    Customize_Page customize_page = new Customize_Page();
    Status_Page status_page = new Status_Page();

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


    @Then("user clicks on Customize button")
    public void userClicksOnCustomizeButton() {
        dashboard_page.customizeButton.click();
    }


    @Then("user can select and unselect on Status widget")
    public void userCanSelectAndUnselectOnStatusWidget() {
        customize_page.statusWidget.click();
        customize_page.statusWidget.click();
    }

    @Then("user can select and unselect on Weather widget")
    public void userCanSelectAndUnselectOnWeatherWidget() {
        customize_page.weatherWidget.click();
        customize_page.weatherWidget.click();
    }

    @Then("user can select and unselect on Upcoming events widget")
    public void userCanSelectAndUnselectOnUpcomingEventsWidget() {
        customize_page.calendarWidget.click();
        customize_page.calendarWidget.click();
    }

    @Then("user can select and unselect on Upcoming cards widget")
    public void userCanSelectAndUnselectOnUpcomingCardsWidget() {
        customize_page.deckWidget.click();
        customize_page.deckWidget.click();
    }

    @Then("user can select and unselect on Important mail widget")
    public void userCanSelectAndUnselectOnImportantMailWidget() {
        customize_page.importantMailWidget.click();
        customize_page.importantMailWidget.click();
    }

    @Then("user can select and unselect on Unread mail widget")
    public void userCanSelectAndUnselectOnUnreadMailWidget() {
        customize_page.unreadMailWidget.click();
        customize_page.unreadMailWidget.click();
    }

    @Then("user can select and unselect on Recommended files widget")
    public void userCanSelectAndUnselectOnRecommendedFilesWidget() {
        customize_page.recommendationsWidget.click();
        customize_page.recommendationsWidget.click();
    }

    @Then("user can select and unselect on Talk mentions widget")
    public void userCanSelectAndUnselectOnTalkMentionsWidget() {
        customize_page.talkWidget.click();
        customize_page.talkWidget.click();
    }

    @Then("user can select and unselect on Recent statuses widget")
    public void userCanSelectAndUnselectOnRecentStatusesWidget() {
        customize_page.recentStatusWidget.click();
        customize_page.recentStatusWidget.click();
    }

    @When("user clicks on Customize button if Status button is not displayed")
    public void userClicksOnCustomizeButtonIfStatusButtonIsNotDisplayed() {

            dashboard_page.customizeButton.click();
            customize_page.statusWidget.click();

    }

    @Then("user selects Status widget and closes customize page to land on dashboard page")
    public void userSelectsStatusWidgetAndClosesCustomizePageToLandOnDashboardPage() {
        if (!customize_page.statusWidget.isSelected()){
            customize_page.statusWidget.click();
        }

        customize_page.xButton.click();
    }

    @Then("user clicks on Status button")
    public void user_clicks_on_status_button() {
        dashboard_page.onlineStatusButton.click();

    }
    @Then("user can see and select the following options")
    public void user_can_see_and_select_the_following_options(List<WebElement> onlineStatuses) {

        for (WebElement each : onlineStatuses) {
            Assert.assertTrue(status_page.onlineStatus.isDisplayed());
            status_page.onlineStatus.click();
        }



    }



}
