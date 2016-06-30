package com.sriram.waterexpo;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class SignUpFragment extends Fragment {

    TextView tv;
    ImageView im1, im2;
    EditText et1, et2, et3;
    View view;
    String passwordOne, passwordTwo;
    String mobileNumber;

    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        tv = (TextView) view.findViewById(R.id.text1);
        et1 = (EditText) view.findViewById(R.id.edit1);
        et2 = (EditText) view.findViewById(R.id.edit2);
        et3 = (EditText) view.findViewById(R.id.edit3);
        im1 = (ImageView) view.findViewById(R.id.image1);
        im2 = (ImageView) view.findViewById(R.id.image2);

        Button signUp = (Button) view.findViewById(R.id.signUp);
        signUp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                passwordOne = et2.getText().toString();
                passwordTwo = et3.getText().toString();
                mobileNumber = et1.getText().toString();
                if (((MainActivity) getActivity()).validateSignUp(passwordOne, passwordTwo)) {

                    SendDataToServer sendDataToServer = new SendDataToServer();
                    sendDataToServer.execute();
                }
            }
        });

        return view;
    }

    private class SendDataToServer extends AsyncTask {
        @Override
        protected Object doInBackground(Object[] params) {
            ((MainActivity) getActivity()).sendData(mobileNumber, passwordOne);

            return null;
        }
    }
}