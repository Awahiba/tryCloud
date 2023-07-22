package com.trycloud.step_definitions;

import com.trycloud.pages.Dashboard_Page;
import com.trycloud.pages.Photo_Page;
import com.trycloud.pages.SearchResult_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class Search_StepDefinitions {
    private String searchInput;

    @Given("I am a user logged in on the {string}")
    public void i_am_a_user_logged_in_on_the(String title) {
        BrowserUtils.verifyTitleContains(title);
    }

    @Given("I have a {string} with a known name")
    public void i_have_a_file_with_a_known_name(String searchItem) {
        searchInput = ConfigurationReader.getProperty(searchItem);


    }


    SearchResult_Page searchResultPage = new SearchResult_Page();

    @When("I click on the magnifying glass icon inside any Module")
    public void i_click_on_the_magnifying_glass_icon_inside_any_module() {
        searchResultPage.magnifyingIcon.click();
        BrowserUtils.waitFor(5);
    }

    @When("I enter the known name into the search field")
    public void i_enter_the_known_name_into_the_search_field() {
        searchResultPage.searchBox.sendKeys(searchInput);
        BrowserUtils.waitFor(5);

    }

    @When("I press the Enter key")
    public void i_press_the_enter_key() {
        searchResultPage.searchBox.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(5);
    }

    @Then("I should see a list of search results matching the known name")
    public void i_should_see_a_list_of_search_results_matching_the_known_name() {
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
        /**
         * will need to change to wait until element is visible
         */
        BrowserUtils.sleep(10);
        searchInput = ConfigurationReader.getProperty(searchItem);
        Assert.assertTrue(searchResultPage.activityFeedTitle.getText().contains(searchInput));
    }


    Dashboard_Page dashboardPage = new Dashboard_Page();

    @Given("I am a user logged in and viewing a search item's details")
    public void i_am_a_user_logged_in_and_viewing_a_search_item_s_details() {
        dashboardPage.dashboardModule.click();
    }

    @When("I click the App icon at the top left corner on the page")
    public void i_click_the_app_icon_at_the_top_left_corner_on_the_page() {
        dashboardPage.appIcon.click();
    }

    @Then("I should be redirected to the Dashboard")
    public void i_should_be_redirected_to_the_dashboard() {
        BrowserUtils.verifyTitleContains("Dashboard");
    }


    // io.cucumber.junit.UndefinedStepException: The step 'I am a user logged in on the Dashboard' and 2 other step(s) are undefined.

    @When("I navigate to the Photos Module")
    public void i_navigate_to_the_photos_module() {
        dashboardPage.photosModule.click();
    }

    Photo_Page photoPage = new Photo_Page();

    @Then("I should be able to see the photos under the Photos Module")
    public void i_should_be_able_to_see_the_photos_under_the_photos_module() {
        BrowserUtils.waitFor(5);
        for (WebElement photo : photoPage.photoList) {
            Assert.assertTrue(photo.isDisplayed());
        }


    }


}
