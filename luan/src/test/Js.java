package test;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class Js {
	
      @Test
	public void  jsDisplay() throws InterruptedException, IOException {	    
		Getdriver getDriver=new Getdriver();	   
		WebDriver driver = getDriver.driver("http://www.ctrip.com/"); 
	   
		
		/* String jsString = "document.getElementById('J_cildNumSelectorBox').style.display='block';";
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript(jsString);		 
	     WebElement button=driver.findElement(By.xpath(".//*[@id='J_AdultCount']/span[2]/i"));  
	     button.click();*/  //js去除dispaly=none，使dispaly为block出来，特殊情况：如果页面F12元素就没展示出来，这个方法是不能用的只能使用鼠标操作
	
		
		/*WebElement button=driver.findElement(By.id("J_RoomGuestInfoTxt"));  
		String jsString = "document.getElementById('J_RoomGuestInfoTxt').removeAttribute('readonly');";
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript(jsString);		   
	     button.clear();
	     button.sendKeys("123");*/   //某个元素只能只读，如果想对其编辑修改，需要js去除readonly
		
	    
		//String jsString = "document.getElementById('footer').scrollIntoView();";
		 String jsString = "document.getElementsByClassName('supply-title')[0].scrollIntoView();";
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript(jsString);	//通过js使滚动条移动到指定的元素位置	   
		
		
		
		
	    
	}
	
}
