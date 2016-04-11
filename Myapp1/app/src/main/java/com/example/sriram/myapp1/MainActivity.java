package com.example.sriram.myapp1;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};
        ArrayList<String> planetList = new ArrayList<String>();
        planetList.addAll(Arrays.asList(planets));
        mainListView = (ListView) findViewById( R.id.mainListView );
        DrawerLayout drawerLayout=(DrawerLayout)findViewById(R.id.right_slidermenu);
        listAdapter = new ArrayAdapter<String>(this, R.layout.reslay, planetList);

        listAdapter.add( "Ceres" );
        listAdapter.add( "Pluto" );
        listAdapter.add( "Haumea" );
        listAdapter.add( "Makemake" );
        listAdapter.add( "Eris" );


        mainListView.setAdapter( listAdapter );
    }


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout, R.string.open, R.string.close) {


        };

    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (toggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item)

    }
}


