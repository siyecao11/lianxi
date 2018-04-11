
package com.visa.pageelement;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utility.log.Log;
import com.datageneration.visadata.InformationData;
import com.visa.businessmodel.Passengersobject;
import com.visa.businessmodel.ProductListobject;

public class CreateOrderpage {
  
	//定位自取按钮
	@FindBy(how=How.XPATH,xpath="html/body/section/section/div[2]/div[1]/div[3]/div[2]/div[1]/label[2]")
	public WebElement inviteButton;

	//定位提交订单按钮
	@FindBy(how=How.CLASS_NAME,className="center")
	public WebElement submitOrderButton;	
	
	//定位旅客信息框元素
		@FindBy(how=How.XPATH,xpath="//div[@class='tour_infoList clearfix visa_order_visitor']")
		public static List<WebElement> passengersList;
	
     //输入旅客信息
	public static   void setPassengers() throws Exception {		
	   int i=0;		
		for (WebElement passenger:passengersList) {	
			passenger.findElement(By.xpath(".//tr[2]/td/input")).sendKeys(InformationData.passengers_name[i]);
			passenger.findElement(By.xpath(".//tr[3]/td/input")).sendKeys(InformationData.certificate_passport[i]);
			passenger.findElement(By.xpath(".//tr[4]/td/input")).sendKeys(InformationData.mobelPhone[i]);
			i++;
			}	
		}	
	

}





