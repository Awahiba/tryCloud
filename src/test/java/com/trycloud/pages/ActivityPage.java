package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityPage {
    public ActivityPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//a[contains(@href,'/index.php/apps/activity/?')]")
    public List<WebElement> listOfAllItems;

    @FindBy (xpath = "//a/span[text()='All activities']")
    public WebElement allActivitiesButton;



    @FindBy (xpath = "//span[@class='activitytime has-tooltip live-relative-timestamp']")
    public List<WebElement> listOfAllDates;


    @FindBy (xpath ="//div[@id='no_more_activities']")
    public WebElement noMoreEventsToLoadMessage;



    public void scrollToTheEndOfAllActivitesPage(){
        Actions actions = new Actions(Driver.getDriver());
        while (!noMoreEventsToLoadMessage.isDisplayed()) {
            actions.scrollByAmount(0,250).perform();
        }
    }

}
