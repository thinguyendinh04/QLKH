package com.example.qlkh_ph34050.Model;

public class SanPham {
    int id, matheloai;
    String tensp;
    int gia,soluong;
    String mota;

    public SanPham(int matheloai, String tensp, int gia, int soluong, String mota) {
        this.matheloai = matheloai;
        this.tensp = tensp;
        this.gia = gia;
        this.soluong = soluong;
        this.mota = mota;
    }

    public SanPham(int id, int matheloai, String tensp, int gia, int soluong, String mota) {
        this.id = id;
        this.matheloai = matheloai;
        this.tensp = tensp;
        this.gia = gia;
        this.soluong = soluong;
        this.mota = mota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatheloai() {
        return matheloai;
    }

    public void setMatheloai(int matheloai) {
        this.matheloai = matheloai;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
