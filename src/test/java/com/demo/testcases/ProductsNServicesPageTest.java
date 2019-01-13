package com.demo.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.base.TestBase;
import com.demo.pages.HomePage;
import com.demo.pages.LoginPage;
import com.demo.pages.ProductsNServicesPage;
import com.demo.util.TestUtil;
import com.sun.media.jfxmedia.logging.Logger;

public class ProductsNServicesPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	ProductsNServicesPage productsNServicesPage;
	
	String sheetName= "NewServiceInfo";
	
	public ProductsNServicesPageTest() {
		super();
	}
	
	
	@BeforeMethod 
	public void setUp() {
		initialization1();
		
		loginpage = new LoginPage();
		productsNServicesPage = new ProductsNServicesPage();
		homepage = loginpage.login1(prop.getProperty("username"), prop.getProperty("password"));
		
}
	@DataProvider
	public Object [][] bbb(){
		Object [][] data = TestUtil.getTestData(sheetName);
		return data;
		
	}
	
	
	@Test(dataProvider= "bbb")
	public void createNewServiceTest(String Name, String SalesPrice,String ItemNumber, String Description) throws Exception {
		homepage.clickProductsServices();
		Thread.sleep(5000);
		homepage.clickNewService();
		//productsNServicesPage.newService("Tom", "$200","1001", "Thats a test product");
		productsNServicesPage.newService(Name, SalesPrice, ItemNumber, Description);
		homepage.ordersubmit();
		
		
}
	@AfterMethod
	public void tearDown() throws Exception {
		
		Thread.sleep(5000);
		driver.quit();
	}
}



