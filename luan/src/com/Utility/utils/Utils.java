package com.Utility.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Utils {

	public static void waitForElement(long time, WebDriver driver, String type) throws Exception{

		// 等待页面加载的三种方式：页面加载等待、JS执行等待、默认等待方式
		if (type.equals("page")) {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		} else if (type.equals("script")) {
			driver.manage().timeouts().setScriptTimeout(time, TimeUnit.SECONDS);
		} else{
			Thread.sleep(time*1000);
		}
	}
	
}
