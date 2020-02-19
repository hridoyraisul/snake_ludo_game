package com.example.snakeludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class snake extends AppCompatActivity {

    MediaPlayer roleDice2;
    Button btn2;
    Button btnz;
    Vibrator Vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snake);

        Vibrator = (Vibrator)getSystemService(MainActivity.VIBRATOR_SERVICE);

        btn2 = findViewById(R.id.button2);
        btnz = findViewById(R.id.button7);

        roleDice2=MediaPlayer.create(snake.this,R.raw.nshap);
        //roleDice=MediaPlayer.create(MainActivity.this,R.raw.rise);
        //roleDice=MediaPlayer.create(MainActivity.this,R.raw.shap);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                roleDice2.start();
                startActivity(new Intent(snake.this, stair.class));
            }
        });

        btnz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                roleDice2.start();
                startActivity(new Intent(snake.this, stair.class));
            }
        });
    }

    }
