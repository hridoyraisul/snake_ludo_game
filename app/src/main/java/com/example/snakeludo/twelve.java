package com.example.snakeludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class twelve extends AppCompatActivity {

    MediaPlayer oneDice;
    Button fbtn;
    android.os.Vibrator Vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve);
        Vibrator = (android.os.Vibrator)getSystemService(twelve.VIBRATOR_SERVICE);
        fbtn = findViewById(R.id.twelvebutton);
        oneDice= MediaPlayer.create(twelve.this,R.raw.thirteen);;
        fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                oneDice.start();
                startActivity(new Intent(twelve.this, thirteen.class));
            }
        });
    }
}
