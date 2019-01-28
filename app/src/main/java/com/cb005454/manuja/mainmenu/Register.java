package com.cb005454.manuja.mainmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText name, pwd1, psd2, secrtword;
    String nm, passwd1, psswd2, secretwd;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        db = new DatabaseHelper(this);
    }

    public void Addvalues(View view) {
        name = findViewById(R.id.editText2);
        pwd1 = findViewById(R.id.editText4);
        psd2 = findViewById(R.id.editText5);
        secrtword = findViewById(R.id.editText6);

        nm = name.getText().toString().trim();
        passwd1 = pwd1.getText().toString().trim();
        psswd2 = psd2.getText().toString().trim();
        secretwd = secrtword.getText().toString().trim();

        if (nm.equals("")||passwd1.equals("")||psswd2.equals("")||secretwd.equals("")){
            Toast.makeText(this, "Please fill all the information", Toast.LENGTH_SHORT).show();

        }
        else {
            if (passwd1.equals(psswd2)) {
                boolean compareUsername = db.checkUsername(nm);
                if (compareUsername) {
                    boolean insert = db.insert(nm, psswd2,secretwd);
                    if (insert) {
                        Toast.makeText(this, "Registered successfully, Please Login and enjoy shopping with us", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(this,MainActivity.class));
                    } else {
                        Toast.makeText(this, "Could Not Save the data, please try again", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(this, "Username already exist, please use a different name!", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            }

        }

    }
}
