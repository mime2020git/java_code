package com.study.javabase;

public class StudentTest {
    public static void main(String[] args){
        Student st = new Student();
        st.setAge(12);
        System.out.println(st.getAge());
        st.setAge(80);
        System.out.println(st.getAge());
        st.setName("真三");
        System.out.println(st.getName());
        st.show();
        System.out.println(st.getScore());
    }
}
