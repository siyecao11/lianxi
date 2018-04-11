package com.visa.testcase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.Utility.utils.Utils;
import com.datageneration.visadata.ProductData;
import com.visa.moduleaction.ProductListaction;

public class CreateOrder {
	public static WebDriver driver;
	ProductListaction productListaction=new ProductListaction();
	ProductData productData=new ProductData();
	
	@Test(groups = { "采购商进入指定签证产品详情页" })
	public void VisaDetail() throws Exception {
		
		
		productData.productData();
		productListaction.excuteVisaProducts(productData.product);	
		
		// 等待页面跳转等待
		Utils.waitForElement(5, driver, "page");				
	/*	String WindowId2 = driver.getWindowHandle();
		for (String WindowId : driver.getWindowHandles()) {
			if (WindowId.equals(WindowId2))
				{driver.close();
				continue;
				}
			driver=driver.switchTo().window(WindowId);
		}	*/
		//test 
				
		java.util.Set<String> hdls = driver.getWindowHandles();//获得当前页面的所有handles
	     for(String ahdl : hdls){		  		
		if(driver.switchTo().window(ahdl).getPageSource()=="立即预定")//必须找到窗口间唯一标识的窗口内容
 		 {driver.switchTo().window(ahdl);
 		 break;           		 }
 		
 		 else {
 			 //text
 			 driver.close();
 		 }
 		 } 	
				
	}
	
	
	
	
	
	
	
	
	/*
	@Test public void VisaOrder() throws Exception {		
		ProductDetailstaction.orderButtonClick();	
		ProductDetailstaction.setDateStart(ProductData.dateStart);	
		ProductDetailstaction.setDateBack(ProductData.dateBack);
	
		ProductDetailstaction.setAdultNumber(ProductData.adultNumber);
		ProductDetailstaction.setChildNumber(ProductData.childNumber);
		ProductDetailstaction.nextStepClick();
	}

	
	@Test public void createOrder() throws Exception {
		CreateOrderpage.setPassengers();
		CreateOrderaction.inviteButtonClick();
		CreateOrderaction.orderButtonClick();
		
}
	*/
	
	
	


/*	//@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult result) {

		String ImageFileName = result.getMethod().getMethodName() + ".png";

		a.snapshot((TakesScreenshot) driver, ImageFileName);

		driver.quit();

	    Log.info(result.getMethod().getMethodName());

	    driveraction.moveLogScreenshot(result.getMethod().getMethodName());
	}*/
	


	
	
	
	






}

