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
    @FindBy(xpath = "//a[@aria-controls='header-menu-unified-search']")
    public WebElement magnifyingIcon;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;


    @FindBy(xpath = "//h3[contains(@title, searchItem )]")
    public List<WebElement> searchResults;

// this one AppId Element
    @FindBy(xpath = "//a[@id='nextcloud']")
    public WebElement appIcon;


    /**
     * Dont eve ask WHY
     * Dashboard Elements



    @FindBy(xpath = "(//a[@aria-label='Dashboard'])[1]")
    public WebElement dashboardModule;

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesModule;

    @FindBy(xpath = "(//a[@aria-label='Photos'])[1]")
    public WebElement photosModule;

    @FindBy(xpath = "(//a[@aria-label='Activity'])[1]")
    public WebElement activityModule;

    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement talkModule;

    @FindBy(xpath = "(//a[@aria-label='Mail'])[1]")
    public WebElement mailModule;

    @FindBy(xpath = "(//a[@aria-label='Contacts'])[1]")
    public WebElement contactModule;

    @FindBy(xpath = "(//a[@aria-label='Circles'])[1]")
    public WebElement circlesModule;

    @FindBy(xpath = "(//a[@aria-label='Calendar'])[1]")
    public WebElement calenderModule;

    @FindBy(xpath = "(//a[@aria-label='Deck'])[1]")
    public WebElement deckModule;

    @FindBy (xpath = "//div[@id='expand']")
    public WebElement userIconButton;

    @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement username;

    @FindBy(xpath = "//a[.='Customize']")
    public WebElement customizeButton;

    @FindBy(xpath = "//button[@class='user-status-menu-item__toggle user-status-menu-item__toggle--inline']")
    public WebElement onlineStatusButton;

    @FindBy(xpath = "//a[@href='/index.php/settings/user']")
    public WebElement profileSettings;

     */


}