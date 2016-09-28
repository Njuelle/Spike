package com.example.nico.spike;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        Button buttonCheck = (Button) findViewById(R.id.button_check_palindrome);
        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextPalindrome = (EditText) findViewById(R.id.edit_text_palindrome);
                TextView resultPalindrome = (TextView) findViewById(R.id.text_view_result_palindrome);

                resultPalindrome.setText(checkPalindrome(editTextPalindrome.getText().toString()));
            }
        });
    }

    private String checkPalindrome(String text) {
        StringBuffer sb = new StringBuffer(text);
        if (sb.reverse().toString().equals(text)) {
            return "palindrome !";
        } else {
            return sb.toString();
        }
    }

}
