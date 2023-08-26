package com.hfad.sept22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ispisrez extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ispisrez);

        Intent namera = getIntent();
        String broj = namera.getStringExtra(Intent.EXTRA_TEXT);
        String duzina = namera.getStringExtra("duzina");
        String suma = namera.getStringExtra("suma");
        TextView tekst =(TextView) findViewById(R.id.tt);
        TextView tekst2=(TextView) findViewById(R.id.tt2);
        TextView tekst3=(TextView) findViewById(R.id.tt3);
         String b = "Broj je ";
         b=b.concat(broj);
         tekst.setText(b);
         tekst2.setText(duzina);
         tekst3.setText(suma);

    }
    public void onZavrsi(){ finish();}
}