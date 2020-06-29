package com.banistmo.certification.bancolombia.utils.drivers;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome {

	public static WebDriver onTheWebPage(String url) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito", "--start-maximized", "--disable-infobars");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		String downloadFilepath = System.getProperty("user.dir") + "\\src\\test\\resources\\download";
		chromePrefs.put("download.default_directory", downloadFilepath);
		options.setExperimentalOption("prefs", chromePrefs);
		driver = new ChromeDriver(options);
		driver.get(url);
		return driver;
		
	}
}
