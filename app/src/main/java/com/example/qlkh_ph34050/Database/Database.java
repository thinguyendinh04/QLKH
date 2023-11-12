package com.example.qlkh_ph34050.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {
    public Database(Context context) {
        super(context, "QLKH", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String tb_user = "CREATE TABLE tb_user(id Integer Primary key Autoincrement," +
                "username text," +
                "password text," +
                "fullname text," +
                "email text)";
        db.execSQL(tb_user);

        String tb_theloai = "Create table tb_theloai(id Integer Primary key Autoincrement," +
                "name text not null)";
        db.execSQL(tb_theloai);
        String tb_hoadon = "Create table tb_hoadon(id Integer Primary key Autoincrement," +
                "sohoadon Integer," +
                "id_user references tb_user(id)," +
                "loaihoadon text," +
                "date date)";
        db.execSQL(tb_hoadon);
        String tb_sanpham = "Create table tb_sanpham(id Integer Primary key Autoincrement," +
                "matheloai references tb_theloai(id)," +
                "tensanpham text," +
                "gia integer," +
                "soluong integer," +
                "mota text)";
        db.execSQL(tb_sanpham);
        String tb_hdct = "Create table tb_hdct(id_hoadon references tb_hoadon(id)," +
                "id_sanpham references tb_sanpham(id)," +
                "soluong integer," +
                "dongia integer)";
        db.execSQL(tb_hdct);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
