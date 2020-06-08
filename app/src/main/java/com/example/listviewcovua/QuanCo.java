package com.example.listviewcovua;

import android.media.Image;

public class QuanCo {
    private String ten;
    private String cachChoi;

    public QuanCo() {
    }

    public QuanCo(String ten, String cachChoi) {
        this.ten = ten;
        this.cachChoi = cachChoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCachChoi() {
        return cachChoi;
    }

    public void setCachChoi(String cachChoi) {
        this.cachChoi = cachChoi;
    }
}

