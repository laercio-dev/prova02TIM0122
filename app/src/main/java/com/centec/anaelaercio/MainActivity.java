package com.centec.anaelaercio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etPeso, etAltura;
    TextView tvResultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPeso = findViewById(R.id.etPeso);
        etAltura = findViewById(R.id.etAltura);
        tvResultado = findViewById(R.id.tvResultado);
    }
    public void calcular(View view){
        Double peso = Double.parseDouble(etPeso.getText().toString());
        Double altura = Double.parseDouble(etAltura.getText().toString());

        Double resultado = peso/(altura*altura);

        if (resultado<18.5){
            tvResultado.setText("Abaixo do peso normal");
        } else if (resultado>=18.5&&resultado<=24.9){
            tvResultado.setText("Peso Normal");
        } else if (resultado>=25&&resultado<=29.9){
            tvResultado.setText("Excesso de peso");
        } else if (resultado>=30&&resultado<=34.9){
            tvResultado.setText("Obesidade classe I");
        } else if (resultado>=35&&resultado<=39.9){
            tvResultado.setText("Obesidade classe II");
        } else if (resultado>=40){
            tvResultado.setText("Obesidade classe III");
        }
    }
}