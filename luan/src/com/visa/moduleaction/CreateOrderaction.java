package com.visa.moduleaction;
import com.Utility.driver.PageDriver;
import com.Utility.log.Log;
import com.login.purchaselogin.testcase.LoginPurchase;

public class CreateOrderaction {
	static PageDriver	pageInit=new  PageDriver(LoginPurchase.driver);	

	
	//点击提交订单按钮
			public static void orderButtonClick(){	
				try{
					pageInit.createOrderPage.submitOrderButton.click();
					Log.info("提交订单按钮点击成功");
				}catch (Exception e){
					Log.info(e.getMessage());
				}
			}
			
	//点击自取按钮
			public static  void inviteButtonClick(){	
				try{
					pageInit.createOrderPage.inviteButton.click();
					Log.info("自取按钮点击成功");
				}catch (Exception e){
					Log.info(e.getMessage());
				}
			}
}
