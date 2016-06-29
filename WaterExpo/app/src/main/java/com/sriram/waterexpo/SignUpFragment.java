package com.sriram.waterexpo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class SignUpFragment extends Fragment {

    TextView tv;
    ImageView im1,im2;
    EditText et1,et2,et3;
    View view;

    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view =  inflater.inflate(R.layout.fragment_sign_up, container, false);
        tv = (TextView)view.findViewById(R.id.text1);
        et1=(EditText)view.findViewById(R.id.edit1);
        et2=(EditText)view.findViewById(R.id.edit2);
        et3=(EditText)view.findViewById(R.id.edit3);
        im1=(ImageView)view.findViewById(R.id.image1);
        im1=(ImageView)view.findViewById(R.id.image2);

        return view;
    }




}
