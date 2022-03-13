package edu.iuh.bai4_desginiu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView grvThing;
    ArrayList<ElectricThing> arrayList;
    CustomAdapter ctAdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grvThing = findViewById(R.id.grvThing);

        arrayList = new ArrayList<>();

        arrayList.add(new ElectricThing("Cáp chuyển đổi đa năng...", 2, 120000
                ,20, R.drawable.giacchuyen, 20));
        arrayList.add(new ElectricThing("Cáp dây sạc đa năng...", 4, 120000
        ,20, R.drawable.daynguon, 20));
        arrayList.add(new ElectricThing("Cổng chuyển đổi nguồn...", 4, 150000
                ,40, R.drawable.dauchuyendoipsps, 100));
        arrayList.add(new ElectricThing("Đầu sạc iphoneX...", 5, 300000
                ,70, R.drawable.dauchuyendoi, 20));
        arrayList.add(new ElectricThing("2 đầu dây sạc đa năng...", 2, 325000
                ,50, R.drawable.carbusbtops, 35));
        arrayList.add(new ElectricThing("Đầu dây sạc đa năng...", 3, 100000
                ,20, R.drawable.daucam, 10));

        ctAdt = new CustomAdapter(MainActivity.this, R.layout.item_girdview, arrayList);

        grvThing.setAdapter(ctAdt);

    }
}