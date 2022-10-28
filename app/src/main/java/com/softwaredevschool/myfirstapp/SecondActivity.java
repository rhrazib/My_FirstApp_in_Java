package com.softwaredevschool.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity{
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        et1 = findViewById(R.id.etEmailLogin);
        et1.setOnClickListener(v -> {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        });
    }
}