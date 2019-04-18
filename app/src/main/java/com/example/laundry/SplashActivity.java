package com.example.laundry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.laundry.R;
import com.example.laundry.loginActivity;

public class SplashActivity extends AppCompatActivity {
    ImageView Slogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Slogo = (ImageView) findViewById(R.id.Slogo);
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.transition);
        Slogo.startAnimation(anim);
        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashActivity.this, loginActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}