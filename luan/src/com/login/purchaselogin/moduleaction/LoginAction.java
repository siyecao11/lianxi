package com.login.purchaselogin.moduleaction;
import org.testng.annotations.Test;
import com.Utility.driver.PageDriver;
import com.Utility.log.Log;
import com.login.purchaselogin.testcase.LoginPurchase;

public class LoginAction  {
	PageDriver	pageInit=new PageDriver();	

	
	//输入用户名
		@Test
		public   void setUserNameValue(String username){	
			
			try{
				pageInit.pageDriver(LoginPurchase.driver);
				pageInit.loginPage.userName.sendKeys(username);
				Log.info("输入用户名:" + username);
			}catch (Exception e){
				Log.info(e.getMessage());
			}
		}
	
		//输入密码
		@Test
		public   void setPasswordValue(String password){			
			try{
				pageInit.loginPage.passWord.sendKeys(password);
				Log.info("输入密码:" + password);
			}catch (Exception e){
				Log.info(e.getMessage());
			}
		}
	
		//点击登录按钮
		@Test
		public  void clickLogin(){		
		try{
			pageInit.loginPage.loginBtn.click();
				Log.info("点击登录按钮");
			}catch (Exception e){
				Log.info(e.getMessage());
			}
		}

		
			
			
			
}
