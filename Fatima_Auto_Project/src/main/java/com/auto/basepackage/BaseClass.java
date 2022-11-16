package com.auto.basepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
 
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("Webdriver.chrome.driver","./Driver.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	//This will delete user session information	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.shein.com/user/index"); //
		
		
		
//		// go to login page
//		driver.findElement(By.xpath("//i [@class='suiiconfont-critical sui_icon_nav_me_24px']")).click();
//		driver.findElement(By.xpath("//em [text() ='Sign in / Register']")).click();
//				
//	
		//driver.findElement(By.xpath(null))
		
		driver.findElement(By.xpath("//i [@class='suiiconfont-critical sui_icon_nav_me_24px']")).click();
		//driver.findElement(By.xpath("(// i [@class='suiiconfont sui_icon_closed_18px_1 she-close'])[1]")).click();
		driver.findElement(By.xpath("(//input [@class='S-input__inner']) [8]")).sendKeys("testfat@yahoo.com");
		driver.findElement(By.xpath("(//input [@class='S-input__inner'])[9]")).sendKeys("Qazxc123");
		driver.findElement(By.xpath("(//button [@class='S-button page__login_mainButton bUqVNB S-button__primary S-button__H44PX'] ) [5]")).click();
		
		
		//search for a girls outfit
		//driver.findElement(By.xpath("//i [@ class='suiiconfont-critical sui_icon_nav_search_24px']")).sendKeys(null)
		//click on the cart to make the order
		//driver.findElement(By.xpath("// i [@class='suiiconfont-critical sui_icon_nav_shoppingbag_24px']")).click();

		//click on Girls 
		driver.findElement(By.xpath("//div [@class='header-v2__nav2-txt'])[9]"));
		System.out.println( "the tittle of the application is: " +driver.getTitle());
		//driver.findElement(By.xpath ("//button [@class='S-button pwd-btn bUqVNB S-button__block S-button__primary S-button__H44PX']")).click();
		
		//driver.close();
		
		
	  
 }
	
	public static void main(String[] args) {
		
		BaseClass.setUp();
	}
}
