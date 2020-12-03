package com.example.tracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity {

    EditText emailText, passwordText;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        emailText = (EditText) findViewById(R.id.Email);
        passwordText = (EditText) findViewById(R.id.Password);
        login = (Button) findViewById(R.id.LoginBtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (emailText.getText().toString().equals("admin") && passwordText.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent fb = new Intent(AdminLogin.this, Admin.class);
                    startActivity(fb);
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong Information", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}