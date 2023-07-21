package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {

    public Search_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@aria-controls='header-menu-unified-search']")
    public WebElement searchTab;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;


}
