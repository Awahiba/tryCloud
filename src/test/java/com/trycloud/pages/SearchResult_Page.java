package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResult_Page {

    private String searchItem = ConfigurationReader.getProperty("Search_input");

    public SearchResult_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//span[@class='innernametext']")
    public WebElement searchResult;


    @FindBy(xpath = "//div[@id='activityTabView']")
    public WebElement activityFeed;


    @FindBy(xpath = "//h2[@class='app-sidebar-header__maintitle']\n")
    public WebElement activityFeedTitle;


    @FindBy(xpath = "//h3[contains(@title, searchItem )]")
    public List<WebElement> searchResults;
}
