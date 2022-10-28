package com.softwaredevschool.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mEt;
    private Button mBtn;
    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEt = findViewById(R.id.nameEt);
        mBtn = findViewById(R.id.saveBtn);
        mTv = findViewById(R.id.nameTv);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String name = mEt.getText().toString().trim();
//                mTv.setText(name);
//                Intent i = new Intent(MainActivity.this,NewActivity.class);
//                startActivity(i);
//                startActivity(new Intent(Intent.ACTION_VIEW,
//                        Uri.parse("https://www.softwaredevschool.com/")));

//                Intent i = new Intent();
//                i.setAction(Intent.ACTION_VIEW);
//                i.setData(Uri.parse("https://www.softwaredevschool.com/"));
//                startActivity(i);

//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                    if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                        requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 1000);
//                    }
//                }
//
//                Intent intent = new Intent(Intent.ACTION_CALL);
//                intent.setData(Uri.parse("tel:" + 1234 ));
//                startActivity(intent);
            }
        });
    }


}