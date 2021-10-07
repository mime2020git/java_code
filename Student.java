package com.study.javabase;

public class Student {
    private String name;
    private int age = 15;
    final  int score = 60;

    public void setName(String name){
        this.name = name;
    }
    public String  getName(){
        return name;
    }
    public void setAge(int age){
        if(age<15){
            System.out.println("信息无效，请重新设定");
        }else{
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }
    public int getScore(){
        return score;
    }
    public void show(){
        System.out.printf("姓名：%s，年龄：%d，分数：%d\n",this.name,this.age,this.score);
    }

}
