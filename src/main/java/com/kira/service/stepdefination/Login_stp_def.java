package com.kira.service.stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.kira.service.properties.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login_stp_def extends TestBase{
WebDriver driver;
	
	@Given("^open the browser and launch application$")
	public void open_the_browser_and_launch_application(DataTable arg1) {
	System.out.println(arg1);
	String browser = prop.getProperty("browser");
	System.out.println(browser);
		if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.firefox.driver", "./runnertarget/geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./runnertarget/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "./runnertarget/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./runnertarget/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts();
		driver.get(prop.getProperty("url"));
	}



}
