package com.exemplo.exemplopopup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewMensagem = findViewById(R.id.textViewMensagem);
    }

    public void onClickBotaoDialogo1(View v) {
        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
        dialogo.setTitle("Título");
        dialogo.setMessage("Mensagem do diálogo");
        dialogo.setPositiveButton("Ok",null);
        dialogo.show();
    }

    public void onClickBotaoDialogo2(View v) {

        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
        dialogo.setTitle("Título");
        dialogo.setMessage("Selecione um botão");
        dialogo.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                textViewMensagem.setText("Botão OK selecionado");
            }
        });
        dialogo.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                textViewMensagem.setText("Botão Cancelar selecionado");
            }
        });
        dialogo.show();
    }

    public void onClickBotaoToast(View v) {
        Toast.makeText(this, "Botão foi clicado", Toast.LENGTH_SHORT).show();
    }

    public void onClickBotaoFechar(View v) {
        System.exit(0);
    }
}

