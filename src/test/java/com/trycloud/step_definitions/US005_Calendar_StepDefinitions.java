package com.trycloud.step_definitions;

import com.trycloud.pages.US005_Calendar_Page;
import com.trycloud.pages.Dashboard_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.Time;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class US005_Calendar_StepDefinitions {

    Dashboard_Page dashboard_page = new Dashboard_Page();
    US005_Calendar_Page calendarPage = new US005_Calendar_Page();


    @Given("the user should be on the Calendar module")
    public void theUserShouldBeOnTheCalendarModule() {

        dashboard_page.calenderModule.click();
    }


    @When("the user click on Calendar views option button")
    public void the_user_click_on_calendar_views_option_button() {

        BrowserUtils.waitForClickablility(calendarPage.optionBtn, 10).click();
    }

    @And("the user click on Day option")
    public void theUserClickOnDayOption() {

        calendarPage.dayOptional.click();
    }

    LocalDate today = LocalDate.now();
    DateTimeFormatter df = DateTimeFormatter.ofPattern("EEE M/d/y");

    @Then("the user sees the daily calendar view")
    public void theUserSeesTheDailyCalendarView(List<String> expectedDayTime) {

        List<String> actualDayTime = BrowserUtils.getElementsText(calendarPage.timeElement);

        Assert.assertEquals(expectedDayTime, actualDayTime);

        String expectedDate = df.format(today);
        String actualDate = String.valueOf(calendarPage.currentDayForDay.getText());

        Assert.assertEquals(expectedDate, actualDate + "");
    }

    @When("the user click on Week option")
    public void the_user_click_on_week_option() {

        calendarPage.weekOptional.click();
    }

    @Then("the user sees the weekly calendar view")
    public void the_user_sees_the_weekly_calendar_view(List<String> expectedDayOfWeek) {

        List<String> actualDayOfWeek = BrowserUtils.getElementsText(calendarPage.daysOfWeek);

        Assert.assertEquals(expectedDayOfWeek, actualDayOfWeek);

        String expectedDate = df.format(today);
        String actualDate = String.valueOf(calendarPage.currentDayForWeek.getText());

        Assert.assertEquals(expectedDate, actualDate + "");

    }

    @And("the user click on Month option")
    public void theUserClickOnMonthOption() {

        calendarPage.monthOptional.click();
    }

    @Then("the user sees the monthly calendar view")
    public void theUserSeesTheMonthlyCalendarView(List<String> expectedDayWeekOfMonth) {

        List<String> actualDayWeekOfMonth = BrowserUtils.getElementsText(calendarPage.daysWeekOfMonth);

        Assert.assertEquals(expectedDayWeekOfMonth, actualDayWeekOfMonth);

        String daysOfMonth = String.valueOf(calendarPage.currentDayForMonth.contains(today));


    }


    @When("the user clicks on New event")
    public void theUserClicksOnNewEvent() {
        calendarPage.newEventByn.click();

    }

    @And("the user filled in the Event title field")
    public void theUserFilledInTheEventTitleField() {
        calendarPage.eventTitleField.sendKeys("Demo meeting!");
    }

    @And("the user filled in the from date at time field")
    public void theUserFilledInTheFromDateAndTimeField() {
        calendarPage.fromDateField.click();
        calendarPage.fromDateField.clear();
        calendarPage.fromDateField.sendKeys("from 07/21/2023 at 2:00 PM");
    }

    @And("the user filled in the to date at time field")
    public void theUserFilledInTheToDateAndTimeField() {
        calendarPage.toDateField.click();
        calendarPage.toDateField.clear();
        calendarPage.toDateField.sendKeys("to 07/21/2023 at 3:30 PM");
    }

    @Then("the user clicks on the Save button")
    public void theUserClicksOnTheSaveButton() {
        calendarPage.saveBtn.click();
    }

    @And("the user sees event on calendar")
    public void theUserSeesEventOnCalendar() {
        calendarPage.dateOfCalendar.isDisplayed();

    }

}

