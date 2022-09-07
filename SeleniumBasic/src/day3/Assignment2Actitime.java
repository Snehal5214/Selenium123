package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2Actitime {

	public static void main(String[] args) {
		
		String currentWorkingDir = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver" , "H:\\workplace\\SeleniumBasic\\Executables\\geckodriver.exe");
		FirefoxDriver frd = new FirefoxDriver();
		
		frd.get("https://demo.actitime.com/");
		
		//application title validation
		String actualTitle = frd.getTitle();
		String expectedTitle = "actiTIME - Login";
		System.out.println("actual google page title: "+actualTitle);
		System.out.println("expected google page title: "+expectedTitle);
		System.out.println(" Google title validation: "+actualTitle.equals(expectedTitle));
		
		//validation of url
		String actualUrl = frd.getCurrentUrl();
		String expectedUrl= "https://demo.actitime.com/";
		System.out.println("actual url is: "+actualUrl);
		System.out.println("expected url is: "+expectedUrl);
		System.out.println("Google url validation is: "+actualUrl.contains(expectedUrl));
		
		//page source code
		String pageSource = frd.getPageSource();
		System.out.println("Page source code content length: "+pageSource.length());
		
		WebElement username = frd.findElement(By.id("username"));
		username.sendKeys("admin");
		
		WebElement password = frd.findElement(By.name("pwd"));
		password.sendKeys("manager");
		
		WebElement submitbtn = frd.findElement(By.className("initial"));
		submitbtn.click();
		
		//close the current browser
		frd.close();

	}



}


