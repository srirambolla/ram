package com.vsatyarc.watertin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


            TextView tv;
            ImageView im;
            Button bv1;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main2);
                tv=(TextView)findViewById(R.id.text1);
                im=(ImageView)findViewById(R.id.image1);
                bv1=(Button)findViewById(R.id.Button1);
            }
            public void bookNow(View view)
            {
                bv1=(Button)findViewById(R.id.Button1);
                bv1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent();
                    }
                });
            }
        }


