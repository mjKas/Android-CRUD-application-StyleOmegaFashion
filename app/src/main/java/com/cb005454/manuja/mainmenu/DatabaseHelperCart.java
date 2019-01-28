package com.cb005454.manuja.mainmenu;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelperCart extends SQLiteOpenHelper {
    public DatabaseHelperCart(Context context) {
        super(context, "cart", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table cart(itemName text, price text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("drop table if exists cart");
    }

    boolean insert(String itemname, String price){
        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("itemname",itemname );
        contentValues.put("price",price);
        long insert = db.insert("cart",null,contentValues);
        return  insert != -1;
    }

/*    public void Show(){
        List cartDetails = new ArrayList();
        String selectQuery = "SELECT * FROM " +
                + " ORDER BY " + itemname + " DESC";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        //if TABLE has rows
        if (cursor.moveToFirst()) {
            //Loop through the table rows
            do {
                MovieDetailsVO movieDetails = new MovieDetailsVO();
                movieDetails.setMovieId(cursor.getInt(0));
                movieDetails.setMovieName(cursor.getString(1));
                movieDetails.setGenre(cursor.getString(2));
                movieDetails.setYear(cursor.getInt(3));
                movieDetails.setRating(cursor.getDouble(4));

                //Add movie details to list
                movieDetailsList.add(movieDetails);
            } while (cursor.moveToNext());
        }
        db.close();
        return movieDetailsList;
    }*/
}



