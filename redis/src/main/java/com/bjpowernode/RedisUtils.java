package com.bjpowernode;


import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtils {
    /*//定义连接池对象
    private static JedisPool pool=null;
    //创建连接池
    public static JedisPool open(String host,int port){
        if(pool==null){
            //创建连接池配置对象
            JedisPoolConfig config=new JedisPoolConfig();
            //最大Jedis实例数（默认为8）
            config.setMaxTotal(10);
            //最大空闲连接数，设置这个可以保留足够的连接，快速获取连接
            config.setMaxIdle(3);
            //提前检查Jedis连接池，Redis没有访问密码时的使用方式
            config.setTestOnBorrow(true);
            pool=new JedisPool(config,host,port);
            //Redis有访问密码时的使用方式
            //参数说明：Jedis配置对象，ip,端口号，连接超时时间，访问密码
           // pool=new JedisPool(config,host,port,6*1000,"123456");
        }
        return pool;
    }

    //关闭连接池
    public static void close(){
        if(pool!=null){
            pool.close();
        }
    }*/
    static int a =1;
    private static JedisPool jedisPool = null;

    //创建连接池
    public static JedisPool open(String host,int port){
        //判断连接池是否已被创建
        if (jedisPool ==null){
            JedisPoolConfig config = new JedisPoolConfig();
            //设置最大连接数
            config.setMaxTotal(10);
            //设置最大空闲连接数
            config.setMaxIdle(5);
            jedisPool = new JedisPool(config,host,port);
        }

        return jedisPool;
    }
    public static void close(){
        if (jedisPool!=null){
            jedisPool.close();
        }
    }
}
