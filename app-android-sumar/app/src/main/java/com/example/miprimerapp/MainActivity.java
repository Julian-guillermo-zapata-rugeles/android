package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.suma1);
        et2 = (EditText)findViewById(R.id.suma2);
        tv1 = (TextView)findViewById(R.id.resultado);
    }

    // este metodo realiza la suma
    public void  Sumar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        if(valor1.matches("") || valor2.matches("")){
            Toast.makeText(this, "Ups! faltan valores en algún campo", Toast.LENGTH_SHORT).show();
        }
        else{
            int numero1= Integer.parseInt(valor1);
            int numero2= Integer.parseInt(valor2);
            int suma=numero1+numero2;
            String resultado =String.valueOf(suma);
            tv1.setText(resultado);
        }

    }

    public void BackMenu(View view){
        tv1.setText("Resultado");
        et1.setText("");
        et2.setText("");

    }
}