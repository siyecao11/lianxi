package com.login.purchaselogin.pageelement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

@Test
public class LoginPage{

		// 定位用户名元素
		@FindBy(how=How.XPATH,xpath="//input[@name='username']")
		public   WebElement userName;
		
		// 定位密码元素
		@FindBy(how=How.XPATH,xpath="//input[@type='password' and @name='password']")
		public    WebElement passWord;
		
		// 定位登录元素
		@FindBy(how=How.XPATH,xpath="//input[@name='login']")
		public   WebElement loginBtn;	
				
	
}
