package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonJogar = findViewById(R.id.botaoJogar);

        buttonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent é utilizada para "unir" as diferentes Activities. É passado o contexto geral e a classe da Activity que se quer chamar.
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);

                //Passar dados para outra Activity
                int numero = new Random().nextInt(2); //Gerar número randômico
                intent.putExtra("numero", numero); //putExtra passa os dados para a ResultActivity

                startActivity(intent);
            }
        });
    }
}
