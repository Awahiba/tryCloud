package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkPage {

    public TalkPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="user")
    public WebElement userName;



    @FindBy(id="password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@href='https://qa.trycloud.net/index.php/apps/spreed/'][1]")
    public WebElement talkButton;

    @FindBy(xpath = "//button[@aria-label='Create a new group conversation']")
    public WebElement plusSign;

    @FindBy(xpath = "//input[@placeholder='Conversation name']")
    public WebElement conversationNameInputBox;

    @FindBy(xpath = "")
    public WebElement placeHolder;

    @FindBy(xpath = "//label[@for='checkbox']")
    public WebElement checkbox;

    @FindBy (xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement allInOneButton;

    @FindBy(xpath = "//span[.='Employee1']")
    public WebElement employee1Participant;

    @FindBy(xpath = "//span[.='Employee10']")
    public WebElement employee10Participant;

    @FindBy(xpath = "//span[.='Employee100']")
    public WebElement employee100Participant;

    @FindBy(xpath = "//span[.='Employee101']")
    public WebElement employee101Participant;

    @FindBy(xpath = "//span[.='Employee102']")
    public WebElement employee102Participant;

    @FindBy(xpath = "//span[.='Employee103']")
    public WebElement employee103Participant;

    @FindBy(xpath = "//span[.='Employee104']")
    public WebElement employee104Participant;

    @FindBy(xpath = "//span[.='Employee105']")
    public WebElement employee105Participant;

    @FindBy(xpath = "//span[.='Employee106']")
    public WebElement employee106Participant;

    @FindBy(xpath = "(//span[.='admin'])[2]")
    public WebElement adminParticipant;

    @FindBy(xpath = "//ul[@class='conversations']/li[1]")
    public WebElement conversationInList;


    @FindBy(xpath = "//button[@aria-label='Conversation settings'][1]")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//span[.='Delete conversation']")
    public WebElement deleteConversation;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement yesButton;








}
