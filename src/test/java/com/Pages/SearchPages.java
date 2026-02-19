package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.BaseClass.Library;

public class SearchPages extends Library {

    public SearchPages() {
        PageFactory.initElements(driver, this);
    }

    // Close button for initial login popup (if it appears)
    @FindBy(xpath = "//span[@class='_30XB9F']")
    public WebElement closeLoginPopUp;

    @FindBy(xpath = "(//input[@title=\"Search for Products, Brands and More\"])[1]")
    public WebElement searchBox;

    @FindBy(xpath = "(//button[@class=\"XFwMiH\"])[1]")
    public WebElement searchButton;

    @FindBy(xpath = "//span[contains(text(),'results for')]")
    public WebElement searchResultHeader;
}