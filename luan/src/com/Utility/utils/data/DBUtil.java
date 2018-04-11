package com.Utility.utils.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {  
  
    /* 
     * URL中的127.0.0.1为本机地址，回送地址，因为MySQL服务是在本机上，java程序也在本机上， 
     * imooc为MySQL中一个数据库，指定后，后面便是对其中的表进行操作 
     * USER是MySQL用户的用户名，PASSWORD为密码 
     */  
    private static final String URL="jdbc:mysql://127.0.0.1:3306/imooc";  
    private static final String USER="root";  
    private static final String PASSWORD="23232";  
      
    public Connection getConnect() {  
          
        //1.加载驱动程序  
        /* 
         * 在com.mysql.jdbc.Driver中有一个静态的方法，new一个Driver，并将其加载到DriverManager中，代码如下 
         * static { 
                  try { 
                        java.sql.DriverManager.registerDriver(new Driver()); 
                       } catch (SQLException E) { 
                           throw new RuntimeException(“Can’t register driver!”); 
                       } 
                 } 
         * Class.forName()方法初始化指定的类（会执行其中的static...），并返回该类的对象 
         */  
        try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
          
        /*2.获得数据库的连接 
         * 在这其中的将URL，USER，PASSWORD传入DriverManager中的Driver对象(在JDBC中)， 
         * 通过JDBC返回一个连接给java的sql 
         */  
        Connection con = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
          
        //3.通过数据库的连接操作数据库，实现增删改查  
        Statement statement = null;
		try {
			statement = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        //查询数据,其中输入sql语句  
        ResultSet rSet = null;
		try {
			rSet = statement.executeQuery("SELECT name,age FROM tabletest");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
          
        //rSet.next()返回的是一个布尔类型的值，而且将指针指向下一条记录  
        try {
			while(rSet.next()){  
			    /* 
			     * 将获得的数据输入到控制台上，注意得到的方法，因为之前查询时获得的是两个值，一个string，一个int， 
			     * 使用其中的参数为string的方法，将值得名称传进去 
			     */  
			    System.out.println(rSet.getString("name")+","+rSet.getInt("age"));  
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;  
    }  
}  