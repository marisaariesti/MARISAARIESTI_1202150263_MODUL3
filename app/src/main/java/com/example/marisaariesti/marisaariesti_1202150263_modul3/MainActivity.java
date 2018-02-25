package com.example.marisaariesti.marisaariesti_1202150263_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvview;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> MerekMinuman;
    private ArrayList<String> PenjelasanM;
    private ArrayList<Integer> gambar;

    private String[] Nminuman = {
            "Aqua",
            "Pristine",
            "LeMineral",
            "Cleo",
            "Club",
            "Amidis",
            "Ades",
            "Equil",
            "Evian",
            "Nestle",
            "Vit"};

    private String[] PMinum = {
            "ini adalah minuman aqua", "ini adalah minuman pristine",
            "ini adalah minuman LeMineral", "ini adalah minuman Cleo  ",
            "ini adalah minuman Club", "ini adalah minuman Amidis",
            "ini adalah minuman Ades", "ini adalah minuman Equil",
            "ini adalah minuman Evian", "ini adalah minuman Nestle",
            "ini adalah minuman Vit"};

    //Daftar Gambar yang akan muncul
    private int[] Gambar = {R.drawable.aqua,
            R.drawable.pristine,
            R.drawable.leminerale,
            R.drawable.cleo,
            R.drawable.club,
            R.drawable.amidis,
            R.drawable.ades,
            R.drawable.equil,
            R.drawable.evian,
            R.drawable.nestle,
            R.drawable.vit,};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mendeklrasikan array data menu, harga, image
        MerekMinuman = new ArrayList<>();
        PenjelasanM = new ArrayList<>();
        gambar = new ArrayList<>();



        rvview = (RecyclerView) findViewById(R.id.viewR);
        rvview.setHasFixedSize(true);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            rvview.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        } else {
            rvview.setLayoutManager(new GridLayoutManager(MainActivity.this, 1));
        }ListItem();


    }
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){
            rvview.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        }else {
            rvview.setLayoutManager(new GridLayoutManager(MainActivity.this, 1));
        }
    }

    private void ListItem() {
        for (int w = 0; w < Nminuman.length; w++) {
            MerekMinuman.add(Nminuman[w]);
            PenjelasanM.add(PMinum[w]);
            gambar.add(Gambar[w]);

            adapter = new RecyclerViewAdapter(MerekMinuman, PenjelasanM, gambar);
            rvview.setAdapter(adapter);
        }
    }
}
