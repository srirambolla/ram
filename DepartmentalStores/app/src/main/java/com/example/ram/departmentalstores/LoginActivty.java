package com.example.ram.departmentalstores;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivty extends AppCompatActivity {
    EditText et, et1;
    String namePref, passPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activty);
         et = (EditText) findViewById(R.id.logedit1);
         et1 = (EditText) findViewById(R.id.logedit2);


        SharedPreferences sharedPref = getSharedPreferences(Signup.MyPREFERENCES, Context.MODE_PRIVATE);
        sharedPref.getString("email", "srirambolla@gmail");
        sharedPref.getString("password1", "sriram7161");
        namePref = sharedPref.getString("name", "sriram");
        passPref = sharedPref.getString("password", "sriram7161");

    }

    public void onLogin(View view) {
        String name1 = et.getText().toString();
        String pass1 = et1.getText().toString();


        if (name1.matches(namePref) && pass1.matches(passPref))
        {

             Toast.makeText(this, "login sucess", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(this, ListActivity3.class);
            startActivity(intent);

        } else {
             Toast.makeText(this, "please enter valid user name and password", Toast.LENGTH_LONG).show();
        }
    }
}