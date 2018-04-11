package com.login.purchaselogin.moduleaction;
import org.testng.annotations.Test;
import com.Utility.driver.PageDriver;
import com.Utility.log.Log;
import com.login.purchaselogin.testcase.LoginPurchase;

@Test
public  class WelcomeAction {
	
	PageDriver	pageInit=new  PageDriver();	
	
	//点击签证一级导航按钮
	public  void excuteVisa() throws Exception {		
		pageInit.pageDriver(LoginPurchase.driver); 
		pageInit.welcomePage.visa.click();
		Log.info(" 点击签证一级导航按钮，进入签证产品列表页面");
	}
	
	

}
