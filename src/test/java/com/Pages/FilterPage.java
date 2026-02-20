package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;

public class FilterPage extends Library {
	
	public FilterPage() {
		PageFactory.initElements(driver, this);
	}
/*
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[3]/div[4]/div[1]/select")
	public WebElement Minimum;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[3]/div[4]/div[3]/select")
	public WebElement Maximum;
	
	@FindBy(xpath="//div[text()='Google']")
	public WebElement Brand;
	
	@FindBy(xpath="//div[text()='4 GB']/preceding-sibling::div")
	public WebElement Ram;
	
	@FindBy(xpath="(//div[@class=\"_6odwB UHMz4K\"])[7]")
	public WebElement Battery;
	
	@FindBy(xpath="//div[text()='3000 - 3999 mAh']")
	public WebElement BatteryCapcity;
	
	@FindBy(xpath="//span[text()='Baby & Kids']")
	public WebElement Kids;
	
	@FindBy(linkText ="Board Games")
	public WebElement Boardgames;
	
	*/
	
	
	@FindBy(xpath="//a[@class=\"ol1oIH\"]")
	public WebElement Login;
	
	@FindBy(xpath="//div[text()='Flipkart Plus Zone']")
	public WebElement FlipkartPlus;
	
	@FindBy(xpath="(//span[@class=\"OqYNhN\"])[6]")
	public WebElement Furniture;
	
	@FindBy(xpath="//a[@title=\"Bedsheets\"]")
	public WebElement Bedsheets;
	
	@FindBy(xpath="(//div[@class=\"RGLWAk\"])[15]")
	public WebElement Bedsheet;
	
	@FindBy(xpath="//div[text()='Select delivery location']")
	public WebElement location;
	
	@FindBy(xpath="//input[@placeholder=\"Search by area, street name, pin code\"]")
	public WebElement area;
	
	@FindBy(xpath="//div[text()='Erode']")
	public WebElement city;
	
	@FindBy(xpath="//input[@value=\"Confirm\"]")
	public WebElement confirm;
	
	@FindBy(xpath="(//div[contains(.,'Buy at')])[55]")
	public WebElement Buy;
	
	
	
	
	
}
