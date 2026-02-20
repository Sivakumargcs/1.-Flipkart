package com.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
	
	public static Actions action;
	public static WebDriver driver;
	public static Properties prop;
	public void loadConfig() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src/test/resources/Property/config.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public void Launchbrowser(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("edge")){
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
			
		}
		
		driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
    }

   
    }

	


