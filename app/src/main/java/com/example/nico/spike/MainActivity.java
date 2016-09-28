package com.example.nico.spike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //PALINDROME
        launchActivityOnClick((Button) findViewById(R.id.button_palindrome), PalindromeActivity.class);
        launchActivityOnClick((Button) findViewById(R.id.button_string_calculator), StringCalculatorActivity.class);

   }

    /*
     * Launch activity on click on button
     * @params : Button button, Class c
     * @return : void
     */
    private void launchActivityOnClick(Button button, final Class c){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, c);
                startActivity(i);
            }
        });
    }
}
