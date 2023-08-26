package com.hfad.sept22;

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
    public void onObrni(View view){
        EditText br = (EditText) findViewById(R.id.editTextNumberSigned);
        int broj = Integer.parseInt(br.getText().toString());
        int brrr=broj;
        int suma = 0;
        int a;
        int brojac = 0;

        while(broj>0){
             a = broj % 10 ;
             suma = suma*10 + a;
             broj = broj/10;
             brojac++;
        }


        Intent namera = new Intent(Intent.ACTION_SEND);
        namera.setType("text/plain");
        namera.putExtra(Intent.EXTRA_TEXT,String.valueOf(brrr));

        namera.putExtra("suma",String.valueOf(suma));
        namera.putExtra("duzina",String.valueOf(brojac));
        String naslov = getString(R.string.chooser);
        Intent namera2 = Intent.createChooser(namera,naslov);
        startActivity(namera2);

    }

}