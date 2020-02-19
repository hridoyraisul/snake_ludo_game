package com.example.snakeludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class five extends AppCompatActivity {

    MediaPlayer oneDice;
    Button fibtn;
    android.os.Vibrator Vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        Vibrator = (android.os.Vibrator)getSystemService(five.VIBRATOR_SERVICE);
        fibtn = findViewById(R.id.fivebutton);
        oneDice= MediaPlayer.create(five.this,R.raw.six);;
        fibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                oneDice.start();
                startActivity(new Intent(five.this, six.class));
            }
        });
    }
}
