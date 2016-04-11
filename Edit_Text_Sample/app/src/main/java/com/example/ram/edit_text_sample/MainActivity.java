package com.example.ram.edit_text_sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  //  public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void displayDetails(View view)
{
    TextView displaydetails=(TextView)findViewById(R.id.display_details);
    TextView view1=(TextView)findViewById(R.id.name);
    TextView view2=(TextView)findViewById(R.id.email);
    TextView view3=(TextView)findViewById(R.id.mobile);
    EditText view4=(EditText)findViewById(R.id.enter_your_name);
    EditText view5=(EditText)findViewById(R.id.enter_mobile);
    EditText view6=(EditText)findViewById(R.id.enter_email);
    Button button=(Button)findViewById(R.id.submit);

    String string1=view4.getText().toString();
    String string2=view5.getText().toString();
    String string3=view6.getText().toString();

    if(android.util.Patterns.PHONE.matcher(string2).matches()==true)

    {
        if (android.util.Patterns.EMAIL_ADDRESS.matcher(string3).matches() == true)

        {

            displaydetails.setText(string1 + "\n" + string2 + "\n" + string3);
            String ram = (string1 + "\n" + string2 + "\n" + string3);
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("String", ram);
            intent.putExtra("enter_your_name", string1);
            intent.putExtra("enter_mobile", string2);
            intent.putExtra("enter_email", string3);

            //intent.putExtra(EXTRA_MESSAGE, string1);


            //Create a bundle object
            // Bundle b = new Bundle();

            //intent.putExtras(b);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"enter correct email",Toast.LENGTH_LONG).show();
        }
    }
        else
        {
            Toast.makeText(this,"enter correct number",Toast.LENGTH_LONG).show();

        }
    }
}


