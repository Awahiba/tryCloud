package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US008ContactsPage {
    public US008ContactsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='app-content-list-item']")
    public WebElement firstContact;

    @FindBy(linkText = "Create contact")
    public WebElement createContactButton;




    @FindBy(xpath = "(//a[@href='/index.php/apps/contacts/'])[1]")
    public WebElement contactsIcon;

    @FindBy(xpath = "//button[@class='icon action-item__menutoggle icon-add']")
    public WebElement plusButton;

    @FindBy(xpath = "//input[@class='action-input__input focusable']")
    public WebElement newGroupBox;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement addContactsButton;

    @FindBy(xpath = "//a[@class='user-bubble__content']")
    public List<WebElement> allContacts;

    @FindBy(xpath = "//button[@class='navigation__button-right primary']")
    public WebElement addToGroupButton;

    @FindBy(xpath = "//span[@class='app-navigation-entry__title']")
    public List<WebElement> allGroupNamesLeft;

    @FindBy(xpath = "//section/div[5]/div/div[2]")
    public WebElement groupsButton;

    @FindBy(xpath = "//section/div[5]/div/div[2]/div[3]/ul//li[contains(@class,'multiselect__element')]")
    public List<WebElement> groupsOptionsContactInfo;

    @FindBy(xpath = "//input[@placeholder='Choose property type']")
    public WebElement propertyTypeButton;

    @FindBy(xpath = "//div[@title='Anniversary']")
    public WebElement anniversaryButton;

    @FindBy(xpath = "//div[@class='property__value mx-datepicker']")
    public WebElement anniversaryProperty;


}

