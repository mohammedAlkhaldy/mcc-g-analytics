package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodActivity extends AppCompatActivity {
    public static Drawable sharedImage;
    public static String sharedText;
    private Button Meat;
    private Button Salad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        Meat=(Button) findViewById(R.id.btnMeat);
        Salad=(Button) findViewById(R.id.btnSalad);

        Meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedText="Meat \n 24% Protein\n 52% Sodium\n 20% Fat";
                sharedImage = getResources().getDrawable( R.drawable.meat );
                Intent intent=new Intent(FoodActivity.this , DetailsFoodActivity.class);
                startActivity(intent);
                //   finish();
            }
        });

        Salad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedImage = getResources().getDrawable( R.drawable.salad );
                sharedText="Green Salad \n 2% Protein\n 10% Sodium\n 1% Fat";
                Intent intent=new Intent(FoodActivity.this , DetailsFoodActivity.class);
                startActivity(intent);
                //   finish();
            }
        });
    }
}