package com.example.teladeloginjava;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText usuario ;
    private EditText senha ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botao = findViewById(R.id.button4);
         usuario= findViewById(R.id.editTextTextPersonName);
         senha = findViewById(R.id.editTextTextPersonName3);
         botao.setOnClickListener(OnClickLogar());


    }

    private View.OnClickListener OnClickLogar(){
        return view -> {
            if ("admin".equals(usuario.getText().toString()) && "admin".equals(senha.getText().toString())){
                //para a tela2
                //instanciando a classe intente que será reponsável por navegar entre telas, passando como parâmetro o contexto e a proxima activity.class
                Intent intent = new Intent(MainActivity.this,tela2.class);
                startActivity(intent);

            }else{
                alerta();

            }


        };
    }
    private  void alerta(){
        Toast.makeText(this, "usuário ou senha inválidos!!!", Toast.LENGTH_SHORT).show();
    }

}