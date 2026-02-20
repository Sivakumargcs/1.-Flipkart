package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;

public class FilterPage extends Library {
	
	public FilterPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[3]/div[4]/div[1]/select")
	public WebElement Minimum;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[3]/div[4]/div[3]/select")
	public WebElement Maximum;
	
	@FindBy(xpath="//div[text()='Google']")
	public WebElement Brand;
	
	@FindBy(xpath="//div[text()='4 GB']/preceding-sibling::div")
	public WebElement Ram;
	
	@FindBy(xpath="//div[text()='Battery Capacity']")
	public WebElement Battery;
	
	@FindBy(xpath="//div[text()='2000 - 2999 mAh']")
	public WebElement BatteryCapcity;
	
	@FindBy(xpath="//span[text()='Baby & Kids']")
	public WebElement Kids;
	
	@FindBy(linkText ="Board Games")
	public WebElement Boardgames;
	
	
	
	
}
