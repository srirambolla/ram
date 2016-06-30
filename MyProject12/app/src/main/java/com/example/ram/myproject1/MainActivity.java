package com.example.ram.myproject1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> planets = new ArrayList<>();
        ArrayList<Integer> image = new ArrayList<>();


        planets.add("pluto");
        image.add(R.drawable.p1);
        planets.add("earth");
        image.add(R.drawable.e1);
        planets.add("jupitar");
        image.add(R.drawable.j1);
        planets.add("neptune");
        image.add(R.drawable.n1);
        planets.add("mars");
        image.add(R.drawable.m1);
        planets.add("mercury");
        image.add(R.drawable.m2);
        planets.add("uranus");
        image.add(R.drawable.u1);
        planets.add("venus");
        image.add(R.drawable.v2);
        planets.add("saturn");
        image.add(R.drawable.s1);

        ListView list = (ListView) findViewById(R.id.mylist);
        ItemsAdapter adapter = new ItemsAdapter(this, planets, image);
        list.setAdapter(adapter);
        int a = adapter.getCount();
        System.out.println("getcount: " + String.valueOf(a));
        Object b=adapter.getItem(5);
        System.out.println("get item:" + String.valueOf(b));

        long c= adapter.getItemId(3);
        System.out.println("get itemid:" + String.valueOf(c));
        int d=adapter.getItemViewType(6);
        System.out.println("get itemviewType:" + String.valueOf(d));
        int e=adapter.getViewTypeCount();
        System.out.println("get itemviewTypeCount:" + String.valueOf(e));
        boolean f=adapter.hasStableIds();
        System.out.println("get has stableid:" + String.valueOf(f));
        boolean g=adapter.isEmpty();
        System.out.println("get empty:" + String.valueOf(g));
        //void h=adapter.registerDataSetObserver();





    }


    public class ItemsAdapter extends ArrayAdapter<String>
    {
        ArrayList<String> planets;
        ArrayList<Integer> image;

        public ItemsAdapter(Context context, ArrayList<String> planets, ArrayList<Integer> image)
        {
            super(context, 0, planets);
            this.planets = planets;
            this.image = image;


        }

        @Override

        public View getView(int position, View convertView, ViewGroup parent)
        {


            if (convertView == null) {

                convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_itemlist, parent, false);
            }

            TextView planet = (TextView) convertView.findViewById(R.id.label);
            ImageView Image = (ImageView) convertView.findViewById(R.id.imageview);
            planet.setText(planets.get(position));
            Image.setImageResource(image.get(position));


            return convertView;
        }
    }
}

