package com.example.qlkh_ph34050.Model;

public class HoaDon {
    int id, sohoadon, id_user;
    String loaihoadon, date;

    public HoaDon(int id, int sohoadon, int id_user, String loaihoadon, String date) {
        this.id = id;
        this.sohoadon = sohoadon;
        this.id_user = id_user;
        this.loaihoadon = loaihoadon;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSohoadon() {
        return sohoadon;
    }

    public void setSohoadon(int sohoadon) {
        this.sohoadon = sohoadon;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getLoaihoadon() {
        return loaihoadon;
    }

    public void setLoaihoadon(String loaihoadon) {
        this.loaihoadon = loaihoadon;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
