package test;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ShuBiao {
	
	  @Test
		public void  mouse() throws InterruptedException, IOException {	    
			Getdriver getDriver=new Getdriver();	   
			WebDriver driver = getDriver.driver("https://www.baidu.com/"); 
		
			/*WebElement button=driver.findElement(By.id("su"));
			Actions action = new Actions(driver);
	       action.moveToElement(button).click().perform();*/   //鼠标移动操作
	        
	      
			/*WebElement button1=driver.findElement(By.xpath(".//*[@id='u1']/a[8]"));
			Actions action = new Actions(driver);
	       action.moveToElement(button1).perform();*/   //鼠标悬停操作
	       
	       
			/*WebElement button=driver.findElement(By.name("tj_trnews"));
			Actions action = new Actions(driver);
	       action.click(button).perform(); */    //鼠标左键点击操作
			
			
			/*WebElement button=driver.findElement(By.id("kw"));
			WebElement button1=driver.findElement(By.id("su"));
			button.sendKeys("张翰");
			button1.click();
			Thread.sleep(4000);
			Actions action = new Actions(driver);
	       action.doubleClick(button).perform();*/    //鼠标左键双击操作
			
			
			/*WebElement button=driver.findElement(By.name("tj_trnews"));
			Actions action = new Actions(driver);
	       action.contextClick(button).perform();*/    //鼠标右键点击操作
			
			
			WebElement button=driver.findElement(By.name("tj_trnews"));
			Actions action = new Actions(driver);
	       action.clickAndHold(button).perform();     //在此元素上按下左键不放
	       action.release().perform();  //鼠标释放
			
			
			
			/*WebElement button=driver.findElement(By.name("tj_trnews"));
			WebElement button1=driver.findElement(By.id("kw"));
			Actions action = new Actions(driver);
	       action.dragAndDrop(button, button1).perform();  //从一个元素的位置，拖至另一个元素位置松开
*/       
			
			
			/*WebElement button=driver.findElement(By.name("tj_trnews"));
			WebElement button1=driver.findElement(By.id("kw"));
			Actions action = new Actions(driver);
	       action.clickAndHold(button).moveToElement(button1).perform();
	       action.release().perform();*/  //此代码同以上代码
			
			
	
			
			
			
}
}