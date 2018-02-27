package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

import com.qa.libs.TestBase;

public class HomePage extends TestBase{
	//1.Define Page Objects
	
			@FindBy(xpath="//input[@id='lst-ib']")
			WebElement searchtext;
			@FindBy(xpath="//input[@name='btnK']")
					WebElement searchBtn;
			public HomePage()
			{
				 
					 //all the variables will be initialized using the below
					 PageFactory.initElements(driver,this) ;
				 
			}
	
			public String verifyHomePageTitle() {
				return driver.getTitle();
			}
			
			public void enterSearchText(String info) {
				searchtext.sendKeys(info);
			}
			
			public void clickSearchButton() {
				searchBtn.click();
			}

	
}
