package com.serge.base;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.serge.pages.actions.SignInWindow;
import com.serge.pages.actions.TopNavigation;
import com.serge.pages.locators.SignInWindowLocators;
import com.serge.utilities.ExcelReader;
import com.serge.utilities.ExtentManager;

public class Page {

	/*
	 * WebDriver ExcelReader Logs WebDriverWait ExtentReports
	 * 
	 * 
	 * 
	 */

	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir")
					+ "\\src\\test\\resources\\excel\\testdata.xlsx");
	public static WebDriverWait wait;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static String browser;
	public static TopNavigation topNav;
	public static SignInWindow signInWindow;

	public static void initConfiguration() {

		if (Consatnts.browser.equals("firefox")) {

			driver = new FirefoxDriver();
			log.debug("Launching Firefox");
		} else if (Consatnts.browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", System
					.getProperty("user.dir")
					+ "\\src\\test\\resources\\executables\\chromedriver.exe");

			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put(
					"profile.default_content_setting_values.notifications",
					2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");

			driver = new ChromeDriver(options);
			log.debug("Launching Chrome");
		} else if (Consatnts.browser.equals("ie")) {

			System.setProperty("webdriver.ie.driver", System
					.getProperty("user.dir")
					+ "\\src\\test\\resources\\executables\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();
			log.debug("Launching IE");
		}

		driver.get(Consatnts.testSiteURL);
		driver.manage().window().maximize();
		topNav = new TopNavigation(driver);
		signInWindow = new SignInWindow(driver);
		 driver.manage().timeouts().implicitlyWait(Consatnts.implicitwait,
		 TimeUnit.SECONDS); 
		// wait = new WebDriverWait(driver, 0);
		
		// topNav = new TopNavigation(driver);
	}

	public static void quitBrowser() {

		driver.quit();

	}
}
