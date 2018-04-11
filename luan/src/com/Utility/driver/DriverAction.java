package com.Utility.driver;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DriverAction {
	
	public  WebDriver driver;

	@Test
	public void driverAction(WebDriver driver) {
		this.driver = driver;

	}

	
	public static WebDriver setDriver( String op3purchase_url) {
		System.setProperty("webdriver.firefox.bin",
				"D:\\Program Files (x86)\\Mozilla Firefo\\firefox.exe");
		ProfilesIni allprofiles = new ProfilesIni();
		FirefoxProfile profile = allprofiles.getProfile("default");
		WebDriver driver = new FirefoxDriver(profile);
		System.out.println("ss"+op3purchase_url);
		driver.get(op3purchase_url);
		return driver;
	}

	public static void moveLogScreenshot(String testcaseName) {
		SimpleDateFormat datetime = new SimpleDateFormat("yyyyMMddhhmmss");

		Calendar cal = Calendar.getInstance();
		String projectpath = System.getProperty("user.dir");
		String logPath = projectpath + "\\log\\";
		String moment = datetime.format(cal.getTime());
		File folder = new File(logPath + testcaseName + "\\" + moment);
		if (!folder.exists()) {
			folder.mkdirs();
		}

		try {
			File screenshot = new File(projectpath + "\\screenshot");
			File[] fs = screenshot.listFiles();
			for (File file : fs) {
				if (file.renameTo(new File(folder + "\\" + file.getName()))) {
					System.out.println(String.format("Screenshot %s is moved successful!", file.getName()));
				} else {
					System.out.println(String.format("Screenshot %s failed to move!", file.getName()));
				}
			}

			File log4j = new File(projectpath + "\\smoking.log");
			File testcaseLog = new File(folder + "\\" + testcaseName + ".log");

			FileReader reader = new FileReader(log4j);
			FileWriter writer = new FileWriter(testcaseLog);
			int len = 0;
			while ((len = reader.read()) != -1) {
				writer.write(len);
			}
			writer.flush();
			reader.close();
			writer.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		String userDirector = System.getProperty("user.dir") + "/";
		Reporter.log("<a href=\"" + userDirector + "Log\\" + testcaseName + "\\" + moment + "\\" + testcaseName + ".png"
				+ "\"><img src=\"" + userDirector + "Log\\" + testcaseName + "\\" + moment + "\\" + testcaseName
				+ ".png" + "\" alt=\"\"" + "height='100' width='100'/> " + "<br />");
		Reporter.setCurrentTestResult(null);

	}
	
	
	
	
}


