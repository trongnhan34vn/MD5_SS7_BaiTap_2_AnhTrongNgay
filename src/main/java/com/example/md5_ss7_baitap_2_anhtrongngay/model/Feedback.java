package com.example.md5_ss7_baitap_2_anhtrongngay.model;

import javax.persistence.*;

@Entity
@Table
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String content;
    private int point;
    private int likeAmount;
    @Column(columnDefinition = "DATE default current_date")
    private String date;

    public Feedback() {
    }

    public Feedback(Long id, String content, int point, int likeAmount, String date) {
        this.id = id;
        this.content = content;
        this.point = point;
        this.likeAmount = likeAmount;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getLikeAmount() {
        return likeAmount;
    }

    public void setLikeAmount(int likeAmount) {
        this.likeAmount = likeAmount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
