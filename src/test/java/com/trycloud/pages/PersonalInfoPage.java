package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfoPage {

    public PersonalInfoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "//div[@id='content']")
    public WebElement profileInfo;

    @FindBy(xpath = "//*[text()='Full name']")
    public WebElement titleFullName;

    @FindBy(xpath = "//*[text()='Email']")
    public WebElement titleEmail;

    @FindBy(xpath = "//*[text()='Phone number']")
    public WebElement titlePhoneNumber;

    @FindBy(xpath = "//input[@id = 'displayname']")
    public WebElement inputboxFullName;

    @FindBy(xpath = "//input[@id = 'phone']")
    public WebElement inputboxPhoneNumber;

}
