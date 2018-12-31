package com.demo.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.base.TestBase;





public class HomePage extends TestBase {
	
	
	
	@FindBy(xpath="//span[text()=' Income Today ']")
	WebElement IncomeTodayField;
	
	@FindBy(xpath="//span[text()=' Expense Today ']")
	WebElement ExpenseTodayField;
	
	@FindBy(xpath="//span[text()= ' Expense This Month ']")
	WebElement ExpenseThisMonthField;
	
	@FindBy(xpath="//span[text()= 'Products & Services']")
	WebElement ProductsServices;
	
	@FindBy(xpath="//a[text()= 'New Service']")
	WebElement NewService;
	
	@FindBy(xpath="//button[@class=\"btn btn-sm btn-primary\"]")
	WebElement ClickSubmit;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);

}
	public String verifyHomePageTitle() {
		return driver.getTitle();
		//Dashboard- TechFios Test Application - Billing
	}
	public boolean verifyIncomeTodayField() {
		return IncomeTodayField.isDisplayed();
	
    }
	public boolean verifyExpenseTodayField() {
		return ExpenseTodayField.isDisplayed();
	
    }
	public boolean verifyExpenseThisMonthField() {
		return ExpenseThisMonthField.isDisplayed();
}
	public void clickProductsServices() {
		ProductsServices.click();
}
	public void clickNewService() {
		NewService.click();
		
		
}
	public void ordersubmit() {
		ClickSubmit.click();
}
}

