package com.datageneration.logindata;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginData {
    public   String purchase_username;
	public   String purchase_password;
	public   String payment_password;
	public   String purchase_url;
	
	public  void loginPurchaseBeta(){	
		Properties pps = new Properties();
		FileInputStream in = null;
		File  file=new File("configuration/properties/login.properties");
		String path = file.getAbsolutePath();
		System.out.println(path);//取改配置文件的绝对路径，并存到path中
		
		try {
			in = new FileInputStream(path);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//in = new FileInputStream("E:\\ydr\\visa\\luan\\configuration\\properties\\login\\login.properties");
		
		try {
			pps.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		purchase_url = pps.getProperty("betapurchase_url");
		purchase_username = pps.getProperty("betapurchase_username");
		purchase_password = pps.getProperty("betapurchase_password");		

	}
	
}	

//从配置文件里读取数据的前提设置
	/*static {
		Properties pps = new Properties();
		FileInputStream in = null;
		File  file=new File("configuration/properties/login.properties");
		String path = file.getAbsolutePath();
		System.out.println(path);//取改配置文件的绝对路径，并存到path中
	
		try {
			in = new FileInputStream(path);
			//in = new FileInputStream("E:\\ydr\\visa\\luan\\configuration\\properties\\login\\login.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			pps.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//从配置文件读取数据
		op3purchase_url = pps.getProperty("op3purchase_url");
		System.out.println(op3purchase_url);
		op3purchase_username = pps.getProperty("op3purchase_username");
		System.out.println(op3purchase_username);
		op3purchase_password = pps.getProperty("op3purchase_password");
		System.out.println(op3purchase_password);*/

	

