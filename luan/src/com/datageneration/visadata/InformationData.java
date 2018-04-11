package com.datageneration.visadata;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class InformationData {
	public static String[] passengers_name;
	public static String[] certificate_passport;
	public static String[] certificate_idcard;
	public static String[] mobelPhone;

	
	static {
		Properties pps = new Properties();
		FileInputStream in = null;
		try {
			in = new FileInputStream("E:\\ydr\\visa\\luan\\configuration\\properties\\visa\\passengers.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pps.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	//从配置文件读取多数据组
    passengers_name= pps.getProperty("passengers_name").split(",");	
    for(int i = 0;i<passengers_name.length;i++){
    	try {
			passengers_name[i] = new String(passengers_name[i].getBytes("ISO8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(passengers_name[i]);
    }
		
		
    certificate_passport= pps.getProperty("certificate_passport").split(",");	
    for(int i = 0;i<certificate_passport.length;i++){
    	try {
    		certificate_passport[i] = new String(certificate_passport[i].getBytes("ISO8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(certificate_passport[i]);
    }
    
    
    
    mobelPhone= pps.getProperty("mobelPhone").split(",");	
    for(int i = 0;i<mobelPhone.length;i++){
    	try {
    		mobelPhone[i] = new String(mobelPhone[i].getBytes("ISO8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(mobelPhone[i]);
    }
	  
	
	
}
}