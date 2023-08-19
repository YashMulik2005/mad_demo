package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView setsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setsignup= (TextView)findViewById(R.id.naviagtesignup);
        setsignup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent sn = new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(sn);
            }
        });
    }
}