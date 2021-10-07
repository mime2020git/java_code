package com.study.javabase;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args){
//        String a = "1245asdfasf545";
//        String b = "asf45wfeAQD";
//        // replace 替换所有符合条件的
//        String replace = a.replace("45","@!@");
//        System.out.println(replace);
//        // replaceAll 支持正则表达式，替换所有符合条件的
//        String replaceAll = b.replaceAll("\\d","1");
//        System.out.println(replaceAll);
//        String c = "ASWdsaf21";
//        String d = "sdfasd";
//        String e = "ASWdsaf21";
//        String f = " a s df ";
//        System.out.println(c.toLowerCase());
//        System.out.println(c.toUpperCase());
//        System.out.println(c.length());
//        System.out.println(c.equals(e));
//        // indexOf 查找一个指定的字符串是否存在，返回的是字符串的位置，如果不存在，则返回-1
//        System.out.println(d.indexOf("d"));
//        // compareTo 比较大小 -1 0 1
//        System.out.println(e.compareTo(c));
//        // split 根据正则表达式匹配，返回一个字符串数组
//        System.out.println(e.split(" "));
//        // trim 去掉左右空格
//        System.out.println(f.trim());
//        System.out.println(f.replace(" ",""));
        String g = "sdf45";
        // contain 判断一个字符串里面是否包含指定的内容，返回一个布尔值
        System.out.println(g.contains("sd"));
        // substring 截取字符串
        System.out.println(g.substring(3));
        System.out.println(g.substring(1,4));
        // startsWith endswith 判断开始或结尾，返回一个布尔值
        System.out.println(g.startsWith("d",1));
        System.out.println(g.endsWith("5"));

    }
}
