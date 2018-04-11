package com.visa.businessmodel;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class ProductListobject implements Cloneable{
	@Override
	public String toString() {
		return "ProductListobject [index=" + index + ", productname=" + productname + ", marketprice=" + marketprice
				+ ", Peerprice=" + Peerprice + ", orderbut=" + orderbut + "]";
	}

	public int  index;
	public String  productname;
	public String  marketprice;
	public String  Peerprice;
	public String  orderbut;



	public ProductListobject(String productname, String marketprice, String Peerprice,String orderbut, int index2) {
		super();
		this.productname = productname;
		this.marketprice = marketprice;
		this.Peerprice = Peerprice;	
		this.orderbut = orderbut;
		this.index = index2;
	}
	
	
	
/*	public int getProductname() {
		int tax = 0;
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(this.tax);
		while (matcher.find()) {
			tax += Integer.valueOf(matcher.group());
		}
		return tax;
	}*/
	
	
	public Object clone() {
		// TODO Auto-generated method stub
		try {
			return (ProductListobject) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}



}


