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


    @FindBy(xpath = "//*[@id=\"header-menu-unified-search\"]/div[2]")
    public WebElement searchInfoContent;


    @FindBy(xpath = "//*[@id=\"app-sidebar-vue\"]/header/div[1]/div[2]")
    public WebElement sideBar;


    @FindBy(xpath = "//h2[@class='app-sidebar-header__maintitle']\n")
    public WebElement activityFeedTitle;
    @FindBy(xpath = "//a[@aria-controls='header-menu-unified-search']")
    public WebElement magnifyingIcon;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;


    @FindBy(xpath = "//h3[contains(@title, searchItem )]")
    public List<WebElement> searchResults;


}
