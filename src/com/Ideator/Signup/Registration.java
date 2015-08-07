package com.Ideator.Signup;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Registration{
	
		
private static WebElement element = null;
		
  public static WebElement SignUpIdeator(WebDriver driver)
  {
		WebElement elementToShowMenu = driver.findElement(By.xpath("html/body/form/div[3]/div/div[1]/div[2]/ul/li[2]/a"));
		new Actions(driver).moveToElement(elementToShowMenu).build().perform();
		element = driver.findElement(By.xpath("html/body/form/div[3]/div/div[1]/div[2]/ul/li[2]/ul/li[1]/a"));
		return element;
  }
  		public static WebElement SignUpBussiness(WebDriver driver){WebElement elementToShowMenu = driver.findElement(By.xpath("html/body/form/div[3]/div/div[1]/div[2]/ul/li[2]/a"));
		new Actions(driver).moveToElement(elementToShowMenu).build().perform();
		element = driver.findElement(By.xpath("html/body/form/div[3]/div/div[1]/div[2]/ul/li[2]/ul/li[2]/a"));
		return element;
  }
  

}
