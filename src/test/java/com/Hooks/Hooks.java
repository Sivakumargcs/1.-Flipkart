package com.Hooks;

import com.BaseClass.Library;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;


public class Hooks extends Library {
		
	@Before
	public void setup() {
		
		loadConfig(); // Must be called first to initialize the 'prop' object
	    String browserName = prop.getProperty("browser"); 
	    Launchbrowser(browserName);
		
		}
	
	@After
	
	public void close() {
		
		
	}
	
}
