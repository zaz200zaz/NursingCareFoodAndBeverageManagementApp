package com.example.nursingcarefoodandbeveragemanagementapp;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputEmail;
    EditText inputPassword;

    Button btnLogin;

    TextView frogotPassword;
    TextView gotoRegister;

    ImageView googleLogin;
    ImageView facebookLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        loginCheck();
        loginHandl(inputEmail.getText().toString().trim(),inputPassword.getText().toString().trim());
    }

    private void loginCheck() {

    }

    private void loginHandl(String email, String password) {
        if (!email.isEmpty() && !password.isEmpty()){

        }
    }

    private void anhXa() {
        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPasswords);
        btnLogin = findViewById(R.id.btnLogin);
        frogotPassword = findViewById(R.id.frogotPassword);
        googleLogin = findViewById(R.id.googleLogin);
        facebookLogin = findViewById(R.id.facebookLogin);
        gotoRegister = findViewById(R.id.gotoRegister);
    }
}