package com.cb005454.manuja.mainmenu;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ViewCart extends AppCompatActivity {
    List<Items> itemsList;
    SQLiteDatabase mDatabase;
    ListView listViewitems;
    ItemsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_cart);
        listViewitems = (ListView) findViewById(R.id.listviewItems);
        itemsList = new ArrayList<>();

        //opening the database
        mDatabase = openOrCreateDatabase(MainActivity.DATABASE_NAME, MODE_PRIVATE, null);

        //this method will display the employees in the list
        showItemsFromDatabase();
    }

    private void showItemsFromDatabase() {
        try {
            //we used rawQuery(sql, selectionargs) for fetching all the employees
            Cursor cursoritemess = mDatabase.rawQuery("SELECT * FROM cart", null);

            //if the cursor has some data
            if (cursoritemess.moveToFirst()) {
                //looping through all the records
                do {
                    //pushing each record in the employee list
                    itemsList.add(new Items(
                            cursoritemess.getString(0),
                            cursoritemess.getString(1)
                    ));
                } while (cursoritemess.moveToNext());
            }
            //closing the cursor
            cursoritemess.close();

            //creating the adapter object
            adapter = new ItemsAdapter(this, R.layout.list_layout_items, itemsList, mDatabase);

            //adding the adapter to listview
            listViewitems.setAdapter(adapter);
        }catch (Exception e){
            Toast.makeText(this, "Network Error.Unable to get data from location", Toast.LENGTH_SHORT).show();
        }
    }
}
