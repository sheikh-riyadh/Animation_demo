package com.example.animation_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Animation fadeout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn1ID);
        /*
        if we get the animation then we write a method
        AnimationUtil.loadAnimation(getApplicationContext(),R.anim.our animation xml file name)
        */
        fadeout = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequential);

        btn.startAnimation(fadeout);
    }
}
