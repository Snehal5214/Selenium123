package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWithGenericWay {

	public static void main(String[] args) {
		
		String currentWorkingDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "H:\\workplace\\SeleniumBasic\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//application title validation
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		System.out.println("actual google page title: "+actualTitle);
		System.out.println("expected google page title: "+expectedTitle);
		System.out.println(" Google title validation: "+actualTitle.equals(expectedTitle));
		
		//validation of url
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl= "https://www.google.com";
		System.out.println("actual url is: "+actualUrl);
		System.out.println("expected url is: "+expectedUrl);
		System.out.println("Google url validation is: "+actualUrl.contains(expectedUrl));
		
		//page source code
		String pageSource = driver.getPageSource();
		System.out.println("Page source code content length: "+pageSource.length());
		
		//close the current browser
		driver.close();
		
		
		
		
		
		
		

	}

}
