package com.example.ram.edit_text_sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent=getIntent();

      String value = intent.getStringExtra("String");
      //  String value = intentintent.getStringExtra("enter_your_name");
        //String value1 =intent.getStringExtra("enter_mobile");
       // String value2= intent.getStringExtra("enter_email");

        String output  = value;//+value1+value2;
        TextView tv=(TextView)findViewById(R.id.display);

         tv.setText(output);
    }
    }


