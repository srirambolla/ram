package com.example.ram.departmentalstores;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    public static String MyPREFERENCES = "MyPrefs";
    String name;
    String email;
    String password = "";
    String password1 = " ";
    EditText ed1, ed2, ed3, ed4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView tv = (TextView) findViewById(R.id.text1);


        ed1 = (EditText) findViewById(R.id.edit1);

        ed2 = (EditText) findViewById(R.id.edit2);

        ed3 = (EditText) findViewById(R.id.edit3);

        ed4 = (EditText) findViewById(R.id.edit4);


        Button bv = (Button) findViewById(R.id.Button1);

        UserList_Db userList_db = new UserList_Db();
        userList_db.createDefaultLists(this);
    }

    public void onSubmit(View view)

    {
        name = ed1.getText().toString();
        email = ed2.getText().toString();
        password = ed3.getText().toString();
        password1 = ed4.getText().toString();


        if (password.matches(password1)) {
            Intent intent = new Intent(this, LoginActivty.class);

            SharedPreferences sharedPref = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

            SharedPreferences.Editor editor = sharedPref.edit();
            // editor.putInt(getString(R.string.), );


            editor.putString("name", ed1.getText().toString());

            editor.putString("email", ed2.getText().toString());
            editor.putString("password", ed3.getText().toString());

            editor.commit();
            Toast toast = Toast.makeText(this, "Data saved successfully", Toast.LENGTH_LONG);

            startActivity(intent);

        } else {
            Toast toast = Toast.makeText(this, "u have entered wrong password", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
