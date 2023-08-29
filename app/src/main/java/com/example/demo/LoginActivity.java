package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    AppCompatButton im;
    TextView setsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        im=(AppCompatButton)findViewById(R.id.loginbtn);
       Animation scale = AnimationUtils.loadAnimation(this, R.anim.scaleanimation);
       im.setAnimation(scale);

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