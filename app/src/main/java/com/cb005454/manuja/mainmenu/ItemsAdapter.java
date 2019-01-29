package com.cb005454.manuja.mainmenu;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Items> {
    Context context;
    int listLayoutRes;
    List<Items> itemsList;
    SQLiteDatabase mDatabase;
    public ItemsAdapter(Context context,int listLayoutRes,List<Items> itemsList,SQLiteDatabase mDatabase){
        super(context,listLayoutRes,itemsList);
        this.context = context;
        this.listLayoutRes = listLayoutRes;
        this.itemsList = itemsList;
        this.mDatabase = mDatabase;

    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(listLayoutRes, null);

        //getting item of the specified position
        Items itemsgeting = itemsList.get(position);


        //getting views
        TextView textViewName = view.findViewById(R.id.textView2);
        TextView textViewDept = view.findViewById(R.id.textView3);


        //adding data to views
        textViewName.setText(itemsgeting.getItemName());
        textViewDept.setText(itemsgeting.getItemPrice());


        //we will use these buttons later for update and delete operation
/*        Button buttonDelete = view.findViewById(R.id.buttonDeleteEmployee);
        Button buttonEdit = view.findViewById(R.id.buttonEditEmployee);*/

        return view;
    }

}
