package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResult_Page {


    public SearchResult_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='innernametext']")
    public WebElement searchResult;


    @FindBy(xpath = "//div[@id='activityTabView']")
    public WebElement activityFeed;


    @FindBy(xpath = "//h2[@class='app-sidebar-header__maintitle']\n")
    public WebElement activityFeedTitle;
}
