package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class pantalla2 extends MainActivity {

    EditText txtnombre2,txtapellido2,txtedad2,txtcorreo2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        txtnombre2 = findViewById(R.id.txtnombre2);
        txtapellido2 = findViewById(R.id.txtapellidos2);
        txtedad2 = findViewById(R.id.txtedad2);
        txtcorreo2 = findViewById(R.id.txtcorreo2);

        String txtnombre = getIntent().getStringExtra("txtnombre");
        String txtapellido = getIntent().getStringExtra("txtapellido");
        String txtedad = getIntent().getStringExtra("txtedad");
        String txtcorreo = getIntent().getStringExtra("txtcorreo");


        txtnombre2.setText(txtnombre);
        txtapellido2.setText(txtapellido);
        txtedad2.setText(txtedad);
        txtcorreo2.setText(txtcorreo);


    }
}