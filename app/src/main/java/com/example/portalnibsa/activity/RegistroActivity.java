package com.example.portalnibsa.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.portalnibsa.R;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        TextView txtlogin = (TextView) findViewById(R.id.txtlogin);

        EditText txtnome = (EditText) findViewById(R.id.txtnome);
        EditText txtemail = (EditText) findViewById(R.id.txtemail);
        EditText txtfone = (EditText) findViewById(R.id.txtfone);
        Button btnReg  = (Button) findViewById(R.id.button);

        txtlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistroActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        button.setOnclickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                final String nome = txtnome.getText().toString();
                final String fone = txtfone.getText().toString();
                final String email = txtemail.getText().toString();

                if (email.isEmpty() || nome.isEmpty() || fone.isEmpty()) {
                    Toast.makeText(RegistroActivity.this, "Verifique suas informações e preencha o campo novamente", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}