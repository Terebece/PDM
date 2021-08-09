package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mShowCount = (TextView) findViewById(R.id.show_count);
        if (mShowCount != null)
            mShowCount.setText("Práctica 2 \n Primera App Interactiva");
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showThanks(View view) {
        Toast toast = Toast.makeText(this, R.string.thanks_message, Toast.LENGTH_SHORT);
        toast.show();
    }
}