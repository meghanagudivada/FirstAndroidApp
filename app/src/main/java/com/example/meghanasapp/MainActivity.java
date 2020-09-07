package com.example.meghanasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view)
    {
      EditText editText = (EditText)findViewById(R.id.editTextNumberDecimal);
      Log.i("Info",editText.getText().toString());
      String amountInPounds = editText.getText().toString();
      double amountInPoundsDouble = Double.parseDouble(amountInPounds);
      double amountInDollarsDouble = amountInPoundsDouble * 1.3;
      String amountInDollars = String.format("%.2f",amountInDollarsDouble);
      Log.i("Amount in Dollars",amountInDollars);
      Toast.makeText(this, "£" + amountInPounds + " is $" + amountInDollars, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}