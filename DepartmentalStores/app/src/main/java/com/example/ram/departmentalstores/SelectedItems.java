package com.example.ram.departmentalstores;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SelectedItems extends AppCompatActivity {

    ArrayList<String> selectedItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_items);
        TextView selected=(TextView) findViewById(R.id.selected);
        Intent intent=getIntent();
        selectedItems=intent.getStringArrayListExtra("selectedItems");
        selected.setText(selectedItems.toString());
    }
}
