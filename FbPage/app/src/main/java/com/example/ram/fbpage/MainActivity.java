package com.example.ram.fbpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void login(View view)
    {
        TextView login=(TextView)findViewById(R.id.login_details);
        TextView name=(TextView)findViewById(R.id.name);
        TextView pass=(TextView)findViewById(R.id.password);
        TextView forg=(TextView)findViewById(R.id.forgot);
        EditText user=(EditText)findViewById(R.id.editText1 );
        EditText paword=(EditText)findViewById(R.id.editText2);

        Button button=(Button)findViewById(R.id.button1);

        String string1=user.getText().toString();
        String string2=paword.getText().toString();
        if(name.getText().toString().equals("admin") && pass.getText().toString().equals("admin")){

            Toast()
        }else{


    }
    }

