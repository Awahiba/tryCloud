package com.trycloud.step_definitions;

import com.trycloud.pages.US008ContactsPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US008_ContactsModule_StepDefinitions {
    com.trycloud.pages.US008ContactsPage US008ContactsPage = new US008ContactsPage();

    @Given("user click contacts icon")
    public void user_click_contacts_icon() {

        US008ContactsPage.contactsIcon.click();
        BrowserUtils.sleep(1);

    }

    /*@Then("the user has at least one contact")
    public void theUserHasAtLeastOneContact() {
        if (!(US008ContactsPage.firstContact.isDisplayed())) {
            US008ContactsPage.createContactButton.click();
            BrowserUtils.sleep(2);
        }

    }
*/

    @And("user clicks icon plus on the left side")
    public void userClicksIconPlusOnTheLeftSide() {
        US008ContactsPage.plusButton.click();
        BrowserUtils.sleep(1);
    }

    @And("user type the new group name {string} and click enter button")
    public void userTypeTheNewAndClickEnterButton(String newGroup) {
        US008ContactsPage.newGroupBox.sendKeys(newGroup + Keys.ENTER);
        BrowserUtils.sleep(1);
    }

    @When("user click add contacts")
    public void user_click_add_contacts() {
        US008ContactsPage.addContactsButton.click();
        BrowserUtils.sleep(1);
    }

    @And("user add all contacts and press button add to group")
    public void userAddAllContactsAndPressButtonAddToGroup() {

        for (WebElement each : US008ContactsPage.allContacts) {
            each.click();
            BrowserUtils.sleep(1);
        }
        US008ContactsPage.addToGroupButton.click();
        BrowserUtils.sleep(5);

        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='app-content-list-item']")));
    }

    @Then("user is able to see group's name {string} under Contacts Module")
    public void userIsAbleToSeeGroupSNameUnderContactsModule(String newGroup) {
        int countYes = 0;
        for (WebElement each : US008ContactsPage.allGroupNamesLeft) {
            if (each.getText().equals(newGroup)) {
                countYes++;
            }
        }
        Assert.assertTrue(countYes >= 1);
    }

    @When("user click the group’s dropdown menu existing in the contact’s own info menu")
    public void userClickTheGroupSDropdownMenuExistingInTheContactSOwnInfoMenu() {

        US008ContactsPage.groupsButton.click();
        BrowserUtils.sleep(2);
    }

    @Then("user can see all the available groups name")
    public void userCanSeeAllTheAvailableGroupsName() {
//int myArray[] = new int[4]
        //int size = US008ContactsPage.groupsOptionsContactInfo.size();
        List<String> left = new ArrayList<String>();
        List<String> right = new ArrayList<String>();

        for (WebElement each : US008ContactsPage.groupsOptionsContactInfo) {

            right.add(each.getText());
        }

        for (WebElement each : US008ContactsPage.allGroupNamesLeft) {
            if ((each.getText().contains("All contacts")) || (each.getText().contains(("+ New group")))) {
                continue;
            }
            left.add(each.getText());
        }
        //All contacts
        //+ New group

        Collections.sort(left);
        Collections.sort(right);

        Assert.assertEquals(right, left);

    }

    @When("user click Add new property dropdown menu")
    public void userClickAddNewPropertyDropdownMenu() {
        US008ContactsPage.propertyTypeButton.click();
        BrowserUtils.sleep(2);
    }

    @And("user choose Anniversary")
    public void userChooseAnniversary() {
        US008ContactsPage.anniversaryButton.click();
        BrowserUtils.sleep(2);
    }

    @Then("User can see a new property as Anniversary")
    public void userCanSeeANewPropertyAsAnniversary() {
        Assert.assertTrue(US008ContactsPage.anniversaryProperty.isDisplayed());
    }


}

