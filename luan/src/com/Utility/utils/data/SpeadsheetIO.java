package com.Utility.utils.data;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.jna.StringArray;
import com.visa.businessmodel.Visa;

public class SpeadsheetIO {
	
	private static final String[] NULL = null;
	private XSSFWorkbook wb;//表文件
	private XSSFSheet sheet;//表工作区域
	private XSSFRow row;//表行
	

	
	/**111111111111读取Excel表格表头的内容数组
	 * @param InputStream《数据流》
	 * @return String 表头内容的数组
	 */
	public String[] readExcelTitle(InputStream is) {		
		try {
			wb = new XSSFWorkbook(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet = wb.getSheetAt(0);//取第一个工作区
		int rowNum = sheet.getLastRowNum();// 得到总行数《非物理行数》，不包含行属性
		row = sheet.getRow(0);	//取第一行的物理数据数据，即去的表的第一行行属性
		int colNum = row.getLastCellNum();// 标题总列数
		String[] title = new String[colNum];
		for (int i = 0; i < colNum; i++) {
			 title[i] = row.getCell(i).getStringCellValue().trim();
			 System.out.println(title[i]);
		}	
		return title;
	}

	
	/**
	 * 222222222取指定数值所在行的整行数值
	 **/
	/*public List<String> getRandomValue(InputStream is, String columnName) {
		//titles = null;
		try {	
			wb = new XSSFWorkbook(is);		
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = wb.getSheetAt(0);	//取第一个工作区	
		int rowNum = sheet.getLastRowNum();// 得到总行数《非物理行数》
		
		

		List<String> list = new ArrayList<String>();
		for (int rowIndex = 0; rowIndex <= rowNum; rowIndex++) {
			row = sheet.getRow(rowIndex);//取物理行数第一行
			int colNum = row.getLastCellNum();
		for (int columnIndex = 0; columnIndex <colNum; columnIndex++) {
			
			String a=row.getCell(columnIndex).getStringCellValue().trim();
			if (a.equals(columnName)) {			
			
					  a = row.getCell(0).getStringCellValue();
					  System.out.println(a);
					  list.add(a);
					  System.out.println(a);
					  String b = row.getCell(1).getStringCellValue();
					  list.add(b);
					  String c = row.getCell(2).getStringCellValue();
					//titles[i]=row.getCell(i).getStringCellValue().trim().;		
					// System.out.println(titles[i]);
					
				return list;
			}
			
		}
		
		}
	
		return list;
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	public List<Visa> getRandomValue(InputStream is, String columnName) {
		// titles = null;
		try {
			wb = new XSSFWorkbook(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = wb.getSheetAt(0); // 取第一个工作区
		int rowNum = sheet.getLastRowNum();// 得到总行数《非物理行数》

		List<Visa> list = new ArrayList<Visa>();
		for (int rowIndex = 0; rowIndex <= rowNum; rowIndex++) {
			row = sheet.getRow(rowIndex);// 取物理行数第一行
			int colNum = row.getLastCellNum();
			for (int columnIndex = 0; columnIndex < colNum; columnIndex++) {
				String a = row.getCell(columnIndex).getStringCellValue().trim();
				if (a.equals(columnName)) {
					Visa visa = new Visa();
					visa.setName(row.getCell(0).getStringCellValue());
					visa.setStartDate(row.getCell(1).getStringCellValue());
					visa.setEndDate(row.getCell(2).getStringCellValue());
					list.add(visa);
					return list;
				}
			}
		}
		return list;
	}

     


	
	
	
	
	
	
	

}
