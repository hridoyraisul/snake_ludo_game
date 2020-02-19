package com.example.snakeludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class six extends AppCompatActivity {

    MediaPlayer oneDice;
    Button sbtn;
    android.os.Vibrator Vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        Vibrator = (android.os.Vibrator)getSystemService(six.VIBRATOR_SERVICE);
        sbtn = findViewById(R.id.sixbutton);
        oneDice= MediaPlayer.create(six.this,R.raw.seven);;
        sbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                oneDice.start();
                startActivity(new Intent(six.this, seven.class));
            }
        });
    }
}
