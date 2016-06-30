package com.sriram.waterexpo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class MainActivity extends AppCompatActivity {

    String output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.container) != null) {
            if (savedInstanceState != null) {
                return;
            }
            HomeFragment homeFragment = new HomeFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.container, homeFragment).commit();

        }


    }

    public void loadSignUp(View view) {
        SignUpFragment signUpFragment = new SignUpFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, signUpFragment).commit();

    }

    public void login(View view) {
        LoginFragment loginFragment = new LoginFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, loginFragment).commit();

    }


    public boolean validateSignUp(String passwordOne, String passwordTwo) {
        boolean passwordsMatched = false;
        if (passwordOne.matches(passwordTwo)) {
            passwordsMatched = true;
        } else {
            Toast.makeText(this, "Passwords did not match", Toast.LENGTH_SHORT).show();
        }
        return passwordsMatched;
    }

    public boolean sendData(String mobileNumber, String password) {
        boolean isSucces = false;
        JSONObject object = new JSONObject();

        try {
            object.accumulate("password", password);

            object.accumulate("Mobile Number", mobileNumber);

        } catch (JSONException e) {
            e.printStackTrace();
        }


        // http://localhost:8080/RESTfulExample/json/product/post

        try {

            URL url = new URL("http://192.168.2.102:8080/Sample/rest/login");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            String input = object.toString();
            //String input = "{\"qty\":100,\"name\":\"iPad 4\"}";

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
                isSucces = true;
            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
        return isSucces;
    }

    public void setMessage() {
        Toast.makeText(this, output, Toast.LENGTH_LONG).show();
    }

}
