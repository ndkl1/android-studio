package com.hfad.vezba3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void faktorijel(View view){
        EditText br = (EditText) findViewById(R.id.broj);
        int broj = Integer.parseInt(br.getText().toString());

        int i;
        int fakt=1;

        Intent intent = new Intent(this, ispis.class);

        for (i=1; i<=broj; i++) {
            fakt *= i;
        }
            intent.putExtra(ispis.REZ, String.valueOf(fakt));
            startActivity(intent);
    }
    public void zbirCifara(View view){
        EditText br = (EditText) findViewById(R.id.broj);
        int broj = Integer.parseInt(br.getText().toString());

        int zbC=0;

        Intent intent = new Intent(this, ispis.class);

        while(broj>0) {
            broj = broj % 10;
            zbC += broj;
            broj = broj / 10;
        }
            intent.putExtra(ispis.REZ, String.valueOf(zbC));
            startActivity(intent);
    }
}