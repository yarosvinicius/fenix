package com.example.projetofenix;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;


    Cadastrar cadastrar = new Cadastrar();
    Carinho carinho = new Carinho();
    Login login = new Login();
    Inicial inicial = new Inicial();
    Parcerias parceiras = new Parcerias();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.idBottomNavView);

        getSupportFragmentManager().beginTransaction().
                replace(R.id.frmContainer, inicial).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                switch (item.getItemId()) {
                    case R.id.In:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, inicial).commit();
                        return true;
                    case R.id.mL:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, login).commit();
                        return true;
                    case R.id.mCa:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, carinho).commit();
                        return true;
                    case R.id.mC:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, cadastrar).commit();
                        return true;
                    case R.id.mP:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, parceiras).commit();
                        return true;
                }
                return false;
            }
        });
    }
}

