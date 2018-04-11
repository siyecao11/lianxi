package com.Utility.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.login.purchaselogin.moduleaction.LoginAction;
import com.login.purchaselogin.moduleaction.WelcomeAction;
import com.login.purchaselogin.pageelement.LoginPage;
import com.login.purchaselogin.pageelement.WelcomePage;
import com.visa.pageelement.CreateOrderpage;
import com.visa.pageelement.ProductDetailspage;
import com.visa.pageelement.ProductListpage;

public class PageDriver {	
	
	public   LoginPage loginPage;
	public   LoginAction loginAction;
	public   WelcomeAction welcomeAction;
	
	public  WelcomePage welcomePage;
	public  ProductListpage productListPage;
	public  ProductDetailspage productDetailsPage;
	public  CreateOrderpage createOrderPage;
	




		public   void pageDriver(WebDriver driver) {	
			this.loginPage = PageFactory.initElements(driver, LoginPage.class);
			this.welcomePage = PageFactory.initElements(driver, WelcomePage.class);
			this.productListPage = PageFactory.initElements(driver, ProductListpage.class);
			this.productDetailsPage = PageFactory.initElements(driver, ProductDetailspage.class);
			this.createOrderPage = PageFactory.initElements(driver, CreateOrderpage.class);	
			//this.loginAction = PageFactory.initElements(driver, LoginAction.class);	
			
			//this.welcomeAction = PageFactory.initElements(driver, WelcomeAction.class);	
		}


		
			  	
		
	
}


