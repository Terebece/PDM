package com.example.intencionesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_name);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(name);

        Button pag_web = (Button) findViewById(R.id.buttonWeb);
        Button pag_map = (Button) findViewById(R.id.buttonMap);

        pag_web.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                paginaWeb();
            }

        });

        pag_map.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                googleMaps();
            }

        });
    }

    public void paginaWeb(){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.fciencias.unam.mx/"));
        startActivity(i);
    }

    public void googleMaps(){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/cTrjN7MhWxSqbF1K7"));
        startActivity(i);
    }
}