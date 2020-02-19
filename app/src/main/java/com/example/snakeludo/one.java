package com.example.snakeludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class one extends AppCompatActivity {
    MediaPlayer oneDice;
    Button abtn;
    Vibrator Vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Vibrator = (Vibrator)getSystemService(one.VIBRATOR_SERVICE);
        abtn = findViewById(R.id.abutton);
        oneDice= MediaPlayer.create(one.this,R.raw.one_b);;
        abtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                oneDice.start();
                startActivity(new Intent(one.this, oneb.class));
            }
        });
    }
}
