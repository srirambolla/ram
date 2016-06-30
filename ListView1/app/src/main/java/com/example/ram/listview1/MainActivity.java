package com.example.ram.listview1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> prices = new ArrayList<>();
        ArrayList<Integer> imageId = new ArrayList<>();


        prices.add("knowlist");
        imageId.add(R.drawable.s1);
        imageId.add(R.drawable.r2);
        imageId.add(R.drawable.i3);
        imageId.add(R.drawable.r4);
        imageId.add(R.drawable.a5);
        imageId.add(R.drawable.m6);
        imageId.add(R.drawable.r7);
        imageId.add(R.drawable.u8);
        imageId.add(R.drawable.d9);
        imageId.add(R.drawable.v10);
     //   imageId.add(R.drawable.v11);

        prices.add("tough list");
        prices.add("unknown list");
        prices.add("second list");
        prices.add("third list");
        prices.add("fourth list");
        prices.add("fifth list");
        prices.add("sixth list");
        prices.add("seventh list");
        prices.add("eight list");





        ListView listView = (ListView) findViewById(R.id.list);
        ItemsAdapter adapter = new ItemsAdapter(this, prices, imageId);
        listview.setAdapter(adapter);

    }




    public class ItemsAdapter extends ArrayAdapter<String> {


        ArrayList<String> prices;
        ArrayList<Integer> imageId;

        public ItemsAdapter(Context context, ArrayList<String> prices, ArrayList<Integer> imageId) {
            super(context, 0, prices);

            this.prices = prices;
            this.imageId = imageId;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
            }


            TextView price = (TextView) convertView.findViewById(R.id.discount);
            ImageView ImageId = (ImageView) convertView.findViewById(R.id.image);
            price.setText(prices.get(position));
            ImageId.setImageResource(imageId.get(position));


            return convertView;
        }
    }
}
