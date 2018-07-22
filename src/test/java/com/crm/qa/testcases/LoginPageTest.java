package com.crm.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage login;
	HomePage homepage;

	public LoginPageTest() throws IOException {
		super();
	}
	
  @BeforeMethod
  public void setup() throws IOException{
	  initialization();
	  login =new LoginPage();
  }
  
  @Test(priority=0)
  public void loginPageTitle(){
	  String title = login.validateLoginPageTitle();
	  Assert.assertEquals(title,"Free CRM software in the cloud powers sales and customer service");
  }

  @Test(priority=1)
  public void crmLogoTest(){
	  boolean flag = login.validateCRMImage();
	  Assert.assertTrue(flag);
  }

  @Test(priority=2)
  public void  loginTest() throws InterruptedException{
	   homepage = login.login(prop.getProperty("username"),prop.getProperty("password"));	
  }
	  
  @AfterMethod
  public void tearDown()
 {
	driver.close();
 }

 }