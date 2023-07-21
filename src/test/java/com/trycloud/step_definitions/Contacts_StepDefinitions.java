package com.trycloud.step_definitions;

import com.trycloud.pages.Contacts_Page;
import com.trycloud.pages.Dashboard_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Contacts_StepDefinitions {
    Dashboard_Page dashboardPage = new Dashboard_Page();

    Contacts_Page contactsPage = new Contacts_Page();

    @When("user click on Contacts view option button")
    public void user_click_on_contacts_viev_option_button() {
        contactsPage.contactView.click();
    }
    @When("user click on New contact button")
    public void user_click_on_new_contact_button() {
        contactsPage.newContactBtn.click();
    }
    @Then("the user should be on the Contact module")
    public void theUserShouldBeOnTheContactModule() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.trycloud.net/index.php/settings/user"));
    }
    @And("user clear the contact input box")
    public void userClearTheContactInputBox() {
        Contacts_Page.fullNameBox.clear();
    }
    @Then("user enter the full name {string} of the new contact")
    public void user_enter_the_full_name_of_the_new_contact(String arg) {
        Contacts_Page.fullNameBox.sendKeys(arg+ Keys.ENTER)  ;
        BrowserUtils.sleep(2);
    }

    @And("new contact {string} should appear in the All contacts list")
    public void newContactShouldAppearInTheAllContactsList(String arg) {
        int countYes=0;
         for(WebElement each : Contacts_Page.allContactsList){
             if(each.getText().contains(arg)){
                 countYes++;
             }


             //System.out.println(each.getText());
         }
         BrowserUtils.sleep(2);
         Assert.assertTrue(countYes >= 1);

    }
    /*@When("user click on All contacts button")
    public void userClickOnAllContactsButton() {
    }
*/
    @Then("user can see list of contacts and total amount of this list")
    public void userCanSeeListOfContactsAndTotalAmountOfThisList() {
        // checking if the number is visible
        Assert.assertTrue(contactsPage.totalContacts.isDisplayed());

        for(WebElement each : Contacts_Page.allContactsList){
            Assert.assertTrue(each.isDisplayed());
        }
    }

    @When("user click on any contact picture icon")
    public void userClickOnAnyContactPictureIcon() {
        contactsPage.contactPictureIcon.click();
        BrowserUtils.sleep(2);
    }

//    @Then("user sees a pop up window with Choose from files button")
//    public void userSeesAPopUpWindowWithChooseFromFilesButton() {
//    }

    @And("click on Choose from files button")
    public void clickOnChooseFromFilesButton() {
        contactsPage.chooseFromFiles.click();
        BrowserUtils.sleep(2);
    }

    @Then("user can pick up an avatar")
    public void userCanPickUpAnAvatar() {
    }

    @And("click Chose button")
    public void clickChoseButton() {
    }

    @When("user click on any contact in the list")
    public void userClickOnAnyContactInTheList() {
    }

    @Then("user sees a contact profile")
    public void userSeesAContactProfile() {
    }

    @And("user click on hamburger menu")
    public void userClickOnHamburgerMenu() {
        contactsPage.hamburgerMenu.click();
        BrowserUtils.sleep(1);
    }

    @Then("user sees a Delete button")
    public void userSeesADeleteButton() {

    }

    @And("user click on delete button")
    public void userClickOnDeletButton() {
    }
}
