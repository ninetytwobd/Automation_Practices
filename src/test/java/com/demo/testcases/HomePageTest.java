package com.demo.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.base.TestBase;
import com.demo.pages.HomePage;
import com.demo.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	public HomePageTest() {
		super();
	}
	@BeforeMethod 
	public void setUp() {
		initialization1();
		loginpage = new LoginPage();
		homepage = loginpage.login1(prop.getProperty("username"), prop.getProperty("password"));

}
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String HomeTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(HomeTitle, "Dashboard- TechFios Test Application - Billing");
	}
	@Test(priority=2)
	public void verifyIncomeTodayFieldTest() {
		boolean incomeTodayField = homepage.verifyIncomeTodayField();
		Assert.assertTrue(incomeTodayField);
	}
	@Test(priority=3)
	public void verifyExpenseTodayFieldTest() {
		boolean ExpenseTodayField = homepage.verifyExpenseTodayField();
		Assert.assertTrue(ExpenseTodayField);
}
	@Test(priority=4)
	public void verifyExpenseThisMonthFieldTest() {
		boolean ExpenseThisMonthField = homepage.verifyExpenseThisMonthField();
		Assert.assertTrue(ExpenseThisMonthField);
}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
