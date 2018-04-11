package test;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Window {
	public static void main(String[] args) throws InterruptedException {
		Getdriver getDriver=new Getdriver();
	    //WebDriver driver = getDriver.driver("http://www.baidu.com");
	    WebDriver driver = getDriver.driver("http://www.firefoxchina.cn/");    
	    
		       
		//标签窗口的前进和后退        	        
    /*  WebElement a=driver.findElement(By.name("tj_trnews"));  //定位超链接
	  a.click();//点击超链接  原标签页打开
	  driver.manage().window().maximize();    //窗口最大化  	
	  Thread.sleep(5000);
	  driver.navigate().back();  //页面窗口后退 
	  Thread.sleep(5000);
	  driver.navigate().forward();//页面窗口前进
	  driver.navigate().refresh();//页面刷新
  	*/	
	
		  
	  //浏览器2个标签窗口的切换		       
		/*        WebElement a=driver.findElement(By.id("setf"));  //定位超链接
		  	  a.click();//点击超链接  新标签页打开	  
		  	  WebElement aa=driver.findElement(By.id("jgwab"));  //定位超链接
		  	  aa.click();//点击超链接  新标签页打开
		        String handle = driver.getWindowHandle();     // 获取当前页面句柄    
		        Set<String> handles = driver.getWindowHandles();     // 获取所有页面的句柄 		   
				// 循环判断不是当前的句柄   
		        for (String hand : handles) {    
		            if ( driver.switchTo().window(hand).getPageSource().contains("如何把百度设为您的上网主页"))  { 
		            	driver.switchTo().window(hand);
		            	break;  
		            }		            
		        }    		        
		        WebElement xiaomi_link = driver.findElement(By.xpath(".//*[@id='head']/div[2]/a[3]"));  
		        xiaomi_link.click();  
		        Thread.sleep(1000);  */
		        
		      		        
	
	    
	  //浏览器窗口和iframe的切换		       
		      WebElement frame1= driver.findElement(By.xpath("html/body/div/div/div[2]/div[2]/div[7]/div[3]/div[3]/iframe"));  	      
		       driver.switchTo().frame(frame1);    
		       WebElement frame2= driver.findElement(By.xpath("html/body/div[2]/iframe")); 
		       driver.switchTo().frame(frame2);	
		       WebElement button= driver.findElement(By.partialLinkText("点点"));
		       button.click(); 
		       driver.switchTo().defaultContent();
		       WebElement input= driver.findElement(By.id("engine-key")); 
		       input.sendKeys("张翰");
		       
	
	
	}

}
