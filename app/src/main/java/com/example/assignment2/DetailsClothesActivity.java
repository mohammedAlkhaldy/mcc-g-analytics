package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsClothesActivity extends AppCompatActivity {
    private ImageView pic;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_clothes);

        pic=(ImageView) findViewById(R.id.imageViewPic);
        text=(TextView) findViewById(R.id.textViewDetails);

        pic.setImageDrawable(clothesActivity.sharedImage);
        text.setText(clothesActivity.sharedText);
    }
}