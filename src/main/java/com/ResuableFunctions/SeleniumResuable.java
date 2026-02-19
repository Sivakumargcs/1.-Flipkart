package com.ResuableFunctions;


import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.BaseClass.Library;

public class SeleniumResuable extends Library {
    
    // Explicit wait method
    public void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForClick(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    
    // Common Click method
    public void clickElement(WebElement element) {
    	 waitForElement(element);
        element.click();
    }

    // Common Type/SendKeys method
    public void typeValue(WebElement element, String text) {
    	 waitForElement(element);
        element.clear();
        element.sendKeys(text);
    }
    
    public void GetUrl(String Url) {
		driver.get(Url);

	}
    
    public void windowhandle() {

    	String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

	}
    
}