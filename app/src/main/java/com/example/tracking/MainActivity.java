package com.example.tracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView studentbtn, adminbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        studentbtn=(TextView) findViewById(R.id.studentBtn);
        studentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb = new Intent(MainActivity.this, Register.class);
                startActivity(fb);
            }
        });

        adminbtn=(TextView) findViewById(R.id.adminBtn);
        adminbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb = new Intent(MainActivity.this, AdminLogin.class);
                startActivity(fb);
            }
        });
    }
}