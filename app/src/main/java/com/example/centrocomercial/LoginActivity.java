package com.example.centrocomercial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText edtxtEmail;
    private EditText edtxtPass;
    private Button btnLogin;
    private TextView txtSignin;

    private String email;
    private String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtxtEmail = findViewById(R.id.edtxt_email);
        edtxtPass = findViewById(R.id.edtxt_pass);
        btnLogin = findViewById(R.id.btn_login);
        txtSignin = findViewById(R.id.txt_signin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bundle bndle = getIntent().getExtras();
                email = bndle.getString("email");
                pass = bndle.getString("pass");

                if (edtxtEmail.getText().toString().equals(email) && edtxtPass.getText().toString().equals(pass)) {
                    Intent goToMain = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(goToMain);
                } else {
                    Toast.makeText(LoginActivity.this, "No existe el usuario no mames", Toast.LENGTH_SHORT).show();
                }
            }
        });


        txtSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent goToSignin = new Intent(LoginActivity.this, SigninActivity.class);
                startActivity(goToSignin);


            }
        });

    }
}
