package com.Utility.utils.data;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import com.visa.businessmodel.Visa;

public class SheetFileInputStream {
	 static File  file=new File("configuration/properties/visaOrder.xlsx");
	public  String path = file.getAbsolutePath().substring(0);

	//111111111111读取Excel表格表头的内容数组
	public  String[] readExcelTitle(String speadsheetName) {
		SpeadsheetIO speadsheet = new SpeadsheetIO();
		String[] name = null ;
		try {
			FileInputStream is = new FileInputStream(speadsheetName);
			name = speadsheet.readExcelTitle(is);
			return name;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return name;
	}
	
	//222222222取指定数值所在行的整行数值
	public List<Visa> getRandowValue(String speadsheetName, String columnName) {
		SpeadsheetIO speadsheet = new SpeadsheetIO();
		List<Visa> list = null;
		try {
			FileInputStream is = new FileInputStream(speadsheetName);
			list = speadsheet.getRandomValue(is, columnName);
			return list;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	

	
	
			

}
