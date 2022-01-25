package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {
        Log.i("info", "Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        String anountInRupees = editText.getText().toString();
        double anountInRupeesDouble = Double.parseDouble(anountInRupees);
        double anountInDollarsDouble = anountInRupeesDouble * 74.80;
        String anountInDollarsString = String.format("%.2f",anountInDollarsDouble);  //to round in 2 decimal places

        Toast.makeText(this, " $ " + anountInRupees + " is ₹ " + anountInDollarsString, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}