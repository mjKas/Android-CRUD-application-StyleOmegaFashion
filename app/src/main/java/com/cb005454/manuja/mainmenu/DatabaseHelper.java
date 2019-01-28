package com.cb005454.manuja.mainmenu;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper  extends SQLiteOpenHelper {
    public DatabaseHelper(Context context) {
        super(context, "FashionStore", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table user(username text primary key,password text,secretwrd text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists user");
    }

    public boolean letlogin(String nm, String passwd) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from user where username=? and password=?", new String []{nm,passwd});
        //cursor.close();
        return (cursor.getCount() > 0);
    }

    boolean insert(String usrnm, String pwd1, String secretwd) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username",usrnm);
        contentValues.put("password",pwd1);
        contentValues.put("secretwrd",secretwd);

        long insert = db.insert("user",null,contentValues);
        return insert != -1;
    }

    public boolean checkUsername(String nm) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select * from user where username=?",new String[]{nm});
        //cursor.close();
        return cursor.getCount() <= 0;
    }

    public boolean checksecurity(String namee, String wd) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from user where username=? and secretwrd=?", new String []{namee,wd});
        return cursor.getCount() > 0;
    }

    public boolean modyfyPassword(String username, String passwd1) {
        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("password",passwd1);
        db.update("user",contentValues,"username=?",new String[]{username});
        return true;

    }
    //boolean modyfy(String username, String pwd){

    // }
}

