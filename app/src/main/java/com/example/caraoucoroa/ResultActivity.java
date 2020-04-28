package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {

    private ImageView imageResultado;
    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imageResultado = findViewById(R.id.moeda);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        //Recuperar os dados passados pela MainActivity
        Bundle dados = getIntent().getExtras(); //Bundle recupera todos os dados enviados juntos. Preciso separá-los em seus tipos depois
        int numero = dados.getInt("numero"); //Key é o name do putExtra da outra Activity

        if(numero == 0){
            imageResultado.setImageResource(R.drawable.moeda_cara);
        }else{
            imageResultado.setImageResource(R.drawable.moeda_coroa);
        }

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(intent); -----> Quando utilizo new Intent as Activities ficam empilhadas, como se várias páginas estivessem abertas

                finish(); //Neste caso quero apenas encerrar a ResultActivity e voltar para a Activity principal, por isso utilizo finish.
            }
        });
    }
}
