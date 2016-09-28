package com.example.nico.spike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.StringTokenizer;

public class StringCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_calculator);

        Button buttonCalculate = (Button) findViewById(R.id.button_calculate);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextCalc = (EditText) findViewById(R.id.edit_text_calculator);
                TextView resultCalculator = (TextView) findViewById(R.id.text_view_result_calculator);
                resultCalculator.setText(Integer.toString(add(editTextCalc.getText().toString())));
            }
        });

    }

    public int add (String string) {
        String delimiter = "\n,";
        if (!string.isEmpty()) {
            if (string.startsWith("//")){
                delimiter = String.valueOf(string.charAt(2));
                string = string.substring(4);
            }
        } else {
            return 0;
        }
        StringTokenizer st = new StringTokenizer(string, delimiter);
        int result = 0;
        while (st.hasMoreElements()) {
            result += Integer.parseInt(st.nextElement().toString());
        }
        return result;
    }
}
