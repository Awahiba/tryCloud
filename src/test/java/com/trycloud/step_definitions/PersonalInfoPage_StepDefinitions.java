package com.trycloud.step_definitions;

import com.trycloud.pages.Dashboard_Page;
import com.trycloud.pages.PersonalInfoPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class PersonalInfoPage_StepDefinitions {

    Dashboard_Page dashboard_page = new Dashboard_Page();
    PersonalInfoPage personalInfoPage = new PersonalInfoPage();

    @When("user clicks on Icon of profile")
    public void user_clicks_on_icon_of_profile() {
        dashboard_page.userIconButton.click();
    }

    @When("user clicks on Settings option of dropdown menu")
    public void user_clicks_on_settings_option_of_dropdown_menu() {
        dashboard_page.profileSettings.click();
    }

    @Then("user is on the Personal Info page")
    public void userIsOnThePersonalInfoPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.trycloud.net/index.php/settings/user"));
    }

    @Then("user see titles Full name, Email, Phone Number on the Page")
    public void user_see_titles_full_name_email_phone_number_on_the_page() {
        Assert.assertTrue(personalInfoPage.titleFullName.isDisplayed());
        Assert.assertTrue(personalInfoPage.titleEmail.isDisplayed());
        Assert.assertTrue(personalInfoPage.titlePhoneNumber.isDisplayed());
        Assert.assertEquals("Full name",personalInfoPage.titleFullName.getText());
        Assert.assertEquals("Email",personalInfoPage.titleEmail.getText());
        Assert.assertEquals("Phone number",personalInfoPage.titlePhoneNumber.getText());
    }

    @Then("User checks names at Full name field and at dropdown menu under Icon op profile")
    public void userChecksNamesAtFullNameFieldAndAtDropdownMenuUnderIconOpProfile() {
        Assert.assertEquals(dashboard_page.username.getText(), personalInfoPage.inputboxFullName.getText());
    }

    @And("user enter letters at Phone number inputbox")
    public void userEnterLettersAtPhoneNumberInputbox() {
        personalInfoPage.inputboxPhoneNumber.sendKeys("123abracadabra" + Keys.ENTER);
    }

    @And("user enter special symbols at Phone number inputbox")
    public void userEnterSpecialSymbolsAtPhoneNumberInputbox() {
        personalInfoPage.inputboxPhoneNumber.sendKeys("123@!%$#" + Keys.ENTER);
    }

    @Then("Phone number inputbox does not accept characters")
    public void phoneNumberInputboxDoesNotAcceptCharacters() {
        String actualValueOfPhoneNumber = personalInfoPage.inputboxPhoneNumber.getAttribute("value");
        boolean phoneNumberInputboxDoesNotAcceptCharacters = true;

        for (char ch : actualValueOfPhoneNumber.toCharArray()) {
            if (!Character.isDigit(ch)) {
                System.out.println("Phone number inputbox accepts non-numeric characters");
                phoneNumberInputboxDoesNotAcceptCharacters = false;
                break;
            }
        }
        Assert.assertTrue(phoneNumberInputboxDoesNotAcceptCharacters);
    }

    @And("user clear Phone Number input box")
    public void userClearPhoneNumberInputBox() {
        personalInfoPage.inputboxPhoneNumber.clear();
    }


}
