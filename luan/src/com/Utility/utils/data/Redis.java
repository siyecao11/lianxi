package com.Utility.utils.data;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;

public class Redis {
	  private Jedis jedis;
	    
	    public int waitTime = 180;
	     
	    public Redis(String path) {
	        jedis = new Jedis(path, 6379);
	    }
	  
	    /**测试系统需要把读出的值按一定方式转换成字符(否则为乱码)*/
	    public List<Object> readList(String key) {
	        List<Object> ls = new ArrayList<>();
	        int num = jedis.lrange(key, 0, -1).size();
	        byte[] keybytes = key.getBytes();
	        for(int i=0;i<num;i++) {
	            byte[] bytes = jedis.lindex(keybytes, i);
	            ByteArrayInputStream byteStream = new ByteArrayInputStream(bytes);
	            ObjectInputStream objectInputStream;
	            try {
	                objectInputStream = new ObjectInputStream(byteStream);
	                ls.add(objectInputStream.readObject());
	            } catch (Exception e) {
	                e.printStackTrace();
	            }           
	        }  
	        return ls;
	    }
	    
	    public Map<Integer,String> getData2Map(String key) {
	        Map<Integer,String> map = new HashMap<>();
	        int num = jedis.lrange(key, 0, -1).size();
	        byte[] keybytes = key.getBytes();
	        for(int i=0;i<num;i++) {
	            byte[] bytes = jedis.lindex(keybytes, i);
	            ByteArrayInputStream byteStream = new ByteArrayInputStream(bytes);
	            ObjectInputStream objectInputStream;
	            try {
	                objectInputStream = new ObjectInputStream(byteStream);
	                String value = (String) objectInputStream.readObject();
	                map.put(i, value);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }           
	        }  
	        return map;
	    }
	    
	    /**获取第一个值*/
	    public String getFirstValue(String key) {
	        String value = "";
	        byte[] bytes = jedis.lindex(key.getBytes(), 0);
	        ByteArrayInputStream byteStream = new ByteArrayInputStream(bytes);
	        ObjectInputStream objectInputStream;
	        try {
	            objectInputStream = new ObjectInputStream(byteStream);
	            value = (String) objectInputStream.readObject();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	        return value;
	    }
	    
	    
	    /**测试系统需要把读出的值按一定方式转换成字符(否则为乱码)*/
	    public List<Object> readList(String key,boolean isWait) {
	        List<Object> ls = new ArrayList<>();
	        boolean flag = true;
	        int num = 0;
	        
	        //等待订单队列中有数据
	        while(flag && isWait) {
	            num = jedis.lrange(key, 0, -1).size();
	            if(num <=0) {
	               
	                try {
	                    Thread.sleep(1000);
	                    waitTime--;
	                    if(waitTime<=0) {
	                        flag = false;
	                    }
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }else {               
	                try { 
	                    Thread.sleep(2000);
	                } catch (InterruptedException e1) {
	                    // TODO Auto-generated catch block
	                    e1.printStackTrace();
	                }
	                flag = false;
	            }
	        }
	        
	        
	        
	        byte[] keybytes = key.getBytes();
	        System.out.println("队列数量："+num);
	        //原因 jedis读取最后一个订单有时会出错(原因暂时不知)
	        for(int i=0;i<num-1;i++) {
	            byte[] bytes = null;
	            ByteArrayInputStream byteStream = null;
	            ObjectInputStream objectInputStream;
	            try {
	                bytes = jedis.lindex(keybytes, i);
	                byteStream = new ByteArrayInputStream(bytes);
	                objectInputStream = new ObjectInputStream(byteStream);
	                ls.add(objectInputStream.readObject());
	            } catch (Exception e) {
	                e.printStackTrace();
	            }           
	        }  
	        waitTime=120;
	        return ls;
	    }
	    
	    /**删除链表*/
	    public void removeList(String key) {
	        Long count = jedis.llen(key);
	        Date d1 = new Date();
	        
	        for(int i=0;i<count;i++) {
	            jedis.lpop(key);            
	        }
	        Date d2 = new Date();
	        System.out.println("删除数据所用的时间差："+(d2.getTime()-d1.getTime()));
	    }
	    
	    /**向队列中增加值*/
	    public void lpushValue(String key,String value) {
	        jedis.lpush(key, value);
	    }
	    
	    
	   
	    
}
