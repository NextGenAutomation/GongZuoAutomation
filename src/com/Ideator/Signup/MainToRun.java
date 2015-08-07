package com.Ideator.Signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainToRun {
	private static WebDriver driver = null;

	
	@BeforeClass
 public void HomePageSearcchTestEnter() throws InterruptedException
	  {
		  driver = new FirefoxDriver();
		  driver.get("https://www.thegongzuo.com/");
		  //driver.manage().window().maximize();
	  }
	  
//	@Test 
//  public void signUp(){
//		Ideator.SignUp(driver).click();
//		
//  }
	@Test
	public void ClickonIdeator() throws InterruptedException{
		
	//Registration.SignUpIdeator(driver).click();

	Registration.SignUpBussiness(driver).click();
	
		
		
	}
}
