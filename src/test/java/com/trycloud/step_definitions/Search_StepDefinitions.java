package com.trycloud.step_definitions;

import com.trycloud.pages.SearchResult_Page;
import com.trycloud.pages.Search_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Search_StepDefinitions {
    private String searchInput;

    @Given("I am a user logged in on the {string}")
    public void i_am_a_user_logged_in_on_the(String title) {
        BrowserUtils.verifyTitleContains(title);
    }

    @Given("I have a {string} with a known name")
    public void i_have_a_file_with_a_known_name(String searchItem) {
        System.out.println("i_have_a_file_with_a_known_name");

        searchInput = ConfigurationReader.getProperty(searchItem);
        System.out.println(searchInput);

    }

    Search_Page searchElement = new Search_Page();
    SearchResult_Page searchResultPage = new SearchResult_Page();

    @When("I click on the magnifying glass icon inside any Module")
    public void i_click_on_the_magnifying_glass_icon_inside_any_module() {
        System.out.println("i_click_on_the_magnifying_glass_icon_inside_any_module");

        searchElement.magnifyingIcon.click();
        BrowserUtils.waitFor(5);
    }

    @When("I enter the known name into the search field")
    public void i_enter_the_known_name_into_the_search_field() {
        System.out.println("i_enter_the_known_name_into_the_search_field");
        System.out.println(searchInput);
        searchElement.searchBox.sendKeys(searchInput);
        BrowserUtils.waitFor(5);

    }

    @When("I press the Enter key")
    public void i_press_the_enter_key() {
        System.out.println("i_press_the_enter_key");

        searchElement.searchBox.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(5);
    }

    @Then("I should see a list of search results matching the known name")
    public void i_should_see_a_list_of_search_results_matching_the_known_name() {
        System.out.println("i_should_see_a_list_of_search_results_matching_the_known_name");

        Assert.assertFalse("No results", searchResultPage.searchResults.isEmpty());

        boolean isSearchItemFound = false;
        for (WebElement result : searchResultPage.searchResults) {
            System.out.println(result.getText());
            if (result.getText().contains(searchInput)) {
                isSearchItemFound = true;
                break;
            }
        }

        Assert.assertTrue("The search item was not found", isSearchItemFound);
    }







    @Then("the details side page of the {string} should appear when clicked on it")
    public void the_details_side_page_of_the_file_should_appear_when_clicked_on_it(String searchItem) {
        System.out.println("the_details_side_page_of_the_file_should_appear_when_clicked_on_it");

        /**
         * will need to change to wait until element is visible
         */
        BrowserUtils.sleep(10);
        searchInput = ConfigurationReader.getProperty(searchItem);
        Assert.assertTrue(searchResultPage.activityFeedTitle.getText().contains(searchInput));


    }








    //  io.cucumber.junit.UndefinedStepException: The step 'I am a user logged in on the Dashboard' and 6 other step(s) are undefined.









    @Given("I have a contact with a known name")
    public void i_have_a_contact_with_a_known_name() {

    }

    @Then("the details side page of the contact should appear when clicked on it")
    public void the_details_side_page_of_the_contact_should_appear_when_clicked_on_it() {

    }


    //io.cucumber.junit.UndefinedStepException: The step 'I am a user logged in on the Dashboard' and 6 other step(s) are undefined.


    @Given("I have a photo with a known name")
    public void i_have_a_photo_with_a_known_name() {

    }

    @Then("the details side page of the photo should appear when clicked on it")
    public void the_details_side_page_of_the_photo_should_appear_when_clicked_on_it() {

    }


    // io.cucumber.junit.UndefinedStepException: The step 'I am a user logged in and viewing a search item's details' and 2 other step(s) are undefined.


    @Given("I am a user logged in and viewing a search item's details")
    public void i_am_a_user_logged_in_and_viewing_a_search_item_s_details() {

    }

    @When("I click the App icon at the top left corner on the page")
    public void i_click_the_app_icon_at_the_top_left_corner_on_the_page() {

    }

    @Then("I should be redirected to the Dashboard")
    public void i_should_be_redirected_to_the_dashboard() {

    }


    // io.cucumber.junit.UndefinedStepException: The step 'I am a user logged in on the Dashboard' and 2 other step(s) are undefined.

    @When("I navigate to the Photos Module")
    public void i_navigate_to_the_photos_module() {

    }

    @Then("I should be able to see the photos under the Photos Module")
    public void i_should_be_able_to_see_the_photos_under_the_photos_module() {

    }


}
