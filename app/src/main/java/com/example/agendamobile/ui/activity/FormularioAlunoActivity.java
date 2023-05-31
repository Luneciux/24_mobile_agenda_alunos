package com.example.agendamobile.ui.activity;

import static com.example.agendamobile.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.agendamobile.R;
import com.example.agendamobile.dao.AlunoDAO;
import com.example.agendamobile.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_formulario_aluno);

        setTitle("Novo Aluno");

        final AlunoDAO dao = new AlunoDAO();

        EditText alunoNome = findViewById(id.activity_formulario_aluno_nome);
        EditText alunoEmail = findViewById(id.activity_formulario_aluno_email);
        EditText alunoTelefone = findViewById(id.activity_formulario_aluno_telefone);
        Button botaoSalvar = findViewById(id.activity_formulario_aluno_botao_salvar);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String nome = alunoNome.getText().toString();
                String email = alunoEmail.getText().toString();
                String telefone = alunoTelefone.getText().toString();

                Aluno aluno = new Aluno(nome, email, telefone);
                dao.salva(aluno);
                finish();
            }
        });
    }
}