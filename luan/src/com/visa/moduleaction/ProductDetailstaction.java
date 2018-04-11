package com.visa.moduleaction;
import com.Utility.driver.PageDriver;
import com.Utility.log.Log;
import com.login.PurchaseLogin.testcase.LoginPurchase;

public class ProductDetailstaction {

	static PageDriver	pageInit=new  PageDriver(LoginPurchase.driver);		
	//点击预定按钮
	public static void orderButtonClick(){	
	  try{
		  pageInit.productDetailsPage.orderButton.click();
			Log.info("立即预定按钮点击成功");
		}catch (Exception e){
			Log.info(e.getMessage());
			}
		}
		
		
	//输入出发时间
	public static  void setDateStart(String datestart){	
		try{
			 pageInit.productDetailsPage.dateStart.sendKeys(datestart);
			Log.info("输入出发时间:" + datestart);
			}catch (Exception e){
			Log.info(e.getMessage());
					}
		 pageInit.productDetailsPage.blank.click();
				}

							
	//输入归来时间
	public  static void setDateBack(String dateback){			
	 try{
		 pageInit.productDetailsPage.dateBack.sendKeys(dateback);				
		Log.info("输入归来时间:" + dateback);
	   }catch (Exception e){
			Log.info(e.getMessage());
					}
	 pageInit.productDetailsPage.blank.click();
				}
			
						
	//输入用户名
	public static void setAdultNumber(String adultnumber){	
	 try{
		 pageInit.productDetailsPage.adultNumber.sendKeys(adultnumber);
		Log.info("输入成人数:" + adultnumber);
		}catch (Exception e){
		Log.info(e.getMessage());
					}
				}
				
		
	//输入儿童数
	public static void setChildNumber(String childnumber){			
	try{
		 pageInit.productDetailsPage.childNumber.sendKeys(childnumber);
		Log.info("输入儿童数:" + childnumber);
		}catch (Exception e){
		Log.info(e.getMessage());
					}
				}
		
	//点击下一步按钮
	public static  void nextStepClick(){			
	 try{
		 pageInit.productDetailsPage.nextStep.click();
		Log.info("点击签证下一步按钮成功");
		}catch (Exception e){
		Log.info(e.getMessage());
					}
				}
}
