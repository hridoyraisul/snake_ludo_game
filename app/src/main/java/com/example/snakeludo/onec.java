package com.example.snakeludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class onec extends AppCompatActivity {

    MediaPlayer oneDice;
    Button cbtn;
    android.os.Vibrator Vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onec);
        Vibrator = (android.os.Vibrator) getSystemService(onec.VIBRATOR_SERVICE);
        cbtn = findViewById(R.id.cbutton);
        oneDice = MediaPlayer.create(onec.this, R.raw.two);
        ;
        cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                oneDice.start();
                startActivity(new Intent(onec.this, two.class));
            }
        });
    }
}