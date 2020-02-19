package com.example.snakeludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class seven extends AppCompatActivity {

    MediaPlayer oneDice;
    Button sebtn;
    android.os.Vibrator Vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
        Vibrator = (android.os.Vibrator)getSystemService(seven.VIBRATOR_SERVICE);
        sebtn = findViewById(R.id.sevenbutton);
        oneDice= MediaPlayer.create(seven.this,R.raw.eight);;
        sebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                oneDice.start();
                startActivity(new Intent(seven.this, eight.class));
            }
        });
    }
}
