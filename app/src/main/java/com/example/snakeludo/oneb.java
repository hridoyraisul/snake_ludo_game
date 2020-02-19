package com.example.snakeludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class oneb extends AppCompatActivity {

    MediaPlayer oneDice;
    Button bbtn;
    android.os.Vibrator Vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneb);
        Vibrator = (Vibrator)getSystemService(oneb.VIBRATOR_SERVICE);
        bbtn = findViewById(R.id.bbutton);
        oneDice= MediaPlayer.create(oneb.this,R.raw.one_c);;
        bbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                oneDice.start();
                startActivity(new Intent(oneb.this, onec.class));
            }
        });
    }
}
