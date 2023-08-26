package com.hfad.vezbe7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int donji = 0;
    private int gornji = 0;
    private int br = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        brojac();
    }

    private void brojac(){
        final TextView prikaz = (TextView) findViewById(R.id.rez);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                prikaz.setText(String.valueOf(br));
                while (br<=gornji){
                    br++;
                }
                handler.postDelayed(this, 300);
            }
        });
    }

    public void odbroj(View view){
        EditText dbr = (EditText) findViewById(R.id.br1);
        EditText gbr = (EditText) findViewById(R.id.br2);
        donji = Integer.parseInt(dbr.getText().toString());
        gornji = Integer.parseInt(gbr.getText().toString());
        br=donji;
    }
}