package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {
    AppCompatButton im;
    TextView setlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        im=(AppCompatButton)findViewById(R.id.signupbtn);
        Animation scale = AnimationUtils.loadAnimation(this, R.anim.scaleanimation);
        im.setAnimation(scale);

        setlogin=(TextView)findViewById(R.id.naviagtelogin);
        setlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent lg = new Intent(SignupActivity.this,LoginActivity.class);
                startActivity(lg);
            }
        });
    }

}