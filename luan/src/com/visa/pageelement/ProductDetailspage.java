package com.visa.pageelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utility.driver.PageDriver;

public class ProductDetailspage {
	//定位立即预定按钮
	@FindBy(how=How.XPATH,xpath="//*[@class='btn_booking bookingBtn ac-bookingBtn']")
	public WebElement orderButton;

	//定位出发日期的日历
	@FindBy(how=How.XPATH,xpath="//*[@id='departureDateInput']/input")
	public WebElement dateStart;
	
	//定位归来日期的日历
	@FindBy(how=How.XPATH,xpath="//*[@id='goBackDateInput']/input")
	public WebElement dateBack;
	
	//定位空白页面
	@FindBy(how=How.XPATH,xpath="//*[@id='booking_form']/div[1]/h4")
	public WebElement blank;
	
	//签证指定产品详情页，成人数定位
	@FindBy(how=How.XPATH,xpath="//*[@id='countOfAdultInput']/input")
	public WebElement adultNumber;
	
	//签证指定产品详情页，儿童数定位
	@FindBy(how=How.XPATH,xpath="//*[@id='isChildInput']/input")
	public WebElement childNumber;
	
	//签证指定产品详情页，下一步定位
	@FindBy(how=How.CLASS_NAME,className="booking_next_step")
	public WebElement nextStep;
	
	
		
		
	
	
	
	
	
	


}
