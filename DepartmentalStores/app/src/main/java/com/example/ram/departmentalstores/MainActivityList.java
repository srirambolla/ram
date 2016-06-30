package com.example.ram.departmentalstores;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivityList extends AppCompatActivity {
    ArrayList items,selectedItems;
    ListView listitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_list);
        items = new ArrayList();
        selectedItems = new ArrayList();
        items.add("dall");
        items.add("rice");
        items.add("drinks");
        items.add("tablets");
        items.add("beer");


        listitem = (ListView) findViewById(R.id.item_list);

        final ItemsAdapter adapter = new ItemsAdapter(this, items);
        listitem.setAdapter(adapter);
        Button onCheckout = (Button)findViewById(R.id.checkout);
        onCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedItems = adapter.getFinalSelection();
                Intent intent=new Intent(MainActivityList.this,SelectedItems.class);
                intent.putStringArrayListExtra("selectedItems",selectedItems);
                startActivity(intent);
            }
        });
    }

//
//    public void showPopup(View v) {
//        PopupMenu popup = new PopupMenu(this, v);
//        MenuInflater inflater = popup.getMenuInflater();
//        inflater.inflate(R.menu.item_popup_menu, popup.getMenu());
//        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                                             @Override
//                                             public boolean onMenuItemClick(MenuItem item) {
//                                                 switch (item.getItemId()) {
//                                                     case R.id.adding:
//                                                         return true;
//                                                     default:
//                                                         return true;
//                                                 }
//                                             }
//                                         }
//
//        );
//        popup.show();
//    }
//
//

}


