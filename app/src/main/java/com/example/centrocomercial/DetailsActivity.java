package com.example.centrocomercial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private Button btnSuma;
    private Button btnResta;
    private TextView txtData;
    private  int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        btnSuma = findViewById(R.id.btn_suma);
        btnResta = findViewById(R.id.btn_resta);
        txtData = findViewById(R.id.txt_number);


        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador  += 1;
                txtData.setText(String.valueOf(contador));
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador  -= 1;
                txtData.setText(String.valueOf(contador));
            }
        });
    }
}
