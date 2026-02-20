package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;

public class MobilePage extends Library{
	
	public MobilePage() {
	PageFactory.initElements(driver, this);
	
	}
	
	/*
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[4]/div[2]/div[1]/div[2]/div/label")
	public WebElement Apple; 
	
	
	@FindBy(xpath="//img[@alt=\"Apple iPhone 16 (White, 128 GB)\"]")
	public WebElement Apple4;
	*/
}
