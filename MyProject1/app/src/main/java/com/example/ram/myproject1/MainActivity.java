package com.example.ram.myproject1;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DrawerLayout drawerLayout;
        ActionBarDrawerToggle toggle;

            drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
            toggle = new ActionBarDrawerToggle(this, drawerLayout,R.string.open, R.string.close)
            {
            };

            toggle.syncState();

        }
        public boolean onOptionsItemSelected(MenuItem item) {
            ActionBarDrawerToggle toggle = null;
            if (toggle.onOptionsItemSelected(item)) {
                return true;
            }
             return super.onOptionsItemSelected(item);
        }
    }

