package com.example.ram.creatinglist;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ItemFragment extends Fragment {

 //  ArrayList<String> itemName;
//    ArrayList<String> itemName;
//    ArrayList<String> itemName;

    public ItemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<Integer> list = new ArrayList<>();
      //  ArrayList<Integer> discounts = new ArrayList<>();

       // ArrayList<String> shirts = new ArrayList<>();
        //ArrayList<Integer> images = new ArrayList<>();

        list.add(unknownList);
      //  discounts.add(10);
        list.add(knownList);
       // discounts.add(45);
        //prices.add(300);
        //discounts.add(15);
        list.add(simpleList);

       // discounts.add(20);
        list.add(toughList);
      //  discounts.add(25);
        //prices.add(600);
        //discounts.add(30);
        //prices.add(700);
        //discounts.add(35);
        //prices.add(800);
        //discounts.add(40);
        //prices.add(900);
        //discounts.add(50);
        //prices.add(1000);
        //discounts.add(55);

        shirts.add("shirt 1");
        shirts.add("shirt 2");
        shirts.add("shirt 3");
        shirts.add("shirt 4");
        shirts.add("shirt 5");
        shirts.add("shirt 6");
        shirts.add("shirt 7");
        shirts.add("shirt 8");
        shirts.add("shirt 9");
        shirts.add("shirt 10");

        images.add(R.drawable.a);
        images.add(R.drawable.b);
        images.add(R.drawable.c);
        images.add(R.drawable.d);
        images.add(R.drawable.e);
        images.add(R.drawable.f);
        images.add(R.drawable.g);
        images.add(R.drawable.h);
        images.add(R.drawable.i);
        images.add(R.drawable.j);
        View view = inflater.inflate(R.layout.fragment_item, container, false);

        ListView listView = (ListView) view.findViewById(R.id.list_view);
        ItemsAdapter adapter = new ItemsAdapter(getActivity(), shirts, images, prices, discounts);
        listView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getActivity().getMenuInflater().inflate(R.menu.item_pop_up_menu, menu);
    }


//    @Override
//    public boolean onContextItemSelected(MenuItem item) {
//
//        AdapterView.AdapterContextMenuInfo items = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
//        switch (item.getItemId()) {
//            case R.id.add_to_cart:
//                items.
//        }
//
//    }

    public class ItemsAdapter extends ArrayAdapter<String> {

        ArrayList<String> shirtNames;
        ArrayList<Integer> imageIds;
        ArrayList<Integer> prices;
        ArrayList<Integer> discounts;

        public ItemsAdapter(Context context, ArrayList<String> shirtNames, ArrayList<Integer> imageIds, ArrayList<Integer> prices, ArrayList<Integer> discounts) {
            super(context, 0, shirtNames);
            this.imageIds = imageIds;
            this.shirtNames = shirtNames;
            this.prices = prices;
            this.discounts = discounts;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
            }
            int positionLeft = position;
            int positionRight = 9 - position;

            TextView discountLeft = (TextView) convertView.findViewById(R.id.discount_left);
            TextView priceLeft = (TextView) convertView.findViewById(R.id.price_left);
            TextView priceRight = (TextView) convertView.findViewById(R.id.price_right);
            TextView discountRight = (TextView) convertView.findViewById(R.id.discount_right);
            ImageButton buttonLeft = (ImageButton) convertView.findViewById(R.id.popUpMenuRight);
            ImageButton imgLeft = (ImageButton) convertView.findViewById(R.id.item_for_img_left);
            ImageButton imgRight = (ImageButton) convertView.findViewById(R.id.item_for_img_right);
            ImageButton buttonRight = (ImageButton) convertView.findViewById(R.id.popUpMenuLeft);
            TextView leftProductDetail = (TextView) convertView.findViewById(R.id.product_details_left);
            TextView rightProductDetail = (TextView) convertView.findViewById(R.id.product_details_right);


            registerForContextMenu(imgLeft);
            registerForContextMenu(imgRight);


            leftProductDetail.setText(shirtNames.get(positionLeft));
            imgLeft.setImageResource(imageIds.get(positionLeft));
            priceLeft.setText("Price: " + prices.get(positionLeft));
            discountLeft.setText("Discount: " + discounts.get(positionLeft));
            buttonLeft.setImageResource(R.drawable.menu);

            rightProductDetail.setText(shirtNames.get(positionRight));
            imgRight.setImageResource(imageIds.get(positionRight));
            priceRight.setText("Price: " + prices.get(positionRight));
            discountRight.setText("Discount: " + discounts.get(positionRight));
            buttonRight.setImageResource(R.drawable.menu);
            return convertView;
        }
    }
}


//        ImageButton imageButton = (ImageButton) view.findViewById(R.id.item_for_img_left);
//        imageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ((MainActivity) getActivity()).showPopup(v);
//                Toast.makeText(getActivity(), "Clicked fragment", Toast.LENGTH_LONG).show();
//
//            }
//        });

// ||view.getId()== R.id.popUpMenuRight ||view.getId()== R.id.item_for_img_left||view.getId()==R.id.item_for_img_right){