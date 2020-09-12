package com.example.android.hiragana;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import java.util.ArrayList;

public class listTittle extends Activity {
    int jd;
    String[] arrNama;
    String[] arrDes;
    String[] arrTittle;
    int[] arrGbr;
    int[] arrSuara;

    MediaPlayer mp;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listtittle);

        Intent i = getIntent();
        String data = i.getStringExtra("data");

        if (data.equalsIgnoreCase("Keluarga")) {
            calldata1();
        } else if (data.equalsIgnoreCase("Dapur")) {
            calldata2();
        } else if (data.equalsIgnoreCase("Sekolah")) {
            calldata3();
        } else if (data.equalsIgnoreCase("Kendaraan")) {
            calldata4();
        } else if (data.equalsIgnoreCase("Tubuh")) {
            calldata5();
        } else if (data.equalsIgnoreCase("Makanan")) {
            calldata6();
        } else if (data.equalsIgnoreCase("Minuman")) {
            calldata7();
        } else if (data.equalsIgnoreCase("Buah")) {
            calldata8();
        } else if (data.equalsIgnoreCase("Sayur")) {
            calldata9();
        } else if (data.equalsIgnoreCase("Binatang")) {
            calldata10();
        }


        ArrayList<ItemDetails> image_details = GetSearchResults();

        final ListView lv1 = findViewById(R.id.listV_main);
        lv1.setAdapter(new ItemListBaseAdapter(this, image_details));

        lv1.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = lv1.getItemAtPosition(position);
                ItemDetails obj_itemDetails = (ItemDetails) o;

                mp = MediaPlayer.create(listTittle.this, obj_itemDetails.getSuara());
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
    }

    private ArrayList<ItemDetails> GetSearchResults() {
        ArrayList<ItemDetails> results = new ArrayList<ItemDetails>();
        ItemDetails item_details = null;
        for (int j = 0; j < jd; j++) {
            item_details = new ItemDetails();
            item_details.setName(arrNama[j]);
            item_details.setItemDescription(arrDes[j]);
            item_details.setGambar(arrGbr[j]);
            item_details.setTittle(arrTittle[j]);
            item_details.setSuara(arrSuara[j]);
            results.add(item_details);
        }
        return results;
    }


    void calldata1() {
        jd = 10;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "ちち";
        arrNama[0] = "Chichi";
        arrDes[0] = "Ayah";
        arrGbr[0] = R.drawable.chichi;
        arrSuara[0] = R.raw.chichi;

        arrTittle[1] = "はは";
        arrNama[1] = "Haha";
        arrDes[1] = "Ibu";
        arrGbr[1] = R.drawable.haha;
        arrSuara[1] = R.raw.haha;

        arrTittle[2] = "あね";
        arrNama[2] = "Ane";
        arrDes[2] = "Kakak perempuan";
        arrGbr[2] = R.drawable.ane;
        arrSuara[2] = R.raw.ane;

        arrTittle[3] = "おとうと";
        arrNama[3] = "Otouto";
        arrDes[3] = "Adik laki-laki";
        arrGbr[3] = R.drawable.otouto;
        arrSuara[3] = R.raw.otouto;

        arrTittle[4] = "いとこ";
        arrNama[4] = "Itoko";
        arrDes[4] = "Sepupu";
        arrGbr[4] = R.drawable.itoko;
        arrSuara[4] = R.raw.itoko;

        arrTittle[5] = "おじいさん";
        arrNama[5] = "Ojiisan";
        arrDes[5] = "Kakek";
        arrGbr[5] = R.drawable.ojiisan;
        arrSuara[5] = R.raw.ojiisan;

        arrTittle[6] = "おばあさん";
        arrNama[6] = "Obaasan";
        arrDes[6] = "Nenek";
        arrGbr[6] = R.drawable.obaasan;
        arrSuara[6] = R.raw.obaasan;

        arrTittle[7] = "おにいさん";
        arrNama[7] = "Oniisan";
        arrDes[7] = "Kakak laki - laki ";
        arrGbr[7] = R.drawable.oniisan;
        arrSuara[7] = R.raw.oniisan;

        arrTittle[8] = "いもうと";
        arrNama[8] = "Imouto";
        arrDes[8] = "Adik perempuan";
        arrGbr[8] = R.drawable.imouto;
        arrSuara[8] = R.raw.imouto;

        arrTittle[9] = "あかちゃん";
        arrNama[9] = "Akachan";
        arrDes[9] = "Bayi";
        arrGbr[9] = R.drawable.akachan;
        arrSuara[9] = R.raw.akachan;

    }

    void calldata2() {
        jd = 10;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "なべ";
        arrNama[0] = "Nabe";
        arrDes[0] = "Panci masak";
        arrGbr[0] = R.drawable.nabe;
        arrSuara[0] = R.raw.nabe;

        arrTittle[1] = "まないた";
        arrNama[1] = "Manaita";
        arrDes[1] = "Talenan";
        arrGbr[1] = R.drawable.manaita;
        arrSuara[1] = R.raw.manaita;

        arrTittle[2] = "ごみばこ";
        arrNama[2] = "Gomibako";
        arrDes[2] = "Tempat sampah";
        arrGbr[2] = R.drawable.gomibako;
        arrSuara[2] = R.raw.gomibako;

        arrTittle[3] = "ひらなべ";
        arrNama[3] = "Hiranabe";
        arrDes[3] = "Wajan";
        arrGbr[3] = R.drawable.hiranabe;
        arrSuara[3] = R.raw.hiranabe;

        arrTittle[4] = "ひしゃく";
        arrNama[4] = "Hishaku";
        arrDes[4] = "Sendok sayur";
        arrGbr[4] = R.drawable.hishaku;
        arrSuara[4] = R.raw.hishaku;

        arrTittle[5] = "でんしれんじ";
        arrNama[5] = "Denshirenji";
        arrDes[5] = "Microwave";
        arrGbr[5] = R.drawable.denshirenji;
        arrSuara[5] = R.raw.denshirenji;

        arrTittle[6] = "がすこんろ";
        arrNama[6] = "Gasukonro";
        arrDes[6] = "Kompor";
        arrGbr[6] = R.drawable.gasukonro;
        arrSuara[6] = R.raw.gasukonro;

        arrTittle[7] = "じゃぐち";
        arrNama[7] = "Jaguchi";
        arrDes[7] = "Keran Air ";
        arrGbr[7] = R.drawable.jaguchi;
        arrSuara[7] = R.raw.jaguchi;

        arrTittle[8] = "れいとう";
        arrNama[8] = "Reitou";
        arrDes[8] = "Kulkas";
        arrGbr[8] = R.drawable.reitou;
        arrSuara[8] = R.raw.reitou;

        arrTittle[9] = "ちゃわん";
        arrNama[9] = "Chawan";
        arrDes[9] = "Cangkir Teh";
        arrGbr[9] = R.drawable.chawan;
        arrSuara[9] = R.raw.chawan;
    }

    void calldata3() {
        jd = 10;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "じしょ";
        arrNama[0] = "Jisho";
        arrDes[0] = "Kamus";
        arrGbr[0] = R.drawable.jisho;
        arrSuara[0] = R.raw.jisho;

        arrTittle[1] = "じょうぎ";
        arrNama[1] = "Jougi";
        arrDes[1] = "Penggaris";
        arrGbr[1] = R.drawable.jougi;
        arrSuara[1] = R.raw.jougi;

        arrTittle[2] = "きょうかしょ";
        arrNama[2] = "Kyoukasho";
        arrDes[2] = "Buku pelajaran";
        arrGbr[2] = R.drawable.kyoukasho;
        arrSuara[2] = R.raw.kyoukasho;

        arrTittle[3] = "つくえ";
        arrNama[3] = "Tsukue";
        arrDes[3] = "Meja";
        arrGbr[3] = R.drawable.tsukue;
        arrSuara[3] = R.raw.tsukue;

        arrTittle[4] = "いす";
        arrNama[4] = "Isu";
        arrDes[4] = "Kursi";
        arrGbr[4] = R.drawable.isu;
        arrSuara[4] = R.raw.isu;

        arrTittle[5] = "えんぴつ";
        arrNama[5] = "Enpitsu";
        arrDes[5] = "Pensil";
        arrGbr[5] = R.drawable.enpitsu;
        arrSuara[5] = R.raw.enpitsu;

        arrTittle[6] = "とけい";
        arrNama[6] = "Tokei";
        arrDes[6] = "Jam Dinding";
        arrGbr[6] = R.drawable.tokei;
        arrSuara[6] = R.raw.tokei;

        arrTittle[7] = "けいしごむ";
        arrNama[7] = "Keishigomu ";
        arrDes[7] = "Penghapus ";
        arrGbr[7] = R.drawable.keishigomu ;
        arrSuara[7] = R.raw.keishigomu ;

        arrTittle[8] = "えんぴつ けずり";
        arrNama[8] = "Enpitsu Kezuri";
        arrDes[8] = "Rautan";
        arrGbr[8] = R.drawable.enpitsu_kezuri;
        arrSuara[8] = R.raw.enpitsu_kezuri;

        arrTittle[9] = "どあ";
        arrNama[9] = "Doa ";
        arrDes[9] = "Pintu";
        arrGbr[9] = R.drawable.doa ;
        arrSuara[9] = R.raw.doa ;
    }

    void calldata4() {
        jd = 10;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "くるま";
        arrNama[0] = "Kuruma";
        arrDes[0] = "Mobil";
        arrGbr[0] = R.drawable.kuruma;
        arrSuara[0] = R.raw.kuruma;

        arrTittle[1] = "でんしゃ";
        arrNama[1] = "Densha";
        arrDes[1] = "Kereta api";
        arrGbr[1] = R.drawable.densha;
        arrSuara[1] = R.raw.densha;

        arrTittle[2] = "じてんしゃ";
        arrNama[2] = "Jitensha";
        arrDes[2] = "Sepeda";
        arrGbr[2] = R.drawable.jitensha;
        arrSuara[2] = R.raw.jitensha;

        arrTittle[3] = "ふね";
        arrNama[3] = "Fune";
        arrDes[3] = "Kapal";
        arrGbr[3] = R.drawable.fune;
        arrSuara[3] = R.raw.fune;

        arrTittle[4] = "ひこうき";
        arrNama[4] = "Hikouki";
        arrDes[4] = "Pesawat terbang";
        arrGbr[4] = R.drawable.hikouki;
        arrSuara[4] = R.raw.hikouki;

        arrTittle[5] = "ちかてつ";
        arrNama[5] = "Chikatetsu";
        arrDes[5] = "Kereta Bawah Tanah";
        arrGbr[5] = R.drawable.chikatetsu;
        arrSuara[5] = R.raw.chikatetsu;

        arrTittle[6] = "タクシー";
        arrNama[6] = "Takushii";
        arrDes[6] = "Taxii";
        arrGbr[6] = R.drawable.takushii;
        arrSuara[6] = R.raw.takushii;

        arrTittle[7] = "バイク";
        arrNama[7] = "Baiku";
        arrDes[7] = "Motor ";
        arrGbr[7] = R.drawable.baiku;
        arrSuara[7] = R.raw.baiku;

        arrTittle[8] = "あるいて";
        arrNama[8] = "Aruite";
        arrDes[8] = "Berjalan Kaki";
        arrGbr[8] = R.drawable.aruite;
        arrSuara[8] = R.raw.aruite;

        arrTittle[9] = "しんかんせん";
        arrNama[9] = "Shinkansen";
        arrDes[9] = "Kereta Cepat";
        arrGbr[9] = R.drawable.shinkansen;
        arrSuara[9] = R.raw.shinkansen;
    }

    void calldata5() {
        jd = 10;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "め";
        arrNama[0] = "Me";
        arrDes[0] = "Mata";
        arrGbr[0] = R.drawable.me_mata;
        arrSuara[0] = R.raw.me_mata;

        arrTittle[1] = "みみ";
        arrNama[1] = "Mimi";
        arrDes[1] = "Telinga";
        arrGbr[1] = R.drawable.mimi;
        arrSuara[1] = R.raw.mimi;

        arrTittle[2] = "て";
        arrNama[2] = "Te";
        arrDes[2] = "Tangan";
        arrGbr[2] = R.drawable.te_tangan;
        arrSuara[2] = R.raw.te_tangan;

        arrTittle[3] = "あし";
        arrNama[3] = "Ashi";
        arrDes[3] = "Kaki";
        arrGbr[3] = R.drawable.ashi;
        arrSuara[3] = R.raw.ashi;

        arrTittle[4] = "くちびる";
        arrNama[4] = "Kuchibiru";
        arrDes[4] = "Bibir";
        arrGbr[4] = R.drawable.kuchibiru;
        arrSuara[4] = R.raw.kuchibiru;

        arrTittle[5] = "あたま";
        arrNama[5] = "Atama";
        arrDes[5] = "Kepala";
        arrGbr[5] = R.drawable.atama;
        arrSuara[5] = R.raw.atama;

        arrTittle[6] = "はな";
        arrNama[6] = "Hana";
        arrDes[6] = "Hidung";
        arrGbr[6] = R.drawable.hana;
        arrSuara[6] = R.raw.hana;

        arrTittle[7] = "かみのけ";
        arrNama[7] = "Kaminoke";
        arrDes[7] = "Rambut";
        arrGbr[7] = R.drawable.kaminoke;
        arrSuara[7] = R.raw.kaminoke;

        arrTittle[8] = "うで";
        arrNama[8] = "Ude";
        arrDes[8] = "Lengan";
        arrGbr[8] = R.drawable.ude;
        arrSuara[8] = R.raw.ude;

        arrTittle[9] = "ひざ";
        arrNama[9] = "Hiza";
        arrDes[9] = "Lutut";
        arrGbr[9] = R.drawable.hiza;
        arrSuara[9] = R.raw.hiza;
    }

    void calldata6() {
        jd = 10;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "にく";
        arrNama[0] = "Niku";
        arrDes[0] = "Daging";
        arrGbr[0] = R.drawable.niku;
        arrSuara[0] = R.raw.niku;

        arrTittle[1] = "たまご";
        arrNama[1] = "Tamago";
        arrDes[1] = "Telur";
        arrGbr[1] = R.drawable.tamago;
        arrSuara[1] = R.raw.tamago;

        arrTittle[2] = "ごはん";
        arrNama[2] = "Gohan";
        arrDes[2] = "Nasi";
        arrGbr[2] = R.drawable.gohan;
        arrSuara[2] = R.raw.gohan;

        arrTittle[3] = "のり";
        arrNama[3] = "Nori";
        arrDes[3] = "Rumput laut";
        arrGbr[3] = R.drawable.nori;
        arrSuara[3] = R.raw.nori;

        arrTittle[4] = "すし";
        arrNama[4] = "Sushi";
        arrDes[4] = "Sushi";
        arrGbr[4] = R.drawable.sushi;
        arrSuara[4] = R.raw.sushi;

        arrTittle[5] = "おかし";
        arrNama[5] = "Okashi";
        arrDes[5] = "Permen";
        arrGbr[5] = R.drawable.okashi;
        arrSuara[5] = R.raw.okashi;

        arrTittle[6] = "おこのみゃき";
        arrNama[6] = "Okonomyaki";
        arrDes[6] = "Pancake";
        arrGbr[6] = R.drawable.okonomyaki;
        arrSuara[6] = R.raw.okonomyaki;

        arrTittle[7] = "うどん";
        arrNama[7] = "Udon";
        arrDes[7] = "Udon";
        arrGbr[7] = R.drawable.udon;
        arrSuara[7] = R.raw.udon;

        arrTittle[8] = "さしみ";
        arrNama[8] = "Sashimi";
        arrDes[8] = "Sashimi";
        arrGbr[8] = R.drawable.sashimi;
        arrSuara[8] = R.raw.sashimi;

        arrTittle[9] = "てんぷら";
        arrNama[9] = "Tempura";
        arrDes[9] = "Tempura";
        arrGbr[9] = R.drawable.tenpura;
        arrSuara[9] = R.raw.tenpura;
    }

    void calldata7() {
        jd = 10;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "みず";
        arrNama[0] = "Mizu";
        arrDes[0] = "Air mineral";
        arrGbr[0] = R.drawable.mizu;
        arrSuara[0] = R.raw.mizu;

        arrTittle[1] = "おちゃ";
        arrNama[1] = "Ocha";
        arrDes[1] = "Teh";
        arrGbr[1] = R.drawable.ocha;
        arrSuara[1] = R.raw.ocha;

        arrTittle[2] = "ぎゅうにゅう";
        arrNama[2] = "Gyuunyuu";
        arrDes[2] = "Susu";
        arrGbr[2] = R.drawable.gyunyuu;
        arrSuara[2] = R.raw.gyuunyuu;

        arrTittle[3] = "おさけ";
        arrNama[3] = "Osake";
        arrDes[3] = "Sake";
        arrGbr[3] = R.drawable.osake;
        arrSuara[3] = R.raw.osake;

        arrTittle[4] = "こうちゃ";
        arrNama[4] = "Koucha";
        arrDes[4] = "Teh hitam";
        arrGbr[4] = R.drawable.koucha;
        arrSuara[4] = R.raw.koucha;

        arrTittle[5] = "ビール";
        arrNama[5] = "Biーru";
        arrDes[5] = "Bir";
        arrGbr[5] = R.drawable.biiru;
        arrSuara[5] = R.raw.biiru;

        arrTittle[6] = "ジュース";
        arrNama[6] = "Juーsu";
        arrDes[6] = "Jus Buah";
        arrGbr[6] = R.drawable.juusu;
        arrSuara[6] = R.raw.juusu;

        arrTittle[7] = "コーラ";
        arrNama[7] = "Koーra";
        arrDes[7] = "Soda";
        arrGbr[7] = R.drawable.koora;
        arrSuara[7] = R.raw.koora;

        arrTittle[8] = "ワイン";
        arrNama[8] = "Wain";
        arrDes[8] = "Arak";
        arrGbr[8] = R.drawable.wain;
        arrSuara[8] = R.raw.wain;

        arrTittle[9] = "シャンパン";
        arrNama[9] = "Shanpan";
        arrDes[9] = "Champagne";
        arrGbr[9] = R.drawable.shanpan;
        arrSuara[9] = R.raw.shanpan;
    }

    void calldata8() {
        jd = 10;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "みかん";
        arrNama[0] = "Mikan";
        arrDes[0] = "Jeruk";
        arrGbr[0] = R.drawable.mikan;
        arrSuara[0] = R.raw.mikan;

        arrTittle[1] = "いちご";
        arrNama[1] = "Ichigo";
        arrDes[1] = "Strawberry";
        arrGbr[1] = R.drawable.ichigo;
        arrSuara[1] = R.raw.ichigo;

        arrTittle[2] = "ぶどう";
        arrNama[2] = "Budou";
        arrDes[2] = "Anggur";
        arrGbr[2] = R.drawable.budou;
        arrSuara[2] = R.raw.budou;

        arrTittle[3] = "りんご";
        arrNama[3] = "Ringo";
        arrDes[3] = "Apel";
        arrGbr[3] = R.drawable.ringo;
        arrSuara[3] = R.raw.ringo;

        arrTittle[4] = "ようなし";
        arrNama[4] = "Younashi";
        arrDes[4] = "Pir";
        arrGbr[4] = R.drawable.younashi;
        arrSuara[4] = R.raw.younashi;

        arrTittle[5] = "めろん";
        arrNama[5] = "Meron";
        arrDes[5] = "Melon";
        arrGbr[5] = R.drawable.meron;
        arrSuara[5] = R.raw.meron;

        arrTittle[6] = "すいか";
        arrNama[6] = "Suika";
        arrDes[6] = "Semangka";
        arrGbr[6] = R.drawable.suika;
        arrSuara[6] = R.raw.suika;

        arrTittle[7] = "ばなな";
        arrNama[7] = "Banana";
        arrDes[7] = "Pisang";
        arrGbr[7] = R.drawable.banana;
        arrSuara[7] = R.raw.banana;

        arrTittle[8] = "もも";
        arrNama[8] = "Momo";
        arrDes[8] = "Peach";
        arrGbr[8] = R.drawable.momo;
        arrSuara[8] = R.raw.momo;

        arrTittle[9] = "さくらんぼ";
        arrNama[9] = "Sakuranbo";
        arrDes[9] = "Cherry";
        arrGbr[9] = R.drawable.sakuranbo;
        arrSuara[9] = R.raw.sakuranbo;
    }

    void calldata9() {
        jd = 10;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "きゅうり";
        arrNama[0] = "Kyuuri";
        arrDes[0] = "Mentimun";
        arrGbr[0] = R.drawable.kyuuri;
        arrSuara[0] = R.raw.kyuuri;

        arrTittle[1] = "たまねぎ";
        arrNama[1] = "Tamanegi";
        arrDes[1] = "Bawang";
        arrGbr[1] = R.drawable.tamanegi;
        arrSuara[1] = R.raw.tamanegi;

        arrTittle[2] = "にんじん";
        arrNama[2] = "Ninjin";
        arrDes[2] = "Wortel";
        arrGbr[2] = R.drawable.ninjin;
        arrSuara[2] = R.raw.ninjin;

        arrTittle[3] = "ほうれんそう";
        arrNama[3] = "Hourensou";
        arrDes[3] = "Bayam";
        arrGbr[3] = R.drawable.hourensou;
        arrSuara[3] = R.raw.hourensou;

        arrTittle[4] = "だいこん";
        arrNama[4] = "Daikon";
        arrDes[4] = "Lobak";
        arrGbr[4] = R.drawable.daikon;
        arrSuara[4] = R.raw.daikon;

        arrTittle[5] = "じゃがいも";
        arrNama[5] = "Jagaimo";
        arrDes[5] = "Kentang";
        arrGbr[5] = R.drawable.jagaimo;
        arrSuara[5] = R.raw.jagaimo;

        arrTittle[6] = "かぼちゃ";
        arrNama[6] = "kabocha";
        arrDes[6] = "Labu";
        arrGbr[6] = R.drawable.kabocha;
        arrSuara[6] = R.raw.kabocha;

        arrTittle[7] = "きのこ";
        arrNama[7] = "kinoko";
        arrDes[7] = "Jamur";
        arrGbr[7] = R.drawable.kinoko;
        arrSuara[7] = R.raw.kinoko;

        arrTittle[8] = "とまと";
        arrNama[8] = "Tomato";
        arrDes[8] = "Tomat";
        arrGbr[8] = R.drawable.tomato;
        arrSuara[8] = R.raw.tomato;

        arrTittle[9] = "なす";
        arrNama[9] = "Nasu";
        arrDes[9] = "Terong";
        arrGbr[9] = R.drawable.nasu;
        arrSuara[9] = R.raw.nasu;
    }

    void calldata10() {
        jd = 10;
        arrNama = new String[jd];
        arrDes = new String[jd];
        arrTittle = new String[jd];
        arrGbr = new int[jd];
        arrSuara = new int[jd];

        arrTittle[0] = "ねこ";
        arrNama[0] = "Neko";
        arrDes[0] = "Kucing";
        arrGbr[0] = R.drawable.neko;
        arrSuara[0] = R.raw.neko;

        arrTittle[1] = "いぬ";
        arrNama[1] = "Inu";
        arrDes[1] = "Anjing";
        arrGbr[1] = R.drawable.inu;
        arrSuara[1] = R.raw.inu;

        arrTittle[2] = "とり";
        arrNama[2] = "Tori";
        arrDes[2] = "Burung";
        arrGbr[2] = R.drawable.tori;
        arrSuara[2] = R.raw.tori;

        arrTittle[3] = "かめ";
        arrNama[3] = "Kame";
        arrDes[3] = "Kura - kura";
        arrGbr[3] = R.drawable.kame;
        arrSuara[3] = R.raw.kame;

        arrTittle[4] = "へび";
        arrNama[4] = "Hebi";
        arrDes[4] = "Ular";
        arrGbr[4] = R.drawable.hebi;
        arrSuara[4] = R.raw.hebi;

        arrTittle[5] = "うま";
        arrNama[5] = "Uma";
        arrDes[5] = "Kuda";
        arrGbr[5] = R.drawable.uma;
        arrSuara[5] = R.raw.uma;

        arrTittle[6] = "うし";
        arrNama[6] = "Ushi";
        arrDes[6] = "Sapi";
        arrGbr[6] = R.drawable.ushi;
        arrSuara[6] = R.raw.ushi;

        arrTittle[7] = "ぶた";
        arrNama[7] = "Buta";
        arrDes[7] = "Babi";
        arrGbr[7] = R.drawable.buta;
        arrSuara[7] = R.raw.buta;

        arrTittle[8] = "さかな";
        arrNama[8] = "Sakana";
        arrDes[8] = "Ikan";
        arrGbr[8] = R.drawable.sakana;
        arrSuara[8] = R.raw.sakana;

        arrTittle[9] = "うさぎ";
        arrNama[9] = "Usagi";
        arrDes[9] = "Kelinci";
        arrGbr[9] = R.drawable.usagi;
        arrSuara[9] = R.raw.usagi;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            Intent i = new Intent(listTittle.this, listKategori.class);
            startActivity(i);
        }
        return super.onKeyDown(keyCode, event);
    }
}


