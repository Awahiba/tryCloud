package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePage {

    public FilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class = 'button new'])")
    public WebElement plusBtn;

    @FindBy(xpath = "(//span[@class='svg icon icon-upload'])")
    public WebElement uploadBtn;

    @FindBy(xpath = "(//span[@class='innernametext'])")
    public WebElement fileName;

    @FindBy(xpath = "(//span[@class='displayname'][normalize-space()='New folder'])")
    public WebElement newFolderBtn;

    @FindBy(xpath = "(//input[@id='view13-input-folder'])")
    public WebElement enterName;

    @FindBy(xpath = "(//input[@class='icon-confirm'])")
    public WebElement arrowIcon;


    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement threeDotsActions;

    @FindBy(xpath = "(//a[@class='menuitem action action-delete permanent'])")
    public WebElement delete;

    @FindBy(xpath = "(//span[@class='info'])")
    public WebElement numFolderFile;

    public void scrollBelowList(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(numFolderFile);
        numFolderFile.isDisplayed();

    }
}
