package com.ResuableFunctions;


import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.BaseClass.Library;

public class SeleniumResuable extends Library {
    
    // Explicit wait method
    public void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForClick(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
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
    
    public void waitforpageload() {
    	
    	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    	    wait.until(webDriver ->
    	        ((JavascriptExecutor) webDriver)
    	            .executeScript("return document.readyState")
    	            .equals("complete"));
    	
	}
    
    public void MultipleGettext(List<WebElement> elements) {

        System.out.println("Total Elements: " + elements.size());

        for (WebElement el : elements) {
            System.out.println("______________________________");
            System.out.println(el.getText());
        }
    
    	
    }
     public void Getvalue(WebElement element) {
    	 
    	 String Text=element.getText();
    	 System.out.println(Text);
	}
     
     public void dropdown(WebElement element, String Text) {
    	 Select drp = new Select(element);
    	 drp.selectByValue(Text);
	}
    public void scrolldown(WebElement element) {
    	
    	JavascriptExecutor js= (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
	}
    
    public void Hover(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

    public void HoverCLick(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}
    
    public void Screen(String path) {
    	TakesScreenshot ts = (TakesScreenshot)driver;
    	File source=ts.getScreenshotAs(OutputType.FILE);
	
    	try {
    		
    		FileUtils.copyFile(source, new File(path));
    										
    	}
    	catch(Exception e){
    		System.out.println("couldn't take screenshot");
    	}
    
    }

}



