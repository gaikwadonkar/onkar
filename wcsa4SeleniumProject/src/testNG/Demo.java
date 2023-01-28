package testNG;


import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.schema.diff.reporting.CapturingReporter;

public class Demo {
	public static void main(String[] args) {
		
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com");
	
	  
  }
}
