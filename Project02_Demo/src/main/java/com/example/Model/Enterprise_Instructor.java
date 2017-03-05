//package com.example.Model;
//
//import jdk.nashorn.internal.objects.annotations.Getter;
//import jdk.nashorn.internal.objects.annotations.Setter;
//
//import javax.persistence.*;
//
///**
// * Created by Tran_Cao on 3/4/2017.
// */
//@Entity
//@Table(name = "enterprise_instructor")
//public class Enterprise_Instructor {
//
//    private int enterprise_instructor_id;
//    private String name;
//    private String user_name;
//    private String email;
//    private String password;
//    private int phone_number;
//    private String position;
//    private int score_id;
//    private Scores scores;
//
//
//    public Enterprise_Instructor() {
//    }
//
//
//    public Enterprise_Instructor(int enterprise_instructor_id, String name, String user_name, String email, String password, int phone_number, String position, int score_id) {
//        this.enterprise_instructor_id = enterprise_instructor_id;
//        this.name = name;
//        this.user_name = user_name;
//        this.email = email;
//        this.password = password;
//        this.phone_number = phone_number;
//        this.position = position;
//        this.score_id = score_id;
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "enterprise_instructor_id")
//    public int getEnterprise_instructor_id() {
//        return enterprise_instructor_id;
//    }
//
//    public void setEnterprise_instructor_id(int enterprise_instructor_id) {
//        this.enterprise_instructor_id = enterprise_instructor_id;
//    }
//
//    @Column(name = "name")
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Column(name = "user_name")
//    public String getUser_name() {
//        return user_name;
//    }
//
//    public void setUser_name(String user_name) {
//        this.user_name = user_name;
//    }
//
//    @Column(name = "email")
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @Column(name = "password")
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Column(name = "phone_number")
//    public int getPhone_number() {
//        return phone_number;
//    }
//
//    public void setPhone_number(int phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    @Column(name = "position")
//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//
//    public int getScore_id() {
//        return score_id;
//    }
//
//    public void setScore_id(int score_id) {
//        this.score_id = score_id;
//    }
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "score_id")
//    public Scores getScores() {
//        return scores;
//    }
//
//    public void setScores(Scores scores) {
//        this.scores = scores;
//    }
//    //    public String toString(){
////        return "enterprise_instructor { id: "+getEnterprise_instructor_id()+
////                ",name: "+getName()+",user_name: "+getUser_name()+",email:"+getEmail()+
////                ",password:"+getPassword()+",phone_number:"+getPhone_number()+
////                ",position:"+getPosition()+"}";
////    }
//}
