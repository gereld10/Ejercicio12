package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText txtnombre,txtapellido,txtedad,txtcorreo;
    Button btnguardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = findViewById(R.id.txtnombre);
        txtapellido = findViewById(R.id.txtapellidos);
        txtedad = findViewById(R.id.txtedad);
        txtcorreo = findViewById(R.id.txtcorreo);
        btnguardar = findViewById(R.id.btnguardar);


        btnguardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),pantalla2.class);
                intent.putExtra("txtnombre", txtnombre.getText().toString());
                intent.putExtra("txtapellido", txtapellido.getText().toString());
                intent.putExtra("txtedad", txtedad.getText().toString());
                intent.putExtra("txtcorreo", txtcorreo.getText().toString());

                startActivity(intent);

            }
        });


    }










}