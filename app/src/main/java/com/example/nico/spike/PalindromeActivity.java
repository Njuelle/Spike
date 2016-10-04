package com.example.nico.spike;

import android.content.res.ColorStateList;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        final EditText editTextPalindrome = (EditText) findViewById(R.id.edit_text_palindrome);
        editTextPalindrome.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);

                TextView resultText = (TextView) findViewById(R.id.text_view_result_palindrome);
                resultText.setText(getReverse(editTextPalindrome.getText().toString()));

                if (checkPalindrome(editTextPalindrome.getText().toString())) {
                    fab.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(PalindromeActivity.this, R.color.green)));
                } else {
                    fab.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(PalindromeActivity.this, R.color.red)));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private String getReverse(String text) {
        StringBuffer sb = new StringBuffer(text);
        return sb.reverse().toString();
    }

    private boolean checkPalindrome(String text) {
        if (text.isEmpty()) {
            return false;
        }
        StringBuffer sb = new StringBuffer(text);
        if (sb.reverse().toString().equals(text)) {
            return true;
        } else {
            return false;
        }
    }

}
