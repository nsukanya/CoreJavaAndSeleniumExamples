package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.qa.libs.TestBase;
import com.qa.pages.HomePage;



public class HomePageTest extends TestBase{
	HomePage hp;
	@BeforeMethod
	public void setUp() {
		initialization();
		hp=new HomePage();
	}
	
	@Test(priority=1)
	public void googleTitleValidationtest() {
		String actualTitle=hp.verifyHomePageTitle();
		Assert.assertEquals(actualTitle,"Google");
	}
	@Test(priority=2)
	public void enterText() {
		String searchText="Selenium HQ";
	hp.enterSearchText(searchText);
	}
	
	@Test(priority=3)
	public void clickSearchButton() {
		String searchText="Selenium HQ";
		hp.enterSearchText(searchText);
		hp.clickSearchButton();
	}
	
	@AfterMethod
	public void tearDown() {
	 driver.quit();
	}
	
}
