package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 private Button btnElectronic;
 private Button btnClothes;
 private Button btnFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnElectronic=(Button) findViewById(R.id.btnElectronic);
        btnClothes=(Button) findViewById(R.id.btnClothes);
        btnFood=(Button) findViewById(R.id.btnFood);

        btnElectronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this , ElectornicActivity.class);
                startActivity(intent);
             //   finish();
            }
        });

        btnClothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this , clothesActivity.class);
                startActivity(intent);
                //   finish();
            }
        });

        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this , FoodActivity.class);
                startActivity(intent);
                //   finish();
            }
        });
    }
}