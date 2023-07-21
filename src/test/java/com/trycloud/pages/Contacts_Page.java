package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Contacts_Page {

    public Contacts_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[7]/a")
    public WebElement contactView;
    @FindBy(xpath = "//button[@id='new-contact-button']")
    public WebElement newContactBtn;
    @FindBy(xpath = "//*[@id=\"contact-fullname\"]")
    public static WebElement fullNameBox;

    @FindBy(xpath = "//div[@class='vue-recycle-scroller__item-view']")
    public static List<WebElement> allContactsList;

    @FindBy(xpath = "//*[@id=\"everyone\"]/div/div[1]")
    public WebElement totalContacts;


    @FindBy(xpath = "//*[@id=\"everyone\"]/a/span")
    public WebElement allContactsButton;


    @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/header/div[1]/div/div[2]/div/div/button")
    public WebElement contactPictureIcon;

    @FindBy(xpath = "//span[.='Choose from Files']/..")
    public WebElement chooseFromFiles;

    @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/header/div[3]/div/div/div/button")
    public WebElement hamburgerMenu;
}
