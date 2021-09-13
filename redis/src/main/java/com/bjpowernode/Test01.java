package com.bjpowernode;

import sun.java2d.pipe.SpanIterator;

public class Test01 {


    public static void main(String[] args) {
       String a = "abc";
       String b = "abcd";
       a = a+"d";
        System.out.println(a);
        System.out.println(a==b);
        System.out.println("===========");
        String c = new String("abcd");
        String d = new String("abcd");
        System.out.println(c==d);
        System.out.println(c.equals(d));


    }

}
