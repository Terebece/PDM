package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText height;
    private TextView result;
    private EditText weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = (EditText) findViewById(R.id.height);
        result = (TextView) findViewById(R.id.result);
        weight = (EditText) findViewById(R.id.weight);
    }

    public void calculateBMI(View v) {
        String strHeight = height.getText().toString();
        String strWeight = weight.getText().toString();

        if (strHeight != null && !"".equals(strHeight)
                && strWeight != null  &&  !"".equals(strWeight)) {

            double heightValue = Double.parseDouble(strHeight) / 100;
            double weightValue = Double.parseDouble(strWeight);

            double bmi = weightValue / (heightValue * heightValue);
            double bmi_result = Math.round(bmi * 100.0) / 100.0;
            calculateBMI(bmi_result);
        }
    }

    private void calculateBMI(double bmi) {
        String bmiLabel = "";

        if (Double.compare(bmi, 15) <= 0) {
            bmiLabel = getString(R.string.very_severely_underweight);
        } else if (Double.compare(bmi, 15) > 0  &&  Double.compare(bmi, 16) <= 0) {
            bmiLabel = getString(R.string.severely_underweight);
        } else if (Double.compare(bmi, 16) > 0  &&  Double.compare(bmi, 18.5) <= 0) {
            bmiLabel = getString(R.string.underweight);
        } else if (Double.compare(bmi, 18.5) > 0  &&  Double.compare(bmi, 25) <= 0) {
            bmiLabel = getString(R.string.normal);
        } else if (Double.compare(bmi, 25) > 0  &&  Double.compare(bmi, 30) <= 0) {
            bmiLabel = getString(R.string.overweight);
        } else if (Double.compare(bmi, 30) > 0  &&  Double.compare(bmi, 35) <= 0) {
            bmiLabel = getString(R.string.obese_class_i);
        } else if (Double.compare(bmi, 35) > 0  &&  Double.compare(bmi, 40) <= 0) {
            bmiLabel = getString(R.string.obese_class_ii);
        } else {
            bmiLabel = getString(R.string.obese_class_iii);
        }

        bmiLabel = "IMC: " + bmi + "\n\n" + bmiLabel;
        result.setText(bmiLabel);
    }

}