package com.example.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Second_activity extends AppCompatActivity {
    private TextView recap;
    private Button btnRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        recap = findViewById(R.id.textRecap);
        btnRetour = findViewById(R.id.btnRetour);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Screen2");


        Intent intent = getIntent();


        String nom     = intent.getStringExtra("name");
        String email   = intent.getStringExtra("mail");
        String phone   = intent.getStringExtra("phone");
        String adresse = intent.getStringExtra("address");
        String ville   = intent.getStringExtra("city");


        String resume = "Nom : " + safe(nom) +
                "\nEmail : " + safe(email) +
                "\nPhone : " + safe(phone) +
                "\nAdresse : " + safe(adresse) +
                "\nVille : " + safe(ville);


        recap.setText(resume);


        btnRetour.setOnClickListener(v -> finish());
    }


    private String safe(String s) {
        return (s == null || s.trim().isEmpty()) ? "—" : s.trim();
    }
}

