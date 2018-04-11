package com.login.purchaselogin.testcase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Utility.driver.DriverAction;
import com.Utility.utils.Utils;
import com.datageneration.logindata.LoginData;
import com.login.purchaselogin.moduleaction.LoginAction;
import com.login.purchaselogin.moduleaction.WelcomeAction;

public class LoginPurchase  {
	public static  WebDriver driver;
	LoginData loginPurchaseData=new LoginData();
	LoginAction loginAction=new LoginAction();
	WelcomeAction welcomeAction=new WelcomeAction();
    
         
	@Test(groups = { "采购商登陆进入签证项目" })
	public void loginVisa() throws Exception {	
		loginPurchaseData.loginPurchaseBeta();
	 	 driver = DriverAction.setDriver(loginPurchaseData.purchase_url);	 
	 	loginAction.setUserNameValue(loginPurchaseData.purchase_username);
	 	loginAction.setPasswordValue(loginPurchaseData.purchase_password);
	  	loginAction.clickLogin();
		Utils.waitForElement(5, driver, "page");
		welcomeAction.excuteVisa();		
		
	} 
	
	
	
		
	
}
