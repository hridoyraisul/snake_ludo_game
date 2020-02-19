package com.example.snakeludo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    MediaPlayer roleDice;
    Button btn;
    //Button btnx;
    Vibrator Vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Vibrator = (Vibrator)getSystemService(MainActivity.VIBRATOR_SERVICE);

        btn = findViewById(R.id.button);
        //btnx = findViewById(R.id.button6);

        roleDice=MediaPlayer.create(MainActivity.this,R.raw.one_a);
        //roleDice=MediaPlayer.create(MainActivity.this,R.raw.rise);
        //roleDice=MediaPlayer.create(MainActivity.this,R.raw.shap);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator.vibrate(300);
                roleDice.start();
                startActivity(new Intent(MainActivity.this, one.class));
            }
        });

//        btnx.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Vibrator.vibrate(300);
//                roleDice.start();
//                startActivity(new Intent(MainActivity.this, dice.class));
//            }
//        });



    }



    //public void play(View v){
      //roleDice.start();
       // startActivity(new Intent(MainActivity.this, snake.class));
   // }


}
