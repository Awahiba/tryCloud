package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FolderView_Page {

    public FolderView_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Name")
    public WebElement NameButton;

    @FindBy(linkText = "Size")
    public WebElement SizeButton;

    @FindBy(linkText = "Modified")
    public WebElement ModifiedButton;

    @FindBy(xpath = "//tr[@data-type='dir']")
    public List<WebElement> folders;

    @FindBy(xpath = "//tr[@data-type='file']")
    public List<WebElement> files;

    @FindBy(xpath = "//span[@class='modified live-relative-timestamp']")
    public List<WebElement> DatesList;

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement SelectAllFiles;

    @FindBy(xpath = "//span[contains(., \"folders and\")]")
    public WebElement TotalFoldersAndFiles;


    // Method to get favorited folders
    public static List<WebElement> getFavoritedFolders(List<WebElement> folders) {
        List<WebElement> favoritedFolders = new ArrayList<>();

        for (WebElement folder : folders) {
            String dataFavorite = folder.getAttribute("data-favorite");

            // Check if dataFavorite is not null and contains the desired substring
            if (dataFavorite != null && dataFavorite.contains("_$!<Favorite>!$_")) {
                favoritedFolders.add(folder);
            }
        }

        return favoritedFolders;
    }

    // Method to get non-favorited folders
    public static List<WebElement> getNonFavoritedFolders(List<WebElement> folders) {
        List<WebElement> nonFavoritedFolders = new ArrayList<>();

        for (WebElement folder : folders) {
            String dataFavorite = folder.getAttribute("data-favorite");

            // Check if dataFavorite is not null and does not contain the desired substring
            if (dataFavorite != null && !dataFavorite.contains("_$!<Favorite>!$_")) {
                nonFavoritedFolders.add(folder);
            }
        }

        return nonFavoritedFolders;
    }

    // Method to get favorited files
    public static List<WebElement> getFavoritedFiles(List<WebElement> folders) {
        List<WebElement> favoritedFolders = new ArrayList<>();

        for (WebElement folder : folders) {
            String dataFavorite = folder.getAttribute("data-favorite");

            // Check if dataFavorite is not null and contains the desired substring
            if (dataFavorite != null && dataFavorite.contains("_$!<Favorite>!$_")) {
                favoritedFolders.add(folder);
            }
        }

        return favoritedFolders;
    }

    // Method to get non-favorited files
    public static List<WebElement> getNonFavoritedFiles(List<WebElement> folders) {
        List<WebElement> nonFavoritedFolders = new ArrayList<>();

        for (WebElement folder : folders) {
            String dataFavorite = folder.getAttribute("data-favorite");

            // Check if dataFavorite is not null and does not contain the desired substring
            if (dataFavorite == null || !dataFavorite.contains("_$!<Favorite>!$_")) {
                nonFavoritedFolders.add(folder);
            }
        }

        return nonFavoritedFolders;
    }

    //Method to get attributes
    public static List<String> getAttributeValues(List<WebElement> elements, String str) {
        List<String> attributeValues = new ArrayList<>();
        for (WebElement element : elements) {
            String attributeValue = element.getAttribute(str);
            attributeValues.add(attributeValue);
        }
        return attributeValues;
    }

    // Method to convert a list  of string to Integer
    public static List<Integer> convertListOfStringsToIntegers(List<String> stringList) {
        List<Integer> integerList = new ArrayList<>();

        for (String s : stringList) {
            try {
                int num = Integer.parseInt(s);
                integerList.add(num);
            } catch (NumberFormatException e) {
                // If any string in the input list cannot be converted to an integer,
                // handle the exception and skip that element.
                System.err.println("Error: Unable to convert string to integer. Reason: " + e.getMessage());
            }
        }

        return integerList;
    }

    //Method to sort the list based on the original sorting if it's ascending or descending
    public static List<Integer> sortIntegers(List<Integer> integerList) {
        if (integerList == null || integerList.isEmpty()) {
            return new ArrayList<>();
        }
        boolean isAscending = true;
        boolean isDescending = true;
        // Check if the list is in ascending or descending order
        for (int i = 1; i < integerList.size(); i++) {
            int prev = integerList.get(i - 1);
            int current = integerList.get(i);
            if (current < prev) {
                isAscending = false;
            }
            if (current > prev) {
                isDescending = false;
            }
        }
        // Sort the list based on the order detected
        if (isAscending) {
            Collections.sort(integerList);
        } else if (isDescending) {
            Collections.sort(integerList, Collections.reverseOrder());
        } else {
            // If the list is not in ascending or descending order, sort it in ascending order by default
            Collections.sort(integerList);
        }
        return integerList;
    }

    //Method to sort the list based on the original sorting if it's ascending or descending
    public static List<String> sortList(List<String> originalList, boolean isDescending) {
        List<String> sortedList = new ArrayList<>(originalList);
        // Sort the list based on whether it's ascending or descending
        if (isDescending) {
            Collections.sort(sortedList, String.CASE_INSENSITIVE_ORDER.reversed());
        } else {
            Collections.sort(sortedList, String.CASE_INSENSITIVE_ORDER);
        }

        return sortedList;
    }


}






