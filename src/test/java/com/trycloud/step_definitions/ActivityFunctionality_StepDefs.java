package com.trycloud.step_definitions;

import com.trycloud.pages.ActivityPage;
import com.trycloud.pages.Dashboard_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ActivityFunctionality_StepDefs {


    ActivityPage activityPage = new ActivityPage();
    Dashboard_Page dashboard_page = new Dashboard_Page();
  //  Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
    @Given("user click on Activity on navigation menu")
    public void user_click_on_activity_on_navigation_menu() {
       dashboard_page.activityModule.click();

    }



    @Then("user should see and verify all listed item under Activity")
    public void userShouldSeeAndVerifyAllListedItemUnderActivity(List<String>expectedList) {

        List<String> actualList= new ArrayList<>();
        for(WebElement each : activityPage.listOfAllItems) {
            actualList.add(each.getText());
        }

        actualList.remove(0);   // remove --> "All activities"

        Assert.assertEquals(expectedList,actualList);

    }


    @And("user click on All Activities")
    public void userClickOnAllActivities() {
        activityPage.allActivitiesButton.click();

    }

    @Then("user must verify all activities is in order from newest to oldest")
    public void userMustVerifyAllActivitiesIsInOrderFromNewestToOldest() {

        activityPage.scrollToTheEndOfAllActivitesPage();

        List<String> datesString= new ArrayList<>();

        for(WebElement eachDate :  activityPage.listOfAllDates){
            datesString.add(eachDate.getAttribute("data-original-title"));
    }
        List<LocalDateTime> dateTimesList = BrowserUtils.convertListOfStringtoListOfDateAndTime(datesString);

         boolean isOrdered =   BrowserUtils.isOrderedNewestToOldest(dateTimesList);

         Assert.assertTrue(isOrdered);
    }

    @Then("user scroll to the end of the page and see {string}")
    public void userScrollToTheEndOfThePageAndSee(String expectedText) {

        activityPage.scrollToTheEndOfAllActivitesPage();

        wait.until(ExpectedConditions.visibilityOf(activityPage.noMoreEventsToLoadMessage));

        String actualText = activityPage.noMoreEventsToLoadMessage.getText();

        Assert.assertEquals(expectedText, actualText);

    }
}
