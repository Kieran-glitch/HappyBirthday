package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class happyBirthday extends AppCompatActivity {
    LottieAnimationView l;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy_birthday);
        l=findViewById(R.id.hb);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(happyBirthday.this,"Happy Birthday",Toast.LENGTH_LONG).show();
            }
        });
    }
}