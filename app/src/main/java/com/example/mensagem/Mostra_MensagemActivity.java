package com.example.mensagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Mostra_MensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra__mensagem);

        Intent intent = getIntent();
        String mensagem = intent.getStringExtra("MENSAGEM");
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(mensagem);
    }
}
