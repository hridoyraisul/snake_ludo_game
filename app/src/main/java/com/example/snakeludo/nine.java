package com.example.snakeludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nine extends AppCompatActivity {

    MediaPlayer oneDice;
    Button nbtn;
    android.os.Vibrator Vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);
        Vibrator = (android.os.Vibrator)getSystemService(nine.VIBRATOR_SERVICE);
        nbtn = findViewById(R.id.ninebutton);
        oneDice= MediaPlayer.create(nine.this,R.raw.ten);;
        nbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                oneDice.start();
                startActivity(new Intent(nine.this, ten.class));
            }
        });
    }
}
