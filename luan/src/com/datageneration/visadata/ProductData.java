package com.datageneration.visadata;
import java.util.List;

import com.Utility.utils.data.SheetFileInputStream;
import com.visa.businessmodel.ProductListobject;
import com.visa.businessmodel.Visa;

public class ProductData {
	public   String product;
	public  String dateStart;
	public  String dateBack;
	public  String adultNumber;
	public  String childNumber;

	//从表格里读取数据，取指定数值所在行的整行数值
	public  void productData(){
		SheetFileInputStream sheetFileInputStream=new SheetFileInputStream();
		List<Visa> name = sheetFileInputStream.getRandowValue(sheetFileInputStream.path,"日本签证");
		for (Visa visa : name) {
			product=visa.getName();
			dateStart=visa.getStartDate();
		}
		//ProductListobject p=new ProductListobject();
		/*dateBack=name.get(2);
		adultNumber=name.get(3);
		childNumber=name.get(4);*/		
	}

		
		
	

}