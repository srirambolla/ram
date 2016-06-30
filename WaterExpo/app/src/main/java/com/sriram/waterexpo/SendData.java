//package com.sriram.waterexpo;
//
//import android.widget.Toast;
//
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//
///**
// * Created by ram on 30/6/16.
// */
//public class SendData {
//    public boolean sendData(String mobileNumber, String password) {
//        boolean isSucces = false;
//        JSONObject object = new JSONObject();
//
//        try {
//            object.accumulate("Mobile Number", mobileNumber);
//            object.accumulate("password", password);
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//
//        // http://localhost:8080/RESTfulExample/json/product/post
//
//        try {
//
//            URL url = new URL("http://192.168.2.102:8080/Sample/rest/login");
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setDoOutput(true);
//            conn.setRequestMethod("POST");
//            conn.setRequestProperty("Content-Type", "application/json");
//
//            String input = object.toString();
//            //String input = "{\"qty\":100,\"name\":\"iPad 4\"}";
//
//            OutputStream os = conn.getOutputStream();
//            os.write(input.getBytes());
//            os.flush();
//
//            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
//                throw new RuntimeException("Failed : HTTP error code : "
//                        + conn.getResponseCode());
//            }
//
//            BufferedReader br = new BufferedReader(new InputStreamReader(
//                    (conn.getInputStream())));
//
//            System.out.println("Output from Server .... \n");
//            while ((output = br.readLine()) != null) {
//                System.out.println(output);
//                isSucces = true;
//            }
//
//            conn.disconnect();
//
//        } catch (MalformedURLException e) {
//
//            e.printStackTrace();
//
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//        }
//        return isSucces;
//    }
//
//    public void setMessage() {
//        Toast.makeText(this, output, Toast.LENGTH_LONG).show();
//    }
//
//}

