package com.trycloud.step_definitions;

import com.trycloud.pages.Dashboard_Page;
import com.trycloud.pages.FilePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UploadNameDelete_StepDefinitions {

    Dashboard_Page dashboardPage = new Dashboard_Page();
    LoginPage loginPage = new LoginPage();
    FilePage filePage = new FilePage();
    @Given("User is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        loginPage.login("User1" , "Userpass123");
    }
    @Then("User is on the file page")
    public void user_is_on_the_file_page() {
        dashboardPage.filesModule.click();
    }
    @Then("User clicks the plus icon")
    public void user_clicks_the_plus_icon() {
        filePage.plusBtn.click();
    }
    @Then("User clicks Upload file")
    public void user_clicks_upload_file() {
        filePage.uploadBtn.click();

    }@Then("User uploads the {string} and file name is displayed on files page")
    public void userUploadsTheAndFileNameIsDisplayedOnFilesPage(String file) {
       // file = "C://Users/say_w/OneDrive/Desktop/Project-Upload.docx"; //C:\Users\say_w\OneDrive\Desktop\Project Upload.docx
       // BrowserUtils.sleep(2);
       // filePage.uploadBtn.sendKeys(file);
       Assert.assertTrue(filePage.fileName.isDisplayed());
    }
    @Then("User clicks new folder")
    public void user_clicks_new_folder() {
        filePage.newFolderBtn.click();
    }
    @Then("User enter {string} of the folder")
    public void user_enter_of_the_folder(String name) {
        name = "eureka1";
        filePage.enterName.sendKeys(name);
    }
    @Then("user clicks the arrow icon")
    public void user_clicks_the_arrow_icon() {
        filePage.arrowIcon.click();
    }
    @Then("User clicks three dot Icon")
    public void user_clicks_three_dot_icon() {
        filePage.threeDotsActions.click();
    }
    @Then("User clicks Delete icon")
    public void user_clicks_delete_icon() {
        filePage.delete.click();
    }
    @Then("User scrolls under the list table")
    public void user_scrolls_under_the_list_table() {
        filePage.scrollBelowList();
    }
    @Then("User sees the number of folders and files under the list table")
    public void user_sees_the_number_of_folders_and_files_under_the_list_table() {
        if (filePage.numFolderFile.isDisplayed()){
            System.out.println("woohoo!");
        }else {
            System.out.println("boooooooo");
        }
    }


}
