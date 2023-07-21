package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class files_page {

    public files_page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='nav-icon-trashbin svg']")
    public WebElement deleteFiles;

    @FindBy(xpath = "//a[.='All files']")
    public WebElement allFiles;

    @FindBy(xpath = "((//table[@class='list-container  has-controls'])[2]//span)[11]")
    public WebElement deleteBtn;

    @FindBy(xpath = "((//table[@class='list-container  has-controls'])[2]//span)[20]")
    public WebElement threeIconBtn;

    @FindBy(xpath = "(//span[.='Delete permanently'])[2]")
    public WebElement deletePermanentlyBtn;

    @FindBy(xpath = "(//span[@class='nametext extra-data'])[1]")
    public WebElement file;

    @FindBy(xpath = "(//a[@class='action action-restore permanent']//span)[1]")
    public WebElement restoreBtn;

    @FindBy(xpath = "//span[@class='modified live-relative-timestamp']")
    public List<WebElement> allDates;




}
