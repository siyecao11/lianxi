package com.Utility.utils.data;
import java.sql.Connection;  
import java.sql.Date;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
import java.util.ArrayList;  
import java.util.List;  
import java.util.Map; 
//import com.Utility.utils.data.DBUtil;
  
 
  
public class GoddessMod {  
	DBUtil DBUtil=new DBUtil();
	
	
    public void addGoddess(Godes g) throws Exception {  
        // 每次对数据库操作的时候都要建立连接  
    	Connection connection = DBUtil.getConnect();  
  
        // 下面的3块是一个完整体系  
        // (1) sql语句字符串，并没有实际的赋值，这样可以抽象化  
        // 这里并没有给id赋值，因为在表中id为主键，且设为自动递增  
        String sql = "" + "INSERT INTO tabletest" + "(name,age,birthday) VALUES(" + "?,?,?)";  
        // (2)预处理，类似于sql中的存储过程  
        PreparedStatement pres = connection.prepareStatement(sql);  
        // (3)赋值  
        pres.setString(1, g.getName());  
        pres.setInt(2, g.getAge());  
        pres.setDate(3, new Date(g.getBirthday().getTime()));  
        // 执行，增，删，改 ，用下面的语句，查用executeQuery();  
        pres.execute();  
  
    }  
  
    public void updateGoddess(Godes goddess) throws Exception {  
        Connection connection = DBUtil.getConnect();  
  
        String sql = "UPDATE tabletest SET name=?,age=?,birthday=? WHERE id=?";  
        PreparedStatement prem = connection.prepareStatement(sql);  
        prem.setString(1, goddess.getName());  
        prem.setInt(2, goddess.getAge());  
        prem.setDate(3, new Date(goddess.getBirthday().getTime()));  
        prem.setInt(4, 1);  
  
        prem.execute();  
    }  
  
    public void delGoddess(Integer id) throws SQLException {  
        Connection connection = DBUtil.getConnect();  
  
        String sql = "DELETE FROM tabletest WHERE id=?";  
        PreparedStatement prem = connection.prepareStatement(sql);  
        prem.setInt(1, id);  
  
        prem.execute();  
    }  
  
    public List<Godes> query() throws Exception {  
        Connection connection = DBUtil.getConnect();  
        // 3.通过数据库的连接操作数据库，实现增删改查  
        Statement statement = connection.createStatement();  
        // 查询数据,其中输入sql语句  
        ResultSet rSet = statement.executeQuery("SELECT name,age FROM tabletest");  
  
        List<Godes> goddessList = new ArrayList<Godes>();  
        Godes goddess;  
        // rSet.next()返回的是一个布尔类型的值，而且将指针指向下一条记录  
        while (rSet.next()) {  
            /* 
             * 将获得的数据输入到控制台上，注意得到的方法，因为之前查询时获得的是两个值，一个string，一个int， 
             * 使用其中的参数为string的方法，将值得名称传进去 
             */  
            // System.out.println(rSet.getString("name")+","+rSet.getInt("age"));  
            goddess = new Godes();  
            goddess.setName(rSet.getString("name"));  
            goddess.setAge(rSet.getInt("age"));  
            goddessList.add(goddess);  
        }  
        return goddessList;  
    }  
  
    public List<Godes> queryForContdition(List<Map<String, Object>> perm) throws Exception {  
  
        Connection connection = DBUtil.getConnect();  
        // 使用stringBuilder不同于字符串（每次修改都会创建开销），对于多次修改的，用StringBuilder好  
        StringBuilder sql = new StringBuilder();  
        sql.append("SELECT * FROM tabletest WHERE 1=1 ");  
        // sql.append(" AND "+"name"+"="+"'Tony'");  
        for (Map<String, Object> map : perm) {  
            sql.append(" AND " + map.get("attr") + " " + map.get("relation") + " " + map.get("value"));  
        }  
        // 注意与上面查询的写法  
        // 由于没有？，可以省略第三步  
        PreparedStatement statement = connection.prepareStatement(sql.toString());  
  
        // 这个为查询，因此不同于其它三种  
        ResultSet rSet = statement.executeQuery();  
  
        Godes goddess;  
        List<Godes> goddessList = new ArrayList<Godes>();  
        while (rSet.next()) {  
            goddess = new Godes();  
            goddess.setId(rSet.getInt("id"));  
            goddess.setName(rSet.getString("name"));  
            goddess.setAge(rSet.getInt("age"));  
            goddess.setBirthday(rSet.getDate("birthday"));  
            goddessList.add(goddess);  
        }  
  
        return goddessList;  
    }  
}  