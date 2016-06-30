package com.example.ram.fontsize;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.my_text);
        TextView text1 = (TextView) findViewById(R.id.text);
        TextView text2 = (TextView) findViewById(R.id.text1);
        TextView text3 = (TextView) findViewById(R.id.text2);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Archistico_Bold.ttf");
        text.setTypeface(tf);
        text.setText("\t \t\n" +
                "Since you are creating a chat/message application. You should append new typed text to textview and not overwrite what is already present. And remove the semicolon from the end. Put your Button button = (Button)findViewById(R.id.button_send); and all other controls in protected void onCreate(Bundle savedInstanceState) – GunJack Mar 6 '13 at 5:45");

        Typeface tf1 = Typeface.createFromAsset(getAssets(), "fonts/FFF_Tusj.ttf");
        text1.setTypeface(tf1);
        text1.setText("\t \t\n" +
                "Since you are creating a chat/message application. You should append new typed text to textview and not overwrite what is already present. And remove the semicolon from the end. Put your Button button = (Button)findViewById(R.id.button_send); and all other controls in protected void onCreate(Bundle savedInstanceState) – GunJack Mar 6 '13 at 5:45");


        Typeface tf2 = Typeface.createFromAsset(getAssets(), "fonts/Archistico_Simple.ttf");
        text2.setTypeface(tf2);
        text2.setText("\t \t\n" +
                "Since you are creating a chat/message application. You should append new typed text to textview and not overwrite what is already present. And remove the semicolon from the end. Put your Button button = (Button)findViewById(R.id.button_send); and all other controls in protected void onCreate(Bundle savedInstanceState) – GunJack Mar 6 '13 at 5:45");

        Typeface tf3 = Typeface.createFromAsset(getAssets(), "fonts/Windsong.ttf");
        text3.setTypeface(tf3);
        text3.setText("\t \t\n" +
                "Since you are creating a chat/message application. You should append new typed text to textview and not overwrite what is already present. And remove the semicolon from the end. Put your Button button = (Button)findViewById(R.id.button_send); and all other controls in protected void onCreate(Bundle savedInstanceState) – GunJack Mar 6 '13 at 5:45");

    }
}
