package com.example.ram.myproject1;

import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
//
//        DrawerLayout drawerLayout;
//       ActionBarDrawerToggle toggle;
////
//        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
//        getSupportActionBar().setHomeButtonEnabled(true);
//        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close) {
//        };
//
//        toggle.syncState();
//
   }

    public boolean onOptionsItemSelected(MenuItem item) {
        ActionBarDrawerToggle toggle = null;
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

