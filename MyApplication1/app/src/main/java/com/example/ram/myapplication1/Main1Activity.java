package com.example.ram.myapplication1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main1Activity extends AppCompatActivity {


    private ToggleButton toggleButton, toggleButton1;
            private Button submit;

            @Override
            public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main1);

                addListenerOnButton();

            }
    public void addListenerOnButton() {

                toggleButton = (ToggleButton) findViewById(R.id.toggle_button);
                toggleButton1 = (ToggleButton) findViewById(R.id.toggle_button1);
                submit = (Button) findViewById(R.id.toogle_submit);

                submit.setOnClickListener(new OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        StringBuffer result = new StringBuffer();
                        result.append("toggle_button : ").append(toggleButton.getText());
                        result.append("\ntoggle_button1 : ").append(toggleButton1.getText());

                        Toast.makeText(Main1Activity.this, result.toString(),
                                Toast.LENGTH_SHORT).show();

                    }

                });

            }
    }

