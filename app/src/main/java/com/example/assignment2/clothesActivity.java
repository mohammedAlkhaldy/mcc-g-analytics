package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clothesActivity extends AppCompatActivity {
    public static Drawable sharedImage;
    public static String sharedText;
    private Button btnZara;
    private Button btnNike;
    private Button btnFox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);

        btnZara=(Button) findViewById(R.id.buttonZara);
        btnNike=(Button) findViewById(R.id.buttonNike);
        btnFox=(Button) findViewById(R.id.buttonFox);

        btnZara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedText="Zara Jeans \n 95% Cotton\n 5% Pollster\n Price $250.00";
                sharedImage = getResources().getDrawable( R.drawable.zara );
                Intent intent=new Intent(clothesActivity.this , DetailsClothesActivity.class);
                startActivity(intent);
                //   finish();
            }
        });

        btnNike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedImage = getResources().getDrawable( R.drawable.nike );
                sharedText="Nike Shoes \n 75% Cotton\n 25% Pollster\n Price $299.00";
                Intent intent=new Intent(clothesActivity.this , DetailsClothesActivity.class);
                startActivity(intent);
                //   finish();
            }
        });

        btnFox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedImage = getResources().getDrawable( R.drawable.fox );
                sharedText="Fox T-shirt \n 100% Cotton\n 0% Pollster\n Price $99.00";
                Intent intent=new Intent(clothesActivity.this , DetailsClothesActivity.class);
                startActivity(intent);
                //   finish();
            }
        });
    }
}