package com.demo.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.demo.base.TestBase;
import com.demo.pages.HomePage;
import com.demo.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest() {
		super();
	}
	//initialization
	@BeforeMethod 
	public void setUp() {
		initialization1();
		loginpage = new LoginPage();	
	}
	@Test(priority=1)
	public void loginPageTitle() {
		String title = loginpage.validateLogingPage();
		Assert.assertEquals(title, "Login - TechFios Test Application - Billing");
		
		
	}
	@Test(priority=2)
	public void LogoimmageTest(){
		boolean logo = loginpage.logo();
		Assert.assertTrue(logo);
		
	}
	@Test(priority=3)
	public void logingTest(){
		
		
		
		
		homepage =loginpage.login1(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown(){
		
		
		driver.quit();
	}


}
