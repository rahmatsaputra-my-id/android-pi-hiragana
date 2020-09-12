package com.example.android.hiragana;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class MenuHuruf extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_huruf);

        mp = MediaPlayer.create(this, R.raw.backsound1);
        mp.setLooping(true);
        mp.setVolume(1,1);
        mp.start();

        Button seion = findViewById(R.id.btn_seion);
        seion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(MenuHuruf.this, huruf_seion.class);
                mp.stop();
                startActivity(i);
            }
        });

        Button dakuon = findViewById(R.id.btn_dakuon);
        dakuon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(MenuHuruf.this, huruf_dakuon.class);
                mp.stop();
                startActivity(i);
            }
        });

        Button handakuon = findViewById(R.id.btn_handakuon);
        handakuon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(MenuHuruf.this, huruf_handakuon.class);
                mp.stop();
                startActivity(i);
            }
        });

        Button yoon = findViewById(R.id.btn_yoon);
        yoon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(MenuHuruf.this, huruf_yoon.class);
                mp.stop();
                startActivity(i);
            }
        });
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            Intent i = new Intent(MenuHuruf.this, MainActivity.class); //kembali ke menu utama
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            mp.stop();
            startActivity(i);
        }
        return super.onKeyDown(keyCode, event);
    }
}
