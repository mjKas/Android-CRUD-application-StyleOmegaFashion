package com.cb005454.manuja.mainmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class modifyPassword extends AppCompatActivity {
    EditText name, swrd;
    String namee, secretwd;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_password);
        db = new DatabaseHelper(this);
    }

    public void modyfy(View view) {
        name = findViewById(R.id.editText7);
        swrd = findViewById(R.id.editText8);
        namee = name.getText().toString().trim();
        secretwd = swrd.getText().toString().trim();

        if (isEmpty(namee,secretwd)){
            if (db.checksecurity(namee,secretwd)){

                Intent intent = new Intent(this,changePassword.class);
                intent.putExtra("Username",namee);
                startActivity(intent);
            }
            else Toast.makeText(this, "Username or secret word is incorrect", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
        }

    }
    public boolean isEmpty(String nm, String passwd) {
        return  !nm.isEmpty()&& !passwd.isEmpty();

    }
}
