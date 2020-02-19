package com.example.snakeludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class two extends AppCompatActivity {
    MediaPlayer oneDice;
    Button twobtn;
    android.os.Vibrator Vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Vibrator = (android.os.Vibrator)getSystemService(two.VIBRATOR_SERVICE);
        twobtn = findViewById(R.id.twobutton);
        oneDice= MediaPlayer.create(two.this,R.raw.three);;
        twobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                oneDice.start();
                startActivity(new Intent(two.this, three.class));
            }
        });
    }
}
