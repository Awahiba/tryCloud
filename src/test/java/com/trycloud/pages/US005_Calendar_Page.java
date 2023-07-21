package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US005_Calendar_Page {

    public US005_Calendar_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath ="//*[@id=\"app-navigation-vue\"]/header/div[2]/div/div/div/button")
    public WebElement optionBtn;

    @FindBy(xpath = "//span[normalize-space()='Day']")
    public WebElement dayOptional;

    @FindBy(xpath = "//div[@class='fc-timegrid-slot-label-cushion fc-scrollgrid-shrink-cushion']")
    public List<WebElement> timeElement;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-week']")
    public WebElement weekOptional;

    @FindBy(xpath = "//div//a[@class='fc-col-header-cell-cushion ']")
    public List<WebElement> daysOfWeek;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-module']")
    public WebElement monthOptional;

    @FindBy(xpath = "//a[@class='fc-col-header-cell-cushion ']")
    public List<WebElement> daysElement;

    @FindBy(xpath = "//div[@class='fc-scrollgrid-sync-inner']")
    public List<WebElement> daysWeekOfMonth;


    @FindBy(xpath = "//a[@class='fc-col-header-cell-cushion ']")
    public WebElement currentDayForDay;


    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div/div/table/tbody/tr/td/div/div/div/table/tbody/tr[4]/td[6]/div")
    public WebElement dayCalendar;


    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement popWindow;

    @FindBy(xpath = "//a[normalize-space()='Fri 7/21/2023']")
    public WebElement currentDayForWeek;

    @FindBy(xpath = "//div/a[@class='fc-daygrid-day-number']")
    public List<WebElement> currentDayForMonth;

    @FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement newEventByn;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement eventTitleField;

    @FindBy(xpath = "//div[@class='property-title-time-picker__time-pickers']//div[1]//div[1]//input[1]")
    public WebElement fromDateField;

    @FindBy(xpath = "/html/body/div[6]/div/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/input")
    public WebElement toDateField;


//    @FindBy(xpath = "//div[@id='popover_85h2q7703x']//div[2]//div[1]//input[1]")
//    public WebElement toDateField;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement saveBtn;

    @FindBy(xpath = "//div[text()='Demo meeting!']")
    public WebElement dateOfCalendar;











}
