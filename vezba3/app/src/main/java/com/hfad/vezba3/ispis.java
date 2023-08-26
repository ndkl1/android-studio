package com.hfad.vezba3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ispis extends AppCompatActivity {

    public static final String REZ = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ispis);

        Intent intent = getIntent();
        String poruka = intent.getStringExtra(REZ);

        TextView prikaz = (TextView) findViewById(R.id.rez);
        prikaz.setText(poruka);
    }
}