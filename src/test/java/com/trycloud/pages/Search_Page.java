package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Search_Page {


    public Search_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@aria-controls='header-menu-unified-search']")
    public WebElement magnifyingIcon;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;





}
