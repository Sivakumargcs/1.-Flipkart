package com.StepDefiniton;

import org.junit.Assert;

import com.Pages.MobilePage;
import com.Pages.SearchPages;
import com.Pages.SelectingMobilePage;
import com.ResuableFunctions.SeleniumResuable;

import io.cucumber.java.en.*;

public class FlipkartSteps {
	  
	SearchPages fp = new SearchPages();
	SeleniumResuable rf = new SeleniumResuable();
	   
    @Given("User is on Flipkart home page")
    public void user_is_on_flipkart_home_page() {
        // Optional: Close popup if it exists
        try {
            rf.clickElement(fp.closeLoginPopUp);
        } catch (Exception e) {
            System.out.println("Login popup did not appear.");
        }
    }

    @When("User enters {string} on Search box")
    public void user_enters_on_search_box(String product) {
    	
    	fp.searchBox.clear();
        rf.typeValue(fp.searchBox, "Mobile");
    }

    @When("User clicks the Search button")
    public void user_clicks_the_search_button() {
        rf.clickElement(fp.searchButton);
    }

    @Then("User should see results for {string}")
    public void user_should_see_results_for(String expectedProduct) {
        rf.waitForElement(fp.searchResultHeader);
        String actualText = fp.searchResultHeader.getText();
        Assert.assertTrue(actualText.contains(expectedProduct));
    }
    
    MobilePage mp = new MobilePage();
    
    @When("User fliters the Apple in Brand")
    public void user_fliters_the_apple_in_brand() {
        rf.clickElement(mp.Apple);
    }
    @Then("User clicks the Apple iphone")
    public void user_clicks_the_apple_iphone() {
    	rf.waitForClick(mp.Apple4);
    	rf.waitForClick(mp.Apple4);
    	rf.waitForClick(mp.Apple4);
        rf.clickElement(mp.Apple4);
        
rf.windowhandle();
    }
    
    SelectingMobilePage sp = new SelectingMobilePage();
    
    
    @Then("User Clciks the Buy now")
    public void user_clciks_the_buy_now() {
    	 rf.waitForClick(sp.Buynow);  
    	 rf.waitForClick(sp.Buynow); 
    	rf.clickElement(sp.Buynow);
    }
    
    @Then("User enters mobile number")
    public void user_enters_mobile_number() {
       rf.typeValue(sp.mobilenumber, "9688988796");
    }
    @Then("User Clciks the Continue")
    public void user_clciks_the_continue() {
       rf.clickElement(sp.Continue);
    }
    
    @Then("User Clciks the Verify")
    public void user_clciks_the_verify() {
    	rf.waitForClick(sp.Verify);
    	rf.waitForClick(sp.Verify);
    	rf.waitForClick(sp.Verify);
    	rf.clickElement(sp.Verify);
    }
    
    
    
    
}