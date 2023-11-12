package com.example.qlkh_ph34050.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.qlkh_ph34050.Database.Database;
import com.example.qlkh_ph34050.Model.Theloai;

public class TheloaiDAO {
    SQLiteDatabase db;
    Database database;

    public TheloaiDAO(Context context){
        database = new Database(context);
        db = database.getWritableDatabase();
    }

    public long AddTheloai(Theloai theloai){
        ContentValues values = new ContentValues();
        values.put("name", theloai.getName());
        return db.insert("tb_theloai", null, values);
    }

    public int UpdateTheloai(Theloai theloai){
        ContentValues values = new ContentValues();
        values.put("name", theloai.getName());
        String[] udtheloai = new String[]{String.valueOf(theloai.getId())};
        return db.update("tb_theloai", values, "id=?", udtheloai);
    }

    public int DeleteTheloai(Theloai theloai){
        String[] udtheloai = new String[]{String.valueOf(theloai.getId())};
        return db.delete("tb_theloai", "id=?", udtheloai);
    }
}
