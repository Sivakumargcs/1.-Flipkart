package com.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;

public class SelectingMobilePage extends Library {
	
	public SelectingMobilePage() {
		PageFactory.initElements(driver, this);
	}
	
	/*
	
	@FindBy(xpath="//div[text()='Buy now']")
	public WebElement Buynow;
	
	@FindBy(xpath="//input[@id=\"1\"]")
	public WebElement mobilenumber;
	
	@FindBy(xpath="//button[@class=\"xqOMQN FFO0ui\"]")
	public WebElement Continue;
	
	@FindBy(xpath="//div[text()='Verify']")
	public WebElement Verify;
	x
	
	@FindBy(xpath="//div[@class=\"col col-7-12\"]")
	public List<WebElement> products;
	
	@FindBy(xpath="(//div[@class=\"col col-7-12\"])[3]")
	public WebElement Thirdproduct;
	 */
	
	
	
}
