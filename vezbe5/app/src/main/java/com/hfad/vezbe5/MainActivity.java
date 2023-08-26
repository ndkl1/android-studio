package com.hfad.vezbe5;

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

    public void provera(View view){
        EditText br = (EditText) findViewById(R.id.br);
        int broj = Integer.parseInt(br.getText().toString());

        String poruka;
        int delilac=1;
        int zbir=0;

        while (broj>delilac) {
            if (broj % delilac == 0) {
                zbir += delilac;
            } else continue;
            delilac++;
        }

        if(broj==zbir){
            poruka = getString(R.string.savr);
        } else poruka=getString(R.string.nesavr);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, poruka);

        //pravljenje CHOOSER-a, BIRACA
        //napravi poruku koja da se prikaze, pa novu nameru
        String naslov = getString(R.string.dijalog);
        Intent namera = Intent.createChooser(intent, naslov);

        startActivity(namera);
    }
}