package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainClass 
{
	static WebDriver driver;
	
  @Test
  private void launchBrowser() 
  {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
  } 
  @Test(priority=1)
  private void launchUrl() 
  {
	 driver.get("https://www.instagam.com/");
	 
	 driver.manage().window().maximize();
  }
  @Test(priority=2)
  private void enterUsername() 
  {
	 WebElement txtUsername = driver.findElement(By.name("username"));
	 txtUsername.sendKeys("kara_12");
  }
  @Test(priority=3)
  private void enterPassword() 
  {
	  WebElement txtPassword = driver.findElement(By.name("password"));
	  txtPassword.sendKeys("rain_kara_123");
  }
}

