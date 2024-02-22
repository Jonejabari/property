package com.example.internal_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BuyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        TextView congratulationsTextView = findViewById(R.id.congratulationsTextView);
        Button viewMoreButton = findViewById(R.id.viewMoreButton);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView usernameTextView = findViewById(R.id.usernameTextView);

        // Add logic to display congratulations message and username

        viewMoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to OptionsActivity
                startActivity(new Intent(BuyActivity.this, OptionsActivity.class));
            }
        });
    }
}
