package com.hfad.jun22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainIspis extends AppCompatActivity {

    protected static String brojstr;
    protected static String del;
    protected static String poruka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ispis);

        Intent intent=getIntent();
        brojstr=intent.getStringExtra(Intent.EXTRA_TEXT);
        del=intent.getStringExtra("del");
        poruka=intent.getStringExtra("poruka");

        TextView brojtext=(TextView) findViewById(R.id.del_naslov);
        String naslov=brojtext.getText().toString();
        naslov=naslov.concat(brojstr);
        brojtext.setText(naslov);

        TextView deltext=(TextView) findViewById(R.id.delitelji);
        deltext.setText(del);
        TextView porukatext=(TextView) findViewById(R.id.poruka);
        porukatext.setText(poruka);
    }

    public void onNazad(){
        finish();
    }

}