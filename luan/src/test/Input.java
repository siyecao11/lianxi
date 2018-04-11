package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Input {
	public static void main(String[] args) throws InterruptedException {
		Getdriver getDriver=new Getdriver();
	    WebDriver driver = getDriver.driver("http://www.baidu.com");
	        	        
  WebElement input=driver.findElement(By.id("kw"));  //定位输入框
  WebElement buttom=driver.findElement(By.id("su"));  //定位输入框
  input.click();//点击输入框
  input.clear();//清除输入框的内容
  input.sendKeys("张翰");//输入搜索词
  buttom.click();//点击输入框
	
  
	}
}