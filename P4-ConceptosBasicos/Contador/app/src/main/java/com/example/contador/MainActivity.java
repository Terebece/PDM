package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter=0;
    private TextView label_counter;
    private Button buttonIncrease;
    private Button buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label_counter = (TextView) findViewById(R.id.textView);
        buttonIncrease = (Button) findViewById(R.id.buttonIncrease);
        buttonReset = (Button) findViewById(R.id.buttonReset);

        buttonIncrease.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                update_counter();
            }

        });

        buttonReset.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                reset_counter();
            }

        });
    }

    private void update_counter(){
        counter++;
        String counterStr = String.valueOf(counter);
        label_counter.setText("Contador: " + counterStr);
    }

    private void reset_counter(){
        this.counter = 0;
        String counterStr = String.valueOf(counter);
        label_counter.setText("Contador: " + counterStr);
    }
}