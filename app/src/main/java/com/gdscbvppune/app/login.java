package com.gdscbvppune.app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;


public class login extends Fragment {

    private TextView Signup , ForgotPassword;
    EditText et_loginEmail , et_loginpss;
    Button btnLogin;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.frag_login, container, false);

        et_loginEmail =v.findViewById(R.id.et_loginEmail);
        et_loginpss =v.findViewById(R.id.et_loginPss);
        btnLogin =v.findViewById(R.id.btnLogin);
        Signup = v.findViewById(R.id.txt_signup);
        ForgotPassword =v.findViewById(R.id.txt_forgotPss);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_loginEmail.getText().toString().isEmpty()) {
                    et_loginEmail.setError("Enter a valid Email Address");
                    et_loginEmail.requestFocus();
                }
                if (et_loginpss.getText().toString().isEmpty()){
                    et_loginpss.setError("Password is required");
                    et_loginpss.requestFocus();
                }


            }
        });

        return  v;
    }
}