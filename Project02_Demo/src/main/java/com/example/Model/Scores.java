//package com.example.Model;
//
//import com.sun.javafx.beans.IDProperty;
//
//import javax.persistence.*;
//
///**
// * Created by Tran_Cao on 3/5/2017.
// */
//@Entity
//@Table(name = "scores")
//public class Scores {
//    private int score_id;
//    private String url_score;
//    private Enterprise_Instructor enterprise_instructor;
//
//    public Scores(String url_score) {
//        this.url_score = url_score;
//    }
//
//    public Scores() {
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    public int getScore_id() {
//        return score_id;
//    }
//
//    public void setScore_id(int score_id) {
//        this.score_id = score_id;
//    }
//    @Column(name = "url_score")
//    public String getUrl_score() {
//        return url_score;
//    }
//
//    public void setUrl_score(String url_score) {
//        this.url_score = url_score;
//    }
//
//    @OneToOne(mappedBy = "scores")
//    public Enterprise_Instructor getEnterprise_instructor() {
//        return enterprise_instructor;
//    }
//
//    public void setEnterprise_instructor(Enterprise_Instructor enterprise_instructor) {
//        this.enterprise_instructor = enterprise_instructor;
//    }
//}
