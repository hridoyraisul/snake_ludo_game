package com.example.snakeludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ten extends AppCompatActivity {

    MediaPlayer oneDice;
    Button fbtn;
    android.os.Vibrator Vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);
        Vibrator = (android.os.Vibrator)getSystemService(ten.VIBRATOR_SERVICE);
        fbtn = findViewById(R.id.tenbutton);
        oneDice= MediaPlayer.create(ten.this,R.raw.eleven);;
        fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                oneDice.start();
                startActivity(new Intent(ten.this, eleven.class));
            }
        });
    }
}
