package com.vsatyarc.watertin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView tv1;
    ImageView image1,image2;

    String username,password;
    Button Buttonl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.user1);
        et2=(EditText)findViewById(R.id.pass1);
        tv1=(TextView)findViewById(R.id.text1);
        image1=(ImageView)findViewById(R.id.imageW1);
        image2=(ImageView)findViewById(R.id.imagew2);


    }
    public  void login(View view)
    {
        String username ="";
        String password="" ;

        if (username.matches(String.valueOf(et1)) && password.matches(String.valueOf(et2)))
        {

            Toast.makeText(this, "login sucess", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(this, Main2Activity.class);
            startActivity(intent);

        } else {
            Toast.makeText(this, "please enter valid user name and password", Toast.LENGTH_LONG).show();
        }
    }
}


