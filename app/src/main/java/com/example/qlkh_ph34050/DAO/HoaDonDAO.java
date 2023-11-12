package com.example.qlkh_ph34050.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.qlkh_ph34050.Database.Database;
import com.example.qlkh_ph34050.Model.HoaDon;
import com.example.qlkh_ph34050.Model.Theloai;

import java.util.ArrayList;

public class HoaDonDAO {
    SQLiteDatabase db;
    Database database;

    public HoaDonDAO(Context context){
        database = new Database(context);
        db = database.getWritableDatabase();
    }

    public long AddHoaDon(HoaDon theloai){
        ContentValues values = new ContentValues();
        values.put("sohoadon", theloai.getSohoadon());
        values.put("id_user", theloai.getId_user());
        values.put("loaihoadon", theloai.getLoaihoadon());
        values.put("date", theloai.getDate());
        return db.insert("tb_hoadon", null, values);
    }

    public int UpdateHoaDon(HoaDon theloai){
        ContentValues values = new ContentValues();
        values.put("sohoadon", theloai.getSohoadon());
        values.put("loaihoadon", theloai.getLoaihoadon());
        values.put("date", theloai.getDate());
        String[] udhoadon = new String[]{String.valueOf(theloai.getId())};
        return db.update("tb_hoadon", values, "id=?", udhoadon);
    }

    public int DeleteHoaDon(HoaDon theloai){
        String[] deletehd = new String[]{String.valueOf(theloai.getId())};
        return db.delete("tb_hoadon", "id=?", deletehd);
    }

    public ArrayList<HoaDon> GetAllHoaDon(){
        ArrayList<HoaDon> listhd = new ArrayList<>();
        Cursor cursor = db.rawQuery("Select* From HoaDon", null);
        return listhd;
    }
}
