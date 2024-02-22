package com.example.internal_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        //ImageView propertyImageView = findViewById(R.id.propertyImageView);
        Button viewButton = findViewById(R.id.viewButton);
        Button buyButton = findViewById(R.id.buyButton);
        TextView usernameTextView = findViewById(R.id.usernameTextView);

        // Add logic to display property image and username

        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ViewDetailsActivity
                startActivity(new Intent(OptionsActivity.this, ViewDetailsActivity.class));
            }
        });

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to BuyActivity
                startActivity(new Intent(OptionsActivity.this, BuyActivity.class));
            }
        });
    }
}
