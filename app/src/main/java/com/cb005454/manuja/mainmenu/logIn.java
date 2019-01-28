package com.cb005454.manuja.mainmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class logIn extends AppCompatActivity {

    EditText name, psd;
    String nm, passwd;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        db = new DatabaseHelper(this);
    }

    public void nextPg(View view) {
        startActivity(new Intent(this, Register.class));
    }

    public void lgin(View view) {
        name = findViewById(R.id.editText);
        psd = findViewById(R.id.editText3);
        nm = name.getText().toString().trim();
        passwd = psd.getText().toString().trim();

        if (isEmpty(nm,passwd)){
            if (db.letlogin(nm,passwd)){
                Toast.makeText(this, "Logged in successfully", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,MainActivity.class);
                intent.putExtra("username",nm);
                startActivity(intent);
            }
            else {
                Toast.makeText(this, "Username or password incorrect", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean isEmpty(String nm, String passwd) {
        return  !nm.isEmpty()&& !passwd.isEmpty();
    }

    public void gotoModify(View view) {
        startActivity(new Intent(this,modifyPassword.class));
    }
}


