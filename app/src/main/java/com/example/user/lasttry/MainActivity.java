package com.example.user.lasttry;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer catSoundMP = MediaPlayer.create(this, R.raw.cat);
        final MediaPlayer dogSoundMP = MediaPlayer.create(this, R.raw.dog);
        final MediaPlayer dolphinSoundMP = MediaPlayer.create(this, R.raw.dolphin);
        final MediaPlayer elephantSoundMP = MediaPlayer.create(this, R.raw.elephant);
        final MediaPlayer sealSoundMP = MediaPlayer.create(this, R.raw.seal);
        final MediaPlayer wolfSoundMP = MediaPlayer.create(this, R.raw.wolf);
        final MediaPlayer bearSoundMP = MediaPlayer.create(this, R.raw.bear);
        final MediaPlayer camelSoundMP = MediaPlayer.create(this, R.raw.camel);
        final MediaPlayer goatSoundMP = MediaPlayer.create(this, R.raw.goat);
        final MediaPlayer horseSoundMP = MediaPlayer.create(this, R.raw.horse);
        final MediaPlayer lionSoundMP = MediaPlayer.create(this, R.raw.lion);
        final MediaPlayer pigSoundMP = MediaPlayer.create(this, R.raw.pig);
        final MediaPlayer tigerSoundMP = MediaPlayer.create(this, R.raw.tiger);

        ImageButton playCat = (ImageButton) this.findViewById(R.id.play_cat);
        ImageButton playDog = (ImageButton) this.findViewById(R.id.play_dog);
        ImageButton playDolphin = (ImageButton) this.findViewById(R.id.play_dolphin);
        ImageButton playElephant = (ImageButton) this.findViewById(R.id.play_elephant);
        ImageButton playSeal = (ImageButton) this.findViewById(R.id.play_seal);
        ImageButton playWolf = (ImageButton) this.findViewById(R.id.play_wolf);
        ImageButton playBear = (ImageButton) this.findViewById(R.id.play_bear);
        ImageButton playCamel = (ImageButton) this.findViewById(R.id.play_camel);
        ImageButton playGoat = (ImageButton) this.findViewById(R.id.play_goat);
        ImageButton playHorse = (ImageButton) this.findViewById(R.id.play_horse);
        ImageButton playLion = (ImageButton) this.findViewById(R.id.play_lion);
        ImageButton playPig = (ImageButton) this.findViewById(R.id.play_pig);
        ImageButton playTiger = (ImageButton) this.findViewById(R.id.play_tiger);

        playCat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(catSoundMP.isPlaying() == true)
                    catSoundMP.pause();
                else
                    catSoundMP.start();

            }
        });

        playDog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(dogSoundMP.isPlaying() == true)
                    dogSoundMP.pause();
                else
                    dogSoundMP.start();
            }
        });
        playDolphin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(dolphinSoundMP.isPlaying() == true)
                    dolphinSoundMP.pause();
                else
                    dolphinSoundMP.start();
            }
        });
        playElephant.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(elephantSoundMP.isPlaying() == true)
                    elephantSoundMP.pause();
                else
                    elephantSoundMP.start();

            }
        });

        playSeal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(sealSoundMP.isPlaying() == true)
                    sealSoundMP.pause();
                else
                    sealSoundMP.start();


            }
        });
        playWolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(wolfSoundMP.isPlaying() == true)
                    wolfSoundMP.pause();
                else
                    wolfSoundMP.start();
            }
        });
        playBear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(bearSoundMP.isPlaying() == true)
                    bearSoundMP.pause();
                else
                    bearSoundMP.start();

            }
        });
        playCamel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(camelSoundMP.isPlaying() == true)
                    camelSoundMP.pause();
                else
                    camelSoundMP.start();
            }
        });playGoat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(goatSoundMP.isPlaying() == true)
                    goatSoundMP.pause();
                else
                    goatSoundMP.start();
            }
        });playHorse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(horseSoundMP.isPlaying() == true)
                    horseSoundMP.pause();
                else
                    horseSoundMP.start();
            }
        });playLion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(lionSoundMP.isPlaying() == true)
                    lionSoundMP.pause();
                else
                    lionSoundMP.start();
            }
        });playPig.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(pigSoundMP.isPlaying() == true)
                    pigSoundMP.pause();
                else
                    pigSoundMP.start();
            }
        });
        playTiger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tigerSoundMP.isPlaying() == true)
                    tigerSoundMP.pause();
                else
                    tigerSoundMP.start();
            }
        });
    }
}
