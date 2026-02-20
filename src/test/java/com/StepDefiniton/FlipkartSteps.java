package com.StepDefiniton;

import org.junit.Assert;



import com.Pages.FilterPage;
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
    
    /*
    MobilePage mp = new MobilePage();
    
    @When("User fliters the Apple in Brand")
    public void user_fliters_the_apple_in_brand() {
        rf.clickElement(mp.Apple);
    }
    
    
     When User fliters the Apple in Brand
    Then User clicks the Apple iphone 
Then User Clciks the Buy now
Then User enters mobile number
Then User Clciks the Continue
Then User Clciks the Verify
Then Extract the result and print in the consloe
Then Print the Third result and print it in the console
    
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
    
   
    
    SelectingMobilePage sp = new SelectingMobilePage();
    
    @Then("Extract the result and print in the consloe")
    public void extract_the_result_and_print_in_the_consloe() {
    	 rf.MultipleGettext(sp.products);
    	
    }
    @Then("Print the Third result and print it in the console")
    public void print_the_third_result_and_print_it_in_the_console() {
        rf.waitForElement(sp.Thirdproduct);
        rf.Getvalue(sp.Thirdproduct);
    }
    
     
    FilterPage F = new FilterPage();
    
    @Then("Select minmum and maximum value")
    public void select_minmum_and_maximum_value() {
    	rf.waitForElement(F.Minimum);
    	rf.waitForElement(F.Minimum);
    	rf.dropdown(F.Minimum, "10000");
    	rf.waitForElement(F.Maximum);
    	rf.waitForElement(F.Maximum);
    	rf.dropdown(F.Maximum, "15000");
        
    }
    @Then("Select Brand")
    public void select_brand() {
    	rf.waitForElement(F.Brand);
    	rf.waitForElement(F.Brand);
    	rf.waitForElement(F.Brand);
    	rf.clickElement(F.Brand);
        
    }
    @Then("Select Ram")
    public void select_ram() {
    	rf.waitForElement(F.Ram);
    	rf.waitForElement(F.Ram);
    	rf.waitForElement(F.Ram);
    	rf.clickElement(F.Ram);
        
    }
    @Then("Select battary")
    public void select_battary() {
    	rf.waitForElement(F.Battery);
    	rf.waitForElement(F.Battery);
    	rf.waitForElement(F.Battery);
    	rf.clickElement(F.Battery);
    	rf.waitForElement(F.BatteryCapcity);
    	rf.waitForElement(F.BatteryCapcity);
    	rf.waitForElement(F.BatteryCapcity);
    	rf.clickElement(F.BatteryCapcity);
    	rf.waitForElement(F.BatteryCapcity);
    	       
    }
    
    @Then("Hover Kids")
    public void hover_kids() {
    	rf.waitForElement(F.Kids);
    	rf.waitForElement(F.Kids);
    	rf.waitForElement(F.Kids);
       rf.Hover(F.Kids);
    }
    @Then("CLick board Games")
    public void c_lick_board_games() {
    	rf.waitForElement(F.Boardgames);
    	rf.waitForElement(F.Boardgames);
    	rf.waitForElement(F.Boardgames);
        rf.HoverCLick(F.Boardgames);
    }
    
    
    
    
    @Given("Enter the {string} in the searchbox")
    public void enter_the_in_the_searchbox(String Searchtext) {
    	rf.typeValue(fp.searchBox, Searchtext);
    	rf.clickElement(fp.closeLoginPopUp);
    	 
       
    }
    @When("click search box")
    public void click_search_box() {
    	rf.clickElement(fp.searchButton);
    	
    	rf.Screen("/Flipkart/src/test/resources/ScreenShots/search.png");
        
    }
    */
    
    FilterPage F = new FilterPage();
    
    @Given("User can move to login link")
    public void user_can_move_to_login_link() {
    
    	rf.waitForElement(F.Login);
    	rf.Hover(F.Login);
    }
    @When("user clicks the flipkartplus zone")
    public void user_clicks_the_flipkartplus_zone() {
    	rf.waitForElement(F.FlipkartPlus);
       rf.HoverCLick(F.FlipkartPlus);
      
    }
    @When("hover the mouse on Furniture")
    public void hover_the_mouse_on_furniture() {
    	rf.waitForElement(F.Furniture);
        rf.Hover(F.Furniture);
    }
    @When("user clicks the Bedsheets")
    public void user_clicks_the_bedsheets() {
    rf.waitForElement(F.Bedsheets);
       rf.HoverCLick(F.Bedsheets);
    }
    @When("Scroll down and selcte one particular result")
    public void scroll_down_and_selcte_one_particular_result() {
    	
        rf.clickElement(F.Bedsheet);
        rf.windowhandle();
        rf.waitforpageload();
    }
    @When("user enters the pincode and check the pincode")
    public void user_enters_the_pincode_and_check_the_pincode() {
    	rf.scrolldown(F.location);
        rf.clickElement(F.location);
        rf.typeValue(F.area, "Erode");
        rf.clickElement(F.city);
        rf.clickElement(F.confirm);
    }
    

    @When("user clicks the buy now")
    public void user_clicks_the_buy_now() {
    	rf.clickElement(F.Buy);
}
    
}