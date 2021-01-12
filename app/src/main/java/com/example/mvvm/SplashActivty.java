package com.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.mvvm.views.MainActivity;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        EasySplashScreen config =  new EasySplashScreen(SplashActivty.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(3000)
                .withBackgroundColor(Color.parseColor("#fcf8f7"))
                .withAfterLogoText("Welcome To Vivo Family")
                .withLogo(R.drawable.vivologo);
        View easySplash = config.create();
        setContentView(easySplash);
    }
}