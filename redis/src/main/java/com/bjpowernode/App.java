package com.bjpowernode;

import redis.clients.jedis.Jedis;

public class App 
{
    public static void main( String[] args )
    {

        Jedis jedis = new Jedis("192.168.73.128",6379);
        jedis.flushDB();
        jedis.set("1", "tom");
        String name = jedis.get("1");
        System.out.println(name);
    }
}
