package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	//page factory or Object Repository
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath ="//input[@type='submit' and @value='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath ="//button[contains(text(),'Sign Up')]")
	WebElement signUp;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement cmLogo;
	
	//initialize page objects
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
		}		

	 //Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}

    public boolean validateCRMImage()
    {
    	return cmLogo.isDisplayed();
    }

     public HomePage login(String un,String pass) throws InterruptedException
     {
    	 username.sendKeys(un);
    	 password.sendKeys(pass);
    	 Thread.sleep(4000);
    	 loginBtn.click();
    	 return new HomePage();
    	 
     }
}



	
	
	
	
	



	


