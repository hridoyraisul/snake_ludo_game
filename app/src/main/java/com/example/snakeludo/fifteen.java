package com.example.snakeludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fifteen extends AppCompatActivity {

    MediaPlayer oneDice;
    Button fbtn;
    android.os.Vibrator Vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteen);
        Vibrator = (android.os.Vibrator)getSystemService(fifteen.VIBRATOR_SERVICE);
        fbtn = findViewById(R.id.fifteenbutton);
        oneDice= MediaPlayer.create(fifteen.this,R.raw.sixteen);;
        fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                oneDice.start();
                startActivity(new Intent(fifteen.this, sixteen.class));
            }
        });
    }
}