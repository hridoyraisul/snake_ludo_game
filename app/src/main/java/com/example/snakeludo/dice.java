package com.example.snakeludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class dice extends AppCompatActivity {
    MediaPlayer roleDice3;
    MediaPlayer roleDicex;
    Button btn3;
    Button btny;
    Vibrator Vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        Vibrator = (Vibrator)getSystemService(MainActivity.VIBRATOR_SERVICE);

        btn3 = findViewById(R.id.button3);
        btny = findViewById(R.id.button5);

        roleDice3=MediaPlayer.create(dice.this,R.raw.nghor);
        roleDicex=MediaPlayer.create(dice.this,R.raw.nstart);

        //roleDice=MediaPlayer.create(MainActivity.this,R.raw.rise);
        //roleDice=MediaPlayer.create(MainActivity.this,R.raw.shap);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                roleDice3.start();
                startActivity(new Intent(dice.this, snake.class));
            }
        });

        btny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                roleDicex.start();
                startActivity(new Intent(dice.this, snake.class));
            }
        });

    }
}
