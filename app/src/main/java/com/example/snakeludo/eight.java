package com.example.snakeludo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eight extends AppCompatActivity {

    MediaPlayer oneDice;
    Button ebtn;
    android.os.Vibrator Vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        Vibrator = (android.os.Vibrator)getSystemService(eight.VIBRATOR_SERVICE);
        ebtn = findViewById(R.id.eightbutton);
        oneDice= MediaPlayer.create(eight.this,R.raw.nine);;
        ebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                oneDice.start();
                startActivity(new Intent(eight.this, nine.class));
            }
        });
    }
}
