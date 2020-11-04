package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotomakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();
    private ArrayList<String> hargaMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecycleViewAdapter adapter = new RecycleViewAdapter(fotomakanan, namaMakanan, infoMakanan, hargaMakanan, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        namaMakanan.add("Pecel Lele");
        fotomakanan.add("https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Pecel_Lele_1.JPG/220px-Pecel_Lele_1.JPG");
        infoMakanan.add("Nasi Putih, Lele goreng 2 ekor, sambal ijo, lalapan");
        hargaMakanan.add("15.000");

        namaMakanan.add("Nasi Goreng Mercon");
        fotomakanan.add("https://cdn.idntimes.com/content-images/post/20200701/11327301-775571635874927-2031252039-n-29d1b0d650c11df88c64c8a924136e23_600x400.jpg");
        infoMakanan.add("Nasi goreng, telur orak arik, sayuran, ayam, cabe 20");
        hargaMakanan.add("14.500");

        namaMakanan.add("Ayam Geprek Keju");
        fotomakanan.add("https://selerasa.com/wp-content/uploads/2019/02/Resep-ayam-geprek-keju-280x280.jpg");
        infoMakanan.add("nasi putih, ayam geprek dilapisi keju mozarela");
        hargaMakanan.add("20.000");

        namaMakanan.add("Kari Ayam");
        fotomakanan.add("https://cdns.klimg.com/merdeka.com/i/w/news/2019/10/07/1115565/670x335/resep-kare-ayam-kampung-spesial-rev-1.jpg");
        infoMakanan.add("Ayam dengan kuah kuning");
        hargaMakanan.add("17.500");

        namaMakanan.add("Tahu Bulat");
        fotomakanan.add("https://i1.wp.com/resepkoki.id/wp-content/uploads/2016/11/Resep-Tahu-Bulat.jpg?fit=1181%2C1300&ssl=1");
        infoMakanan.add("tahu bulat digoreng dadakan 500an nyoi");
        hargaMakanan.add("500");

        namaMakanan.add("Salad Buah");
        fotomakanan.add("https://cdn-2.tstatic.net/jateng/foto/bank/images/saladd.jpg");
        infoMakanan.add("berbagai macam buah diberi mayonaise, saos tomat, susu dan keju");
        hargaMakanan.add("12.000");

        prosesRecyclerViewAdapter();
    }
}