package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class A {
	public static void main(String[] args) throws InterruptedException {
		Getdriver getDriver=new Getdriver();
	    WebDriver driver = getDriver.driver("http://www.baidu.com");
		        
		        
	/*  WebElement a=driver.findElement(By.id("setf"));  //定位超链接
	  a.click();//点击超链接  新标签页打开	  
	  WebElement aa=driver.findElement(By.id("jgwab"));  //定位超链接
	  aa.click();//点击超链接  新标签页打开
*/	  
	
	    
	  WebElement a=driver.findElement(By.name("tj_trnews"));  //定位超链接
	  a.click();//点击超链接  原标签页打开	
	  Thread.sleep(5000);
	  driver.navigate().back();  //页面窗口后退 
	  Thread.sleep(5000);
	  WebElement aa=driver.findElement(By.name("tj_trmap"));  //定位超链接
	  aa.click();//点击超链接  原标签页打开
	  
		
		}

}
