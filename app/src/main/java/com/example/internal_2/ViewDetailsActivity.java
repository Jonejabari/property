package com.example.internal_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.internal_2.databinding.ActivityMainBinding;

public class ViewDetailsActivity extends AppCompatActivity {

    GridView gridView;
    String[] pictureName = {"facebook", "done", "git", "pass"};
    int[] pictureImages ={R.drawable.cute_24, R.drawable.git, R.drawable.done_24, R.drawable.download};

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_view_details);

        gridView = findViewById(R.id.propertyGridView);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);

        //GridAdapter gridAdapter = new GridAdapter(ViewDetailsActivity.this,pictureName,pictureImages);
       // binding.gridView.setAdapter(gridAdapter);
        //binding.gr



        GridView propertyGridView = findViewById(R.id.propertyGridView);
        Button backButton = findViewById(R.id.backButton);
        Button buyButton = findViewById(R.id.buyButton);
        TextView usernameTextView = findViewById(R.id.usernameTextView);

        // Add logic to populate GridView and display username

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to OptionsActivity
                startActivity(new Intent(ViewDetailsActivity.this, OptionsActivity.class));
            }
        });

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to BuyActivity
                startActivity(new Intent(ViewDetailsActivity.this, BuyActivity.class));
            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return pictureImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.grid_item, null);

            TextView name = view1.findViewById(R.id.name);
            ImageView image = view1.findViewById(R.id.image);

            name.setText(pictureName[i]);
            image.setImageResource(pictureImages[i]);
            return view1;
        }
    }
}
