package com.hfad.vezbe4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ispis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ispis);

        Intent intent = getIntent();
        String rezz = intent.getStringExtra(Intent.EXTRA_TEXT);
        TextView prikaz = (TextView) findViewById(R.id.rez);
        prikaz.setText(rezz);
    }
    // klikom na dugme „Nazad“
    // završi njen rad i komanda vrati prethodnoj glavnoj aktivnosti.
    public void nazad(View view){
        finish();
    }
}