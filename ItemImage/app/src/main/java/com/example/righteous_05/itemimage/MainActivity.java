package com.example.righteous_05.itemimage;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        ItemFragment fragment = new ItemFragment();
        transaction.add(R.id.container,fragment);
        transaction.commit();

    }
    public void showPopup(View view) {
        PopupMenu popup = new PopupMenu(this,view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.item_pop_up_menu, popup.getMenu());
        popup.show();
        Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show();
    }
}
