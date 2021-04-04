package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsFoodActivity extends AppCompatActivity {
    private ImageView pic;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_food);

        pic=(ImageView) findViewById(R.id.imageViewPicfOOD);
        text=(TextView) findViewById(R.id.textViewDetailsfOOD);

        pic.setImageDrawable(FoodActivity.sharedImage);
        text.setText(FoodActivity.sharedText);
    }
}