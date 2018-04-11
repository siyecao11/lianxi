package com.visa.moduleaction;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utility.driver.PageDriver;
import com.datageneration.visadata.ProductData;
import com.login.purchaselogin.testcase.LoginPurchase;
import com.visa.businessmodel.ProductListobject;
import com.visa.pageelement.ProductListpage;


public class ProductListaction {
    PageDriver	pageInit=new  PageDriver();	
    List<WebElement> elementLists;
	
	//跟合理的定位产品
    public   void excuteVisaProducts(String speciproduct) throws Exception{
    	pageInit.pageDriver(LoginPurchase.driver); 		
    	   int index = getProductinfo(speciproduct);
    		int i=(index)%10;
    		pageInit.productListPage.orderbutton.get(i).click();  		
    	}
    
	
    public  int getProductinfo( String name) throws Exception {
		String productName = null;
		int index = 0;
		elementLists =pageInit.productListPage.productlist;
	for(int i=1;i<pageInit.productListPage.pagelist.size()-1;i++){	
		if(index%10==0)
		{		
			pageInit.productListPage.pagelist.get(i).click();		
			elementLists =pageInit.productListPage.productlist;
			}				
		for (WebElement product:elementLists) {
			 productName=product.findElement(By.xpath(".//span[@class='fontBigTitle view_product_detail_btn']")).getText();
			if(productName==name){
				return index;
					}					
					index++;			
				}					
		return index;
	}
	return index; 
			
	
	
	
	
	}
    
    
    
    
    
    
    
    
    
    
    
	}


