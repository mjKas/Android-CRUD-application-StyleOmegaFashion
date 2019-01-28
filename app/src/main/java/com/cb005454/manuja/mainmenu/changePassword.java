package com.cb005454.manuja.mainmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class changePassword extends AppCompatActivity {

    EditText psd1,psd2;
    String passwd1, passwd2,name;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        db = new DatabaseHelper(this);
    }

    public void changepwd(View view) {
        psd1 = findViewById(R.id.editText10);
        psd2 = findViewById(R.id.editText11);
        passwd1 = psd1.getText().toString().trim();
        passwd2 = psd2.getText().toString().trim();

        Bundle bundle =  getIntent().getExtras();
        String name = bundle.getString("Username");


        if (isEmpty(passwd1,passwd2)){
            if ((passwd2.equals(passwd1))){
                db.modyfyPassword(name,passwd1);
                Toast.makeText(this, "Password changed", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,MainActivity.class));
            }
            else {
                Toast.makeText(this, "Passowords do not match", Toast.LENGTH_SHORT).show();
            }
        }



    }
    public boolean isEmpty(String nm1, String nm) {
        return  !nm.isEmpty()&& !nm1.isEmpty();

    }
}
