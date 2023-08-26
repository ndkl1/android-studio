package com.hfad.vezbe4;

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

    public void prebroj(View view){
        EditText sl = (EditText) findViewById(R.id.slovo);
        EditText str = (EditText) findViewById(R.id.str);
        String slovo = sl.getText().toString();
        String string = str.getText().toString();

        int i;
        int sab = 0;

        for (i=0; i<string.length(); i++){
            if(slovo.charAt(0)==string.charAt(i)){
                sab+=1;
            }
        }

        Intent namera = new Intent(Intent.ACTION_SEND);
        namera.setType("text/plain");
        namera.putExtra(Intent.EXTRA_TEXT, String.valueOf(sab));
        startActivity(namera);

    }
}