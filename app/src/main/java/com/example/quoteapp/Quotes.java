package com.example.quoteapp;

public class Quotes {
    private int id;
    private String qoute;
    private String source;
    private String religion;

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getQoute() {
        return qoute;
    }

    public void setQoute(String qoute) {
        this.qoute = qoute;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Quotes(int id, String qoute, String source, String religion) {
        this.id = id;
        this.qoute = qoute;
        this.source = source;
        this.religion = religion;
    }
}
