package com.example.nico.spike;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.AccessController;

import static java.security.AccessController.getContext;

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
                TextView resultPalindrome = (TextView) findViewById(R.id.text_view_result_palindrome);
                FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
                if (checkPalindrome(editTextPalindrome.getText().toString())) {
                    fab.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green)));
                } else {
                    fab.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
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
