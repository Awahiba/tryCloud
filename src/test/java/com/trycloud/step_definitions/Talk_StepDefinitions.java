package com.trycloud.step_definitions;

import com.trycloud.pages.TalkPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Talk_StepDefinitions {

    TalkPage talkPage = new TalkPage();

        @Given("user is on TryCloud dashboard page")
        public void user_is_on_try_cloud_dashboard_page() {
            Driver.getDriver().get("https://qa.trycloud.net/index.php/login");

        }

    @Then("user enters User1 as username and Userpass123 a password")
    public void user_enters_user1_as_username_and_userpass123_a_password() {
        talkPage.userName.sendKeys("User1");
        talkPage.password.sendKeys("Userpass123");
        talkPage.loginButton.click();
    }



        @When("user clicks on the talk button")
        public void user_clicks_on_the_talk_button() {
            talkPage.talkButton.click();

        }

    @When("user clicks on plus sign")
    public void user_clicks_on_plus_sign() {
        talkPage.plusSign.click();
    }
    @When("user verifies place holder name appears as Conversation name in new window")
    public void user_verifies_place_holder_name_appears_as_in_new_window(String ConversationName) {
    talkPage.conversationNameInputBox.getText().equals("Conversation name");
    }
    @Then("user clicks on Conversation name input box")
    public void user_clicks_on_conversation_name_input_box() {
        talkPage.conversationNameInputBox.click();
    }
    @Then("user types conversation name as My Conversation 5")
    public void user_types_conversation_name_as_my_conversation() {
        talkPage.conversationNameInputBox.sendKeys("My Conversation 5");
        BrowserUtils.sleep(2);
    }
    @Then("user marks checkbox named Allow guests to join via link")
    public void user_marks_checkbox_named_allow_guests_to_join_via_link() {
        talkPage.checkbox.click();
        BrowserUtils.sleep(2);
    }
    @Then("user clicks Add participants button")
    public void user_clicks_add_participants_button() {
           talkPage.allInOneButton.click();
           BrowserUtils.sleep(2);

    }
    @Then("user clicks to any participant from the list")
    public void user_clicks_to_any_participant_from_the_list() {
            talkPage.employee1Participant.click();
            BrowserUtils.sleep(2);

    }
    @Then("user clicks the Create conversation button")
    public void user_clicks_the_create_conversation_button() {
            talkPage.allInOneButton.click();
            BrowserUtils.sleep(2);

    }
    @Then("user clicks on Close button")
    public void user_clicks_on_close_button() {
            talkPage.allInOneButton.click();
            BrowserUtils.sleep(2);

    }
    @Then("user should see newly conversation in the list")
    public void user_should_see_newly_conversation_in_the_list() {

            String actualConversation = talkPage.conversationInList.getText();
            String expectedConversation = "My Conversation 5";
            Assert.assertEquals(actualConversation,expectedConversation);

            BrowserUtils.sleep(2);

    }

    @When("user clicks on the hamburger menu next to the conversation name")
    public void user_clicks_on_the_hamburger_menu_next_to_the_conversation_name() {
        talkPage.hamburgerMenu.click();
    }
    @When("user clicks on Delete conversation")
    public void user_clicks_on_delete_conversation() {
       talkPage.deleteConversation.click();
    }
    @When("user clicks on yes")
    public void user_clicks_on_yes() {
    talkPage.yesButton.click();
    }



}
