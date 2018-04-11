package com.login.purchaselogin.pageelement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class  WelcomePage {

	
	//定位签证一级导航
	@FindBy(how=How.XPATH,xpath="html/body/div[3]/header/nav/ul/li[7]/a")
	public  WebElement visa;
	
	//定位国内机票一级导航元素
	@FindBy(how=How.XPATH,xpath="//input[@type='password' and @name='password']")
	public  WebElement domestiair;

	
}
