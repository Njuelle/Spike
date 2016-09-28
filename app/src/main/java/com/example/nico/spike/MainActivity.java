package com.example.nico.spike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonPalindrome = (Button) findViewById(R.id.button_palindrome);
        Button buttonStringCalculator = (Button) findViewById(R.id.button_string_calculator);
    }

}
