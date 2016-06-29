package com.sriram.waterexpo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.container)!=null)
        {
            if (savedInstanceState != null) {
                return;
            }
            SignUpFragment signUpFragment = new SignUpFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.container, signUpFragment).commit();

        }


    }

}