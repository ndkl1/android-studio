package com.hfad.vezbe6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int broj = 0;
    private boolean radi = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Odbroj();

        if(savedInstanceState!=null){
            broj = savedInstanceState.getInt("broj");
            radi = savedInstanceState.getBoolean("radi");
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("broj", broj);
        savedInstanceState.putBoolean("radi", radi);
    }


    private void Odbroj() {
        final TextView prikaz = (TextView) findViewById(R.id.br);

        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                prikaz.setText(String.valueOf(broj));
                if(radi){
                    if (broj > 0) {
                        broj--;
                    } else broj=0;
                }

                handler.postDelayed(this, 500);
            }
        });
    }
    public void novo(View view){
        broj = 10 + (int) (91 * Math.random());
        radi = true;
    }
    public void pauza(View view){
        radi = false;
    }
    public void nastavi(View view){
        radi = true;
    }

}