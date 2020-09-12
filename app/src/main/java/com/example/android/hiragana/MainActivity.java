package com.example.android.hiragana;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     //menampilkan menu utama

        mp = MediaPlayer.create(this, R.raw.backsound1);
        mp.setLooping(true);
        mp.setVolume(1,1);
        mp.start();

        ImageView ibtabelhuruf = (ImageView) findViewById(R.id.ibtabelhuruf);
        ibtabelhuruf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp.stop();
                Intent i = new Intent(MainActivity.this, MenuHuruf.class);     //ke menu tabel huruf
                startActivity(i);
            }
        });

        ImageView ibdaftarkata = (ImageView) findViewById(R.id.ibdaftarkata);
        ibdaftarkata.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp.stop();
                Intent i = new Intent(MainActivity.this, listKategori.class);        //ke menu daftar kata (listKategori)
                startActivity(i);
            }
        });

        ImageView ibbelajar = (ImageView) findViewById(R.id.ibbelajar);
        ibbelajar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp.stop();
                Intent i = new Intent(MainActivity.this, belajar.class);     //ke menu belajar
                startActivity(i);
            }
        });

        ImageView iblatihan = (ImageView) findViewById(R.id.iblatihan);
        iblatihan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                mp.stop();
                Intent i = new Intent(MainActivity.this, listSoal.class);    //ke menu latihan (listsoal)
                startActivity(i);
            }
        });

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            keluarYN();     //lari nya ke public void keluarYN
            return true;
        }
        return super.onKeyDown(keyCode, event);     //tombol back untuk kembali ke menu sebelumnya
    }


    public void keluarYN() {
        AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);
        ad.setTitle("Konfirmasi");
        ad.setMessage("Apakah benar ingin keluar?");

        ad.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();      //keluar aplikasi
                mp.stop();
            }});

        ad.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });

        ad.show();
    }
}
