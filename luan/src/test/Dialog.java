package test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dialog {

	@Test(groups = { "弹框处理" })
	public void dialog() throws InterruptedException{
		Getdriver getDriver=new Getdriver();	   
		WebDriver driver = getDriver.driver("file:///E:/lianxi/luan/filesource/new.html"); 	
		
		/*//警告框处理
		WebElement alert =driver.findElement(By.id("alert"));
		alert.click();
		Thread.sleep(2000);
		Alert javascripalert=driver.switchTo().alert(); // 定义当前弹框对象，跳到弹框页面元素中
		System.out.println(javascripalert.getText());  //输出弹框显示的内容
		javascripalert.accept();  //点击弹框的确认按钮 */	
		
		
		/*//确认框处理
		WebElement alert =driver.findElement(By.id("confirm1"));
		alert.click();
		Thread.sleep(2000);
		Alert javascripalert=driver.switchTo().alert(); // 定义当前弹框对象，跳到弹框页面元素中
		System.out.println(javascripalert.getText());  //输出弹框显示的内容
		//javascripalert.accept();  //点击弹框的确认按钮 
		javascripalert.dismiss(); //点击弹框的取消按钮  */	
		
		
	/*	//提示框处理
		WebElement alert =driver.findElement(By.id("prompt"));
		alert.click();
		Thread.sleep(2000);
		Alert javascripalert=driver.switchTo().alert(); // 定义当前弹框对象，跳到弹框页面元素中
		System.out.println(javascripalert.getText());  //输出弹框显示的内容
		javascripalert.sendKeys("nihao");
		Thread.sleep(2000);
		//javascripalert.accept();  //点击弹框的确认按钮 
		javascripalert.dismiss(); //点击弹框的取消按钮   */	
	
		
		//嵌套框处理
		WebElement alert =driver.findElement(By.id("confirm"));
		alert.click();
		Thread.sleep(2000);
		Alert javascripalert=driver.switchTo().alert(); // 定义当前弹框对象，跳到弹框页面元素中
		System.out.println(javascripalert.getText());  //输出弹框显示的内容
		javascripalert.accept();  //点击弹框的确认按钮 
		Thread.sleep(2000);
		javascripalert=driver.switchTo().alert();// 定义当前弹框对象，跳到弹框页面元素中
		System.out.println(javascripalert.getText());  //输出弹框显示的内容
		javascripalert.accept();  //点击弹框的确认按钮 

		
		
		
		
		
		
		
		
		
		
	}
}
