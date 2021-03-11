package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	 WebDriver driver;
@Test
@Parameters({"url","emailID"})
public void yahooLogin(String url, String emailID) {
	driver= new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver.get("url");
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("login-username")).sendKeys("emailID");
	driver.findElement(By.name("signin")).click();
 
}
	
	
	
	
	
	
	
	

}
