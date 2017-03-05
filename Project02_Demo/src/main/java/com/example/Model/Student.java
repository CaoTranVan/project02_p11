//package com.example.Model;
//
//import jdk.internal.org.objectweb.asm.tree.analysis.Value;
//
//import javax.persistence.*;
//
///**
// * Created by Tran_Cao on 2/26/2017.
// */
//
//@Entity
//public class Student {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "Id")
//    private int Id;
//
//    @Column(name = "user_name")
//    private String user_name;
//
//    @Column(name = "name")
//    private String name;
//
//    @Column(name = "age")
//    private int age;
//
//    @Column(name = "class_name")
//    private String class_name;
//
//    public Student() {
//    }
//
//    public Student(String user_name, String name, int age, String class_name) {
//        this.user_name = user_name;
//        this.name = name;
//        this.age = age;
//        this.class_name = class_name;
//    }
//
//    public int getId() {
//        return Id;
//    }
//
//    public void setId(int id) {
//        Id = id;
//    }
//
//    public String getUser_name() {
//        return user_name;
//    }
//
//    public void setUser_name(String user_name) {
//        this.user_name = user_name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getClass_name() {
//        return class_name;
//    }
//
//    public void setClass_name(String class_name) {
//        this.class_name = class_name;
//        this.toString();
//    }
//}
