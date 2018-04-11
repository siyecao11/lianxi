package test;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Getdriver {
	 
		//纯净版的火狐浏览器
	/*	@Test
		public void a(){
		System.setProperty("webdriver.firefox.bin",
		"D:\\Program Files (x86)\\Mozilla Firefo\\firefox.exe");
		System.setProperty("webdriver.firefox.marionette", "configuration/driver/geckodriver.exe"); 
	    WebDriver driver = new FirefoxDriver(); 
        driver.get("http://www.baidu.com");
		}*/
	
	
		//默认打开自己电脑安装的火狐浏览器，
      /* @Test
		public void a() throws InterruptedException{
		System.setProperty("webdriver.firefox.bin",
		"D:\\Program Files (x86)\\Mozilla Firefo\\firefox.exe");
		System.setProperty("webdriver.firefox.marionette", "configuration/driver/geckodriver.exe"); 
        ProfilesIni allprofiles = new ProfilesIni();
	   FirefoxProfile profile = allprofiles.getProfile("default");//--FirefoxProfile 用户配置文件
	WebDriver driver = new FirefoxDriver(profile); //--FirefoxDriver 浏览器实例
        driver.get("http://www.baidu.com");
        Thread.sleep(40000);
        }*/
	
        
				
	//谷歌浏览器	
	/*@Test
	public void a(){
		System.setProperty("webdriver.chrome.driver", "configuration/driver/chromedriver.exe");        
		ChromeDriver driver = new ChromeDriver();  
	        driver.get("http://www.baidu.com/"); 
	}*/
	
		
		
	//64位ie浏览器   
	/*@Test
	public void a(){
	       System.setProperty("webdriver.ie.driver", "configuration/driver/IEDriverServer.exe"); 
	        DesiredCapabilities capabilities =DesiredCapabilities.internetExplorer();
	        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
	        capabilities.setCapability("ignoreProtectedModeSettings",true);
	        WebDriver driver = new InternetExplorerDriver(capabilities);
	        driver.get("http://www.baidu.com/");  
	     }*/
	        
	        
	
	
	@Test
	public  WebDriver driver(String url) throws InterruptedException{
		System.setProperty("webdriver.firefox.bin",
	"D:\\Program Files (x86)\\Mozilla Firefo\\firefox.exe");
	System.setProperty("webdriver.firefox.marionette", "configuration/driver/geckodriver.exe"); 
   // ProfilesIni allprofiles = new ProfilesIni();
   //FirefoxProfile profile = allprofiles.getProfile("default");//--FirefoxProfile 用户配置文件
     WebDriver driver = new FirefoxDriver(); //--FirefoxDriver 浏览器实例
    driver.get(url);
    Thread.sleep(4000); 
    return driver;
    }
	
	
	
	
	}

