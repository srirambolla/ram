package com.example.ram.departmentalstores;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity3 extends AppCompatActivity {

    UserList_Db user;
    String categoryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        user = new UserList_Db();
        final ArrayList<String> categoryList;
        categoryList = user.getCategoryInList(this);

      /*  categoryList.add("stapels");
        categoryList.add("Frozen meat");
        categoryList.add("fruits");
        categoryList.add("Bevarages");
        categoryList.add("Branded Foods");
        categoryList.add("House Holds");
        categoryList.add("Personal Care");
        categoryList.add("Bread&Egg");
        categoryList.add("Yummy Foods");
        categoryList.add("veggie&Fruits");
        categoryList.add("Best Offers");
*/


        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.category_list_item, R.id.text1, categoryList);

        ListView listView = (ListView) findViewById(R.id.list1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(ListActivity3.this,ListItems1.class);
                intent.putExtra("category",categoryList.get(position));
                startActivity(intent);
            }
        });
    }
}