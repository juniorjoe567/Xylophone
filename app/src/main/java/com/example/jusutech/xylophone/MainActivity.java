package com.example.jusutech.xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    float leftVolume = 1.0f;
    float rightVolume = 1.0f;
    int priority = 1;
    int theLoop = 0;
    float theRate = 1.0f;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SoundPool soundPool = new SoundPool(1,AudioManager.STREAM_MUSIC,0);

        //Get the sound id using the sound pool class. it takes the three parameters, the third one is the priority
        final int soundIdC = soundPool.load(getApplicationContext(),R.raw.note1_c,1);
        final int soundIdD = soundPool.load(getApplicationContext(),R.raw.note2_d,1);
        final int soundIdE = soundPool.load(getApplicationContext(),R.raw.note3_e,1);
        final int soundIdF = soundPool.load(getApplicationContext(),R.raw.note4_f,1);
        final int soundIdG = soundPool.load(getApplicationContext(),R.raw.note5_g,1);
        final int soundIdA = soundPool.load(getApplicationContext(),R.raw.note6_a,1);
        final int soundIdB = soundPool.load(getApplicationContext(),R.raw.note7_b,1);

        Button button1 = (Button)findViewById(R.id.playC);
        Button button2 = (Button)findViewById(R.id.playD);
        Button button3 = (Button)findViewById(R.id.playE);
        Button button4 = (Button)findViewById(R.id.playF);
        Button button5 = (Button)findViewById(R.id.playG);
        Button button6 = (Button)findViewById(R.id.playA);
        Button button7 = (Button)findViewById(R.id.playB);


        //set an onlick method to the button.
        button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            //call the play method to be able to play the audio. this method belongs to the soundpool class.
            soundPool.play(soundIdC, leftVolume, rightVolume, priority, theLoop, theRate);

        }
    });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(soundIdD, leftVolume, rightVolume, priority, theLoop, theRate);

            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(soundIdE, leftVolume, rightVolume, priority, theLoop, theRate);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(soundIdF, leftVolume, rightVolume, priority, theLoop, theRate);

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(soundIdG, leftVolume, rightVolume, priority, theLoop, theRate);

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(soundIdA, leftVolume, rightVolume, priority, theLoop, theRate);

            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(soundIdB, leftVolume, rightVolume, priority, theLoop, theRate);

            }
        });







        //use the sound id to play the audio

        //initialise the load function


    }


}
