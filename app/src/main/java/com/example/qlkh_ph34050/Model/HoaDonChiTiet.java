package com.example.qlkh_ph34050.Model;

public class HoaDonChiTiet {
    int id_hoadon, id_sanpham, soluong, dongia;

    public HoaDonChiTiet(int id_hoadon, int id_sanpham, int soluong, int dongia) {
        this.id_hoadon = id_hoadon;
        this.id_sanpham = id_sanpham;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public int getId_hoadon() {
        return id_hoadon;
    }

    public void setId_hoadon(int id_hoadon) {
        this.id_hoadon = id_hoadon;
    }

    public int getId_sanpham() {
        return id_sanpham;
    }

    public void setId_sanpham(int id_sanpham) {
        this.id_sanpham = id_sanpham;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
}
