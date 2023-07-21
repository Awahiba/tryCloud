package com.trycloud.step_definitions;

import com.trycloud.pages.Dashboard_Page;
import com.trycloud.pages.FolderView_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FolderView_StepDefs {

    Dashboard_Page dashboardPage = new Dashboard_Page();
    FolderView_Page folderViewPage = new FolderView_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
    Boolean isDescendingOrder = false;

    @Then("the user is on the Files page")
    public void theUserIsOnTheFilesPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://qa.trycloud.net/index.php/apps/files/"));
    }

    @Given("the user clicks on the Files Module")
    public void the_user_clicks_on_the_files_module() {
        dashboardPage.filesModule.click();

    }

    @When("user clicks on Name button")
    public void user_clicks_on_name_button() {
        folderViewPage.NameButton.click();
    }

    @Then("user sees the list in descending or ascending alphabetical order")
    public void userSeesTheListInDescendingOrAscendingAlphabeticalOrder() {

        List<String> folders = BrowserUtils.getElementsText(folderViewPage.getNonFavoritedFolders(folderViewPage.folders));
        List<String> sortedFolders = folderViewPage.sortList(folders, BrowserUtils.isListInDescendingOrder(folders));

        Assert.assertTrue(folders.equals(sortedFolders));

        List<String> files = BrowserUtils.getElementsText(folderViewPage.getNonFavoritedFolders(folderViewPage.files));
        List<String> sortedFiles = folderViewPage.sortList(files, BrowserUtils.isListInDescendingOrder(files));

        Assert.assertTrue(files.equals(sortedFiles));
    }

    @When("user clicks on Size button")
    public void userClicksOnSizeButton() {
        folderViewPage.SizeButton.click();
    }

    @Then("user sees the list in order based on the sizes")
    public void userSeesTheListInOrderBasedOnTheSizes() {

        List<String> filesSizes = FolderView_Page.getAttributeValues(folderViewPage.getNonFavoritedFiles(folderViewPage.files), "data-size");
        List<String> foldersSizes = FolderView_Page.getAttributeValues(folderViewPage.getNonFavoritedFolders(folderViewPage.folders), "data-size");

        List<String> combinedSizes = new ArrayList<>();
        combinedSizes.addAll(filesSizes);
        combinedSizes.addAll(foldersSizes);

        List<Integer> ActualSizes = FolderView_Page.convertListOfStringsToIntegers(combinedSizes);
        List<Integer> sortedCombinedSizes = folderViewPage.sortIntegers(ActualSizes);

        Assert.assertEquals(ActualSizes, sortedCombinedSizes);
    }


    @When("the user clicks on Modified button")
    public void theUserClicksOnModifiedButton() {
        folderViewPage.ModifiedButton.click();
    }

    @Then("the user sees the list in order based on modified dates")
    public void theUserSeesTheListInOrderBasedOnModifiedDates() {

        List<String> listOfDates = new ArrayList<>();
        for (WebElement eachDate : FolderView_Page.getNonFavoritedFolders(folderViewPage.DatesList)) {
            listOfDates.add(eachDate.getAttribute("data-original-title"));
        }
        List<LocalDateTime> datesList = BrowserUtils.convertListOfStringtoListOfDateAndTime(listOfDates);
        List<LocalDateTime> sortedList = new ArrayList<>(datesList);

        boolean isDescending = BrowserUtils.isOrderedNewestToOldest(datesList);
        if (!isDescending) {
            Collections.sort(sortedList);
        } else {
            Collections.sort(sortedList, Collections.reverseOrder());
        }

        Assert.assertTrue(sortedList.equals(datesList));


    }

    @When("the user clicks on the select all checkbox")
    public void theUserClicksOnTheSelectAllCheckbox() {
        //folderViewPage.SelectAllFiles.click();
        WebElement selectAllCheckbox = wait.until(ExpectedConditions.elementToBeClickable(folderViewPage.SelectAllFiles));
        selectAllCheckbox.click();
    }

    @Then("the user sees all the files selected at once")
    public void theUserSeesAllTheFilesSelectedAtOnce() {


        for (WebElement folder : folderViewPage.folders) {
            Assert.assertTrue(folder.getAttribute("class").contains("selected"));
        }
        for (WebElement file : folderViewPage.files) {
            Assert.assertTrue(file.getAttribute("class").contains("selected"));
        }

    }

    @And("the user sees the total values of all files in the first line")
    public void theUserSeesTheTotalValuesOfAllFilesInTheFirstLine() {

        Assert.assertTrue(folderViewPage.TotalFoldersAndFiles.isDisplayed());
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0,350)");
        }
        List<String> folders = BrowserUtils.getElementsText(folderViewPage.folders);
        List<String> files = BrowserUtils.getElementsText(folderViewPage.files);
        int foldersTotal = folders.size();
        int filesTotal = files.size();

        String expectedText = foldersTotal + " folders and " + filesTotal + " files";
        String actualText = folderViewPage.TotalFoldersAndFiles.getText();

        Assert.assertTrue(expectedText.equals(actualText));
    }
}