package com.hfad.jun22;

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

    public void onRacunaj(View view){
        EditText bredit=(EditText) findViewById(R.id.edit_broj);
        int broj=Integer.parseInt(bredit.getText().toString());
        int i;
        String del="";
        String poruka;
        int br=0;

        for(i=1; i<=broj; i++){
            if(broj%i==0){
                del=del.concat(String.valueOf(i));
                del=del.concat(" ");
                br++;}
        }
        if (br==2) {
            poruka=getString(R.string.prost); }
        else if (br>2) {
            poruka=getString(R.string.slozen); }
        else poruka=getString(R.string.nista);

        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, String.valueOf(broj));
        intent.putExtra("del", del);
        intent.putExtra("poruka", poruka);

        String naslov=getString(R.string.naslov);
        Intent chooser=Intent.createChooser(intent, naslov);

        startActivity(chooser);



    }



}

