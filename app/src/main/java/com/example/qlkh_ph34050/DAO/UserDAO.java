package com.example.qlkh_ph34050.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.qlkh_ph34050.Database.Database;
import com.example.qlkh_ph34050.Model.User;

import java.util.ArrayList;

public class UserDAO{
    SQLiteDatabase db;
    Database database;
    public UserDAO(Context context){
        database = new Database(context);
        db = database.getWritableDatabase();
    }

    public long Add(User user){
        ContentValues values= new ContentValues();
        values.put("username", user.getUsername());
        values.put("password", user.getPassword());
        values.put("fullname", user.getFullname());
        values.put("email", user.getEmail());

        return db.insert("tb_user",null,values);
    }
    public int Update(User user){
        ContentValues values= new ContentValues();
        values.put("email", user.getEmail());
        String[] newpass = new String[]{String.valueOf(user.getId())};
        return db.update("tb_user",values,"id=?",newpass);
    }
}
