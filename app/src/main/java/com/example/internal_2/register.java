package com.example.internal_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText usernameEditText = findViewById(R.id.usernameEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        EditText emailEditText = findViewById(R.id.emailEditText);
        // Add references for other input fields

        Button registerButton = findViewById(R.id.registerButton);
        Button backButton = findViewById(R.id.backButton);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validate input fields (Add your validation logic)
                // If valid, navigate to OptionsActivity
                startActivity(new Intent(register.this, OptionsActivity.class));
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to LoginActivity
                startActivity(new Intent(register.this, MainActivity.class));
            }
        });
    }
}
