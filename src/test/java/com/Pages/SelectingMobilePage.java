package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;

public class SelectingMobilePage extends Library {
	
	public SelectingMobilePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Buy now']")
	public WebElement Buynow;
	
	@FindBy(xpath="//input[@id=\"1\"]")
	public WebElement mobilenumber;
	
	@FindBy(xpath="//button[@class=\"xqOMQN FFO0ui\"]")
	public WebElement Continue;
	
	@FindBy(xpath="//div[text()='Verify']")
	public WebElement Verify;
}
