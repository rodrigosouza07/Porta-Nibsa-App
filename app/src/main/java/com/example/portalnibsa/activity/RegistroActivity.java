package com.example.portalnibsa.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.portalnibsa.R;

public class RegistroActivity extends AppCompatActivity {

     Button btReg;
     TextView txtnome, txtemail, txtfone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        TextView txtlogin = (TextView) findViewById(R.id.txtlogin);

         txtnome = findViewById(R.id.txtnome);
         txtemail =  findViewById(R.id.txtemail);
         txtfone = findViewById(R.id.txtfone);
         btReg  =  findViewById(R.id.button);

        btReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistroActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}