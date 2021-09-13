package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class App1
{
    public static void main( String[] args )
    {
     JedisPool pool = null;

        try {
            pool = RedisUtils.open("192.168.73.128", 6379);
            Jedis jedis = pool.getResource();
            jedis.set("age", "21");
            String age = jedis.get("age");
            System.out.println(age);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
          RedisUtils.close();
        }


    }
}
