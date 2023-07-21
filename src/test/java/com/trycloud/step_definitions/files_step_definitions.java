package com.trycloud.step_definitions;

import com.trycloud.pages.Dashboard_Page;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.files_page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class files_step_definitions {

    files_page filesPage = new files_page();
    LoginPage loginPage = new LoginPage();
    Dashboard_Page dashboard_page = new Dashboard_Page();

    @Given("user is on dashboard")
    public void user_is_on_dashboard() {

        loginPage.login("User1", "Userpass123");

    }

    @When("user on the files feature")
    public void user_on_the_files_feature() {
        dashboard_page.filesModule.click();
    }

    @When("user click deleted files")
    public void user_click_deleted_files() {

        filesPage.deleteFiles.click();

    }

    @When("user click on three dots icon")
    public void user_click_on_three_dots_icon() {

        filesPage.threeIconBtn.click();

    }

    @Then("user click on delete permanently button")
    public void user_click_on_delete_permanently_button() {
        filesPage.deletePermanentlyBtn.click();

    }

    @When("user click Restore button")
    public void user_click_restore_button() {
        filesPage.restoreBtn.click();

    }

    @When("user click all files")
    public void user_click_all_files() throws InterruptedException {

        filesPage.allFiles.click();
    }

    @Then("user should see restored file under all files")
    public void user_should_see_restored_file() {
        filesPage.file.isSelected();

    }

    @Given("user click on delete button")
    public void user_click_on_delete_button() {
        filesPage.deleteBtn.click();


    }

    @Then("user can see all deleted files in sorted order")
    public void user_can_see_all_deleted_files_in_sorted_order() {

   List<String> datesToString = new ArrayList<>();
   for( WebElement dateElement : filesPage.allDates){
       String dateOfElement = dateElement.getAttribute("data-original-title");
       datesToString.add(dateOfElement);

   }
   List<LocalDateTime> DateAndTime = BrowserUtils.convertListOfStringtoListOfDateAndTime(datesToString);


   BrowserUtils.isOrderedNewestToOldest(DateAndTime);







        }



}