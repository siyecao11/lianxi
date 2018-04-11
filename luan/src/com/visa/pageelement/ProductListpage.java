package com.visa.pageelement;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductListpage {
	static List<WebElement> elementLists;

	//定位产品框对象
	@FindBy(how=How.XPATH,xpath="//div[@class='tour_resultDiv visa_list_tr']")
	public  List<WebElement> productlist;
	
	//定位产品页数
	@FindBy(how=How.XPATH,xpath="//*[@id='paginationDiv']/div/ul/li")
	public  List<WebElement> pagelist;

	//定位查看详情按钮
	@FindBy(how=How.XPATH,xpath="//*[@class='center center_2']")
	public  List<WebElement> orderbutton;
	
  
	
	
	
	/*//通过产品名称回去
	public static  ProductListobject getProductinfo(String name) throws Exception {
		return getProductinfo(name, "", ""); 
	}
	
	//通过产品名称和价格获取价格
	public static  ProductListobject getProductinfo( String name, String mprice, String tprice) throws Exception {
		List<ProductListobject> ProductListobjects = new ArrayList<ProductListobject>();
		int index = 0;
	for(int i=1;i<pagelist.size()-1;i++){	
		if(index%10==0)
		{		
			pagelist.get(i).click();		
			elementLists =productlist;
			}				
		for (WebElement product:elementLists) {
			 ProductListobjects.add (new ProductListobject(product.findElement(By.xpath(".//span[@class='fontBigTitle view_product_detail_btn']")).getText(),
					product.findElement(By.xpath(".//div[@class='marketPrice']")).getText(),
					product.findElement(By.xpath(".//span[@class='tour_price_block']")).getText(),
					product.findElement(By.xpath(".//a[@class='adaptiveButton mediumOrange_btn view_product_detail_btn']")).getText(),
					index++));
			 System.out.println(ProductListobjects);
				if (getSpeciProductinfo(ProductListobjects, name, mprice, tprice) != null) {
			 		
					return getSpeciProductinfo(ProductListobjects, name, mprice, tprice);
				}					
		} //System.out.println(ProductListobjects);
			}
	 //System.out.println(ProductListobjects);
	return null;
	}
	
	//获取产品途径的方法
	public static   ProductListobject getSpeciProductinfo(List<ProductListobject> ProductListobjects, String name, String mprice,String tprice) {
		String speciname = name;
		String specimprice = mprice;
		String specitprice = tprice;
		ProductListobject selectionproduct = null;
		

		inner: for (ProductListobject speciproduct : ProductListobjects) {
			if (speciproduct.productname.contains(speciname)) {
							selectionproduct = cloneObject(speciproduct);
							break inner;
						}
			}		
		return selectionproduct;
	}
	
	//获取产品途径的方法---复制对象
	private static  ProductListobject cloneObject(ProductListobject speciproduct) {
		ProductListobject selectionproduct = (ProductListobject) speciproduct.clone();
		return selectionproduct;
	}
	

	
	
	
	
	
*/

		
	
	
}
	
	
	
	

	
	
	
	
	
	
	
	
	


