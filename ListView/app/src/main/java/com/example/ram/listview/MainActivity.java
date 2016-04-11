package com.example.ram.listview;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> names = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(com.example.ram.listview.R.layout.activity_main);

        names.add("ram");
        names.add("raz");
        names.add("rak");
        names.add("rod");
        names.add("ramm");
        names.add("ramesh");
        names.add("ra");
        names.add("rajesh");
        names.add("rishi");
        ListView list = (ListView) findViewById(R.id.mainListView);
        ArrayAdapter ad = new ArrayAdapter(this, R.layout.listitemlayout, R.id.rowTextView, names);
        list.setAdapter(ad);
    }
}










