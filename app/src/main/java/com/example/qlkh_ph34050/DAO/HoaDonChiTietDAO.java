package com.example.qlkh_ph34050.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.qlkh_ph34050.Database.Database;

public class HoaDonChiTietDAO {
    SQLiteDatabase db;
    Database database;

    public HoaDonChiTietDAO(Context context){
        database = new Database(context);
        db = database.getWritableDatabase();
    }

}
