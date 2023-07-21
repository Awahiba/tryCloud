package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customize_Page {

    public Customize_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[@for='status-checkbox-status']")
    public WebElement statusWidget;

    @FindBy(xpath = "//label[@for='status-checkbox-weather']")
    public WebElement weatherWidget;

    @FindBy(xpath = "//label[@for='panel-checkbox-calendar']")
    public WebElement calendarWidget;

    @FindBy(xpath = "//label[@for='panel-checkbox-deck']")
    public WebElement deckWidget;

    @FindBy(xpath = "//label[@for='panel-checkbox-mail']")
    public WebElement importantMailWidget;

    @FindBy(xpath = "//label[@for='panel-checkbox-mail-unread']")
    public WebElement unreadMailWidget;

    @FindBy(xpath = "//label[@for='panel-checkbox-recommendations']")
    public WebElement recommendationsWidget;

    @FindBy(xpath = "//label[@for='panel-checkbox-spreed']")
    public WebElement talkWidget;

    @FindBy(xpath = "//label[@for='panel-checkbox-user_status']")
    public WebElement recentStatusWidget;

    @FindBy(xpath = "//button[@rel='noreferrer noopener']")
    public WebElement xButton;



}
