package com.example.snakeludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class three extends AppCompatActivity {

    MediaPlayer oneDice;
    Button thbtn;
    android.os.Vibrator Vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Vibrator = (android.os.Vibrator)getSystemService(three.VIBRATOR_SERVICE);
        thbtn = findViewById(R.id.threebutton);
        oneDice= MediaPlayer.create(three.this,R.raw.four);;
        thbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                oneDice.start();
                startActivity(new Intent(three.this, four.class));
            }
        });
    }
}
