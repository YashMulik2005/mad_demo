package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class SplashActivity extends AppCompatActivity {
RelativeLayout im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        im=findViewById(R.id.circle);
//        Animation scale = AnimationUtils.loadAnimation(this, R.anim.scaleanimation);
//        im.setAnimation(scale);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(SplashActivity.this , BaseActivity.class);
                startActivity(in);
                finish();
            }
        },8000);

    }
}