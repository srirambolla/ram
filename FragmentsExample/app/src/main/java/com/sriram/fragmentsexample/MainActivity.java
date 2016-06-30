package com.sriram.fragmentsexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BlankFragment blankFragment = new BlankFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, blankFragment).commit();
    }

   public void loadOther(View v){
       BlankFragment2 blankFragment = new BlankFragment2();
       getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, blankFragment).commit();
   }
}
