package com.example.portalnibsa.activity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.portalnibsa.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PrincipalActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        navigationView =(BottomNavigationView) findViewById(R.id.bottom_nav);
        navigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.nav_home:
                Toast.makeText(this, "Home", Toast.LENGTH_LONG).show();
                break;
        }

        switch (item.getItemId()){
            case R.id.nav_notas:
                Toast.makeText(this, "Notas", Toast.LENGTH_SHORT).show();
                break;
        }

        switch (item.getItemId()){
            case R.id.nav_add:
                Toast.makeText(this, "Adicionar", Toast.LENGTH_SHORT).show();
                break;
        }

        switch (item.getItemId()){
            case R.id.nav_aulas:
                Toast.makeText(this, "Aulas", Toast.LENGTH_SHORT).show();
                break;
        }
        switch (item.getItemId()){
            case R.id.nav_provas:
                Toast.makeText(this, "Provas", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}