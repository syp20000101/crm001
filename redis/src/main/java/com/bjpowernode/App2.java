package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App2
{
    public static void main( String[] args )
    {
        JedisPool pool=null;
       try{
           pool=RedisUtils.open("192.168.73.128",6379);
           Jedis jedis=pool.getResource();
           jedis.flushAll();
           jedis.hset("website", "taobao", "www.taobao.com");
           String website = jedis.hget("website", "taobao");
           System.out.println(website);

           Map<String,String>map = new HashMap<>();
           map.put("id", "001");
           map.put("name", "syp");
           map.put("age", "21");
           jedis.hmset("student", map);
           List<String>list =  jedis.hmget("student", "id","name","age");
           for (String str:list){
               System.out.println(str);
           }

       }catch (Exception e){
           e.printStackTrace();;
       }finally{
           RedisUtils.close();
       }
    }
}
