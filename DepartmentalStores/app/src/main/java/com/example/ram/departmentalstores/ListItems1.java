package com.example.ram.departmentalstores;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListItems1 extends AppCompatActivity {
   // ArrayList<Integer> imageId;
    ArrayList<String> itemNames;
    String categories;

    UserList_Db userList_db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_items1);
       // imageId = new ArrayList<>();
        itemNames = new ArrayList<>();

        Intent intent  =getIntent();
        userList_db = new UserList_Db();
        categories = intent.getStringExtra("category");

        itemNames = userList_db.getSubCategoryInList(this,categories);

        ListView listView = (ListView) findViewById(R.id.listitem1);

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.list_item_layout,R.id.textitem,itemNames);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(ListItems1.this, MainActivityList.class);
                startActivity(intent);
            }
        });


    }
//
//    public class ItemsAdapter extends ArrayAdapter<String> {
//        ArrayList<String> itemNames;
//      //  ArrayList<Integer> imageId;
//
//        public ItemsAdapter(Context context, ArrayList<String> itemNames){//}, ArrayList<Integer> imageId) {
//            super(context, 0, itemNames);
//            this.itemNames = itemNames;
//          //  this.imageId = imageId;
//
//
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//
//
//            if (convertView == null) {
//
//                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
//            }
//
//            TextView planet = (TextView) convertView.findViewById(R.id.textitem);
//          //  ImageView Image = (ImageView) convertView.findViewById(R.id.image2);
//            planet.setText(itemNames.get(position));
//          //  Image.setImageResource(imageId.get(position));
//
//
//            return convertView;
//        }
//    }
}

