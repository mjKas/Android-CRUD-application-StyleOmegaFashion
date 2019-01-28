package com.cb005454.manuja.mainmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class viewDetailTrouser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_detail_trouser);
    }

    public void lgin(View view) {
        startActivity(new Intent(this,logIn.class));
    }
}
