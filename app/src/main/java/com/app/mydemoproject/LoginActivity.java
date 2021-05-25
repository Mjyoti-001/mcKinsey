package com.app.mydemoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText username;
        EditText password;
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        if(username.getText().toString() != null && password.getText().toString() !=null){   /*Espresso For UI*/
           // StartProductCategoryActivity()
        }
    }
}