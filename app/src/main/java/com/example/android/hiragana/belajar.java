package com.example.android.hiragana;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;


public class belajar extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belajar);

        mp = MediaPlayer.create(this, R.raw.backsound1);
        mp.setLooping(true);
        mp.setVolume(1,1);
        mp.start();

        Button aKa = findViewById(R.id.belajar_aKa);
        aKa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(belajar.this, belajar_aka.class);
                mp.pause();
                startActivity(i);
            }
        });

        Button saTa = findViewById(R.id.belajar_saTa);
        saTa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(belajar.this, belajar_sata.class);
                mp.pause();
                startActivity(i);
            }
        });

        Button naHa = findViewById(R.id.belajar_naHa);
        naHa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(belajar.this, belajar_naha.class);
                mp.pause();
                startActivity(i);
            }
        });

        Button maYa = findViewById(R.id.belajar_maYa);
        maYa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(belajar.this, belajar_maya.class);
                mp.pause();
                startActivity(i);
            }
        });

        Button raWa = findViewById(R.id.belajar_raWa);
        raWa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(belajar.this, belajar_rawa.class);
                mp.pause();
                startActivity(i);
            }
        });

        Button tenMa1 = findViewById(R.id.belajar_tenMa1);
        tenMa1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(belajar.this, belajar_tenma1.class);
                mp.pause();
                startActivity(i);
            }
        });

        Button tenMa2 = findViewById(R.id.belajar_tenMa2);
        tenMa2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(belajar.this, belajar_tenma2.class);
                mp.pause();
                startActivity(i);
            }
        });
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            Intent i = new Intent(belajar.this, MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            mp.stop();
            startActivity(i);
        }
        return super.onKeyDown(keyCode, event);
    }
}
