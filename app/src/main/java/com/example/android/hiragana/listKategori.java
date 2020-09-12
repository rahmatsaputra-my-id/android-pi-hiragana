package com.example.android.hiragana;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class listKategori extends AppCompatActivity implements OnItemClickListener {
    private ListView listView1;
    listheaderKategori[] listdata;
    int jd = 0;
    String[] arrKat;

    MediaPlayer mp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        mp = MediaPlayer.create(this, R.raw.backsound1);
        mp.setLooping(true);
        mp.setVolume(1,1);
        mp.start();

        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Daftar Kata");

        jd = 10;
        arrKat = new String[jd];
        arrKat[0] = "Keluarga";
        arrKat[1] = "Dapur";
        arrKat[2] = "Sekolah";
        arrKat[3] = "Kendaraan";
        arrKat[4] = "Tubuh";
        arrKat[5] = "Makanan";
        arrKat[6] = "Minuman";
        arrKat[7] = "Buah";
        arrKat[8] = "Sayur";
        arrKat[9] = "Binatang";


        listdata = new listheaderKategori[jd];
        for (int j = 0; j < jd; j++) {
            listdata[j] = new listheaderKategori(R.drawable.star_on, arrKat[j]);
        }
        listitemKategori adapter = new listitemKategori(this, R.layout.listitem, listdata);
        listView1 = (ListView) findViewById(R.id.listView1);

        listView1.setAdapter(adapter);
        listView1.setOnItemClickListener((OnItemClickListener) this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        Intent i = new Intent(listKategori.this, listTittle.class);
        i.putExtra("data", arrKat[position]);
        finish();
        mp.stop();
        startActivity(i);

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            Intent i = new Intent(listKategori.this, MainActivity.class); //kembali ke menu utama
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            mp.stop();
            startActivity(i);
        }
        return super.onKeyDown(keyCode, event);
    }
}