package com.example.intencionesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "com.example.intencionesandroid.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonSend = (Button) findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                sendName();
            }

        });
    }

    public void sendName() {
        Intent intent = new Intent(this, DisplayNameActivity.class);
        EditText editText = (EditText) findViewById(R.id.editName);
        String name = editText.getText().toString();
        intent.putExtra(EXTRA_NAME, name);
        startActivity(intent);
    }
}