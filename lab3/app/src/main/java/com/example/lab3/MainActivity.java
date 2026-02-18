package com.example.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private EditText nom, email, phone, adresse, ville;
    private Button btnEnvoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nom     = findViewById(R.id.textNom);
        email   = findViewById(R.id.textEmail);
        phone   = findViewById(R.id.textPhone);
        adresse = findViewById(R.id.textAdresse);
        ville   = findViewById(R.id.textVille);
        btnEnvoyer = findViewById(R.id.btnEnvoyer);


        btnEnvoyer.setOnClickListener(v -> {

            String Nom     = nom.getText().toString().trim();
            String Email   = email.getText().toString().trim();
            String Phone   = phone.getText().toString().trim();
            String Adresse = adresse.getText().toString().trim();
            String Ville   = ville.getText().toString().trim();

             if (Nom.isEmpty() || Email.isEmpty()) {
                Toast.makeText(this, "Nom et Email sont obligatoires.", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent i = new Intent(MainActivity.this, Second_activity.class);

             i.putExtra("name", Nom);
            i.putExtra("mail", Email);
            i.putExtra("phone", Phone);
            i.putExtra("address", Adresse);
            i.putExtra("city", Ville);

             startActivity(i);
        });
    }
}