package com.Utility.utils.data;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionSql {  
public String username;
public String password;
public String dbname;
public String dbpath;
public Connection con=null;
//   public PreparedStatement pstmt;
//  public ResultSet set;

public  ConnectionSql(String username, String password, String dbname, String dbpath) {
    this.username = username;
    this.password = password;
    this.dbname = dbname;
    this.dbpath = dbpath;
    newConnection();
}

public Connection newConnection() {
    try {
        Class.forName("org.postgresql.Driver").newInstance();
        String url = String.format("jdbc:postgresql://%s/%s", this.dbpath, this.dbname);
        con = DriverManager.getConnection(url, this.username, this.password);
        return con;
    } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
        e.printStackTrace();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}

public String getOneFieldValue(String sql){
    PreparedStatement pstmt;
    String returnValue = "";
    try {
        pstmt =  (PreparedStatement) con.prepareStatement(sql);
        ResultSet set = pstmt.executeQuery();
        if(set.next()) {
             returnValue= set.getString(1);
         }
        set.close();
        pstmt.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return returnValue;
}

/**获取数据到对象中  注只会选择一条记录*/
public void getData2Obj(String sql,Object obj) {
    Field[] fs = obj.getClass().getDeclaredFields();
    PreparedStatement pstmt;
    try {
        pstmt =  (PreparedStatement) con.prepareStatement(sql);
        ResultSet set = pstmt.executeQuery();
        if(set.next()) {
            for(Field f:fs) {
                try {
                    String fieldName = f.getName();
                    String value = set.getString(fieldName);
                    if(value == null) {
                        value = "";
                    }
                    f.set(obj, value);
                }catch(Exception e) {}
            }        
         }
        set.close();
        pstmt.close();
    } catch (SQLException e) {
    //    e.printStackTrace();
    }
}

/**获取数据到链表中*/
public List<String> getValue2List(String sql){
    PreparedStatement pstmt;
    List<String> ls = new ArrayList<>();
    String returnValue = "";
    try {
        pstmt =  (PreparedStatement) con.prepareStatement(sql);
        ResultSet set = pstmt.executeQuery();
        while(set.next()) {
             ls.add(set.getString(1));
         }
        set.close();
        pstmt.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return ls;
}

public int update(String sql) {
    System.out.println("update sql语句:"+sql);

    int impactNumber = 0;
    PreparedStatement pstmt;
    try {
        pstmt = (PreparedStatement)con.prepareStatement(sql);
        impactNumber = pstmt.executeUpdate();          
        pstmt.close();
        return impactNumber;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return impactNumber;

}



public void closeConnection() throws Exception {

    try {
        /*
        if (this.set != null) {
            this.set.close();
        }
        if (this.pstmt != null) {
            this.pstmt.close();
        }*/
        if (this.con != null) {
            this.con.close();
        }

    } catch (SQLException e) {
        System.out.println(" Close Database Error： " + e.getMessage());
        throw e;
    }
}

}
