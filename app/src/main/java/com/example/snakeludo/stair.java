package com.example.snakeludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class stair extends AppCompatActivity {
    MediaPlayer roleDice4;
    Button btn4;
    Button btnw;
    Vibrator Vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stair);

        Vibrator = (Vibrator)getSystemService(MainActivity.VIBRATOR_SERVICE);

        btn4 = findViewById(R.id.button4);
        btnw = findViewById(R.id.button8);

        roleDice4=MediaPlayer.create(stair.this,R.raw.nstair);
        //roleDice=MediaPlayer.create(MainActivity.this,R.raw.rise);
        //roleDice=MediaPlayer.create(MainActivity.this,R.raw.shap);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                roleDice4.start();
                startActivity(new Intent(stair.this, MainActivity.class));
            }
        });

        btnw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                roleDice4.start();
                startActivity(new Intent(stair.this, MainActivity.class));
            }
        });

    }
}
