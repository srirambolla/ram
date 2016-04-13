package com.example.ram.listview1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> prices = new ArrayList<>();
        ArrayList<String> discounts = new ArrayList<>();


        prices.add("knowlist");
        discounts.add("simplelist");

        prices.add("tough list");
        discounts.add("empty  list");
        prices.add("unknown list");
        discounts.add("costly list");
        prices.add("second list");
        discounts.add("free list");
        prices.add("third list");
        discounts.add("sample list");
        prices.add("fourth list");
        discounts.add("imp list");
        prices.add("fifth list");
        discounts.add("unimp list");
        prices.add("sixth list");
        discounts.add("my list");
        prices.add("seventh list");
        discounts.add("your list");
        prices.add("eight list");
        discounts.add("his list");

        prices.add("knowlist");
        discounts.add("simplelist");

        prices.add("tough list");
        discounts.add("empty  list");
        prices.add("unknown list");
        discounts.add("costly list");
        prices.add("second list");
        discounts.add("free list");
        prices.add("third list");
        discounts.add("sample list");
        prices.add("fourth list");
        discounts.add("imp list");
        prices.add("fifth list");
        discounts.add("unimp list");
        prices.add("sixth list");
        discounts.add("my list");
        prices.add("seventh list");
        discounts.add("your list");
        prices.add("eight list");
        discounts.add("his list");


        ListView listView = (ListView) findViewById(R.id.list);
        ItemsAdapter adapter = new ItemsAdapter(this, prices, discounts);
        listView.setAdapter(adapter);

    }




    public class ItemsAdapter extends ArrayAdapter<String> {


        ArrayList<String> prices;
        ArrayList<String> discounts;

        public ItemsAdapter(Context context, ArrayList<String> prices, ArrayList<String> discounts) {
            super(context, 0, prices);

            this.prices = prices;
            this.discounts = discounts;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
            }


            TextView price = (TextView) convertView.findViewById(R.id.prices);
            TextView discount = (TextView) convertView.findViewById(R.id.discount);
            price.setText(prices.get(position));
            discount.setText(discounts.get(position));


            return convertView;
        }
    }
}
