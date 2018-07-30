package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TakeScreenShot {

    static	WebDriver driver;
	
	public static void main(String args[]) throws IOException{

		
		System.setProperty("webdriver.chrome.driver","c:/chromedriver.exe");
  	     driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		takeScreenShot("Facebook_LoginPage");
}
	
	
	public static void takeScreenShot(String filename) throws IOException
	{
		//1. Take screenshot and store in a file format
		File  file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//2. Copy screenshot to the desired location using copy file method
		
		FileUtils.copyFile(file ,new File("c:/Users/Rupali/workspace_luna/FREECRM/src/main/java/ScreenShot/" + filename +".jpg"));
		
	}
	
	
	
	
	
}