package com.test.MavenJenkinsDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OpenBrowser {
	WebDriver driver;
	@BeforeTest  
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();  // open browser
		System.out.println("Browser opened");
		driver.get("http://newtours.demoaut.com/"); // open website
	}

	@Test  
	public void login() {
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		System.out.println("Loggedin Successfully");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
