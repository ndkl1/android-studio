package com.hfad.vezbe5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ispis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ispis);

        TextView rez = (TextView) findViewById(R.id.rez);
        Intent intent = getIntent();
        String poruka = intent.getStringExtra(Intent.EXTRA_TEXT);
        rez.setText(poruka);
    }
    public void okej(View view){
        finish();
    }
}