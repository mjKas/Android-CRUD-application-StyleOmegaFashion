package com.cb005454.manuja.mainmenu;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class viewDetailsKidsblk extends AppCompatActivity {
        DatabaseHelperCart db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_details_kidsblk);
        db = new DatabaseHelperCart(this);
    }

    public void golgin(View view) {
        db.insert("Kids black shirt n Trouser","1000");
        Toast.makeText(this, "Successfully added", Toast.LENGTH_SHORT).show();
    }
}
