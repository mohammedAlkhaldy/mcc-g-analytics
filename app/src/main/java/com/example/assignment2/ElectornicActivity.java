package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElectornicActivity extends AppCompatActivity {
public static Drawable sharedImage;
public static String sharedText;
    private Button btnHp;
    private Button btnIphone;
    private Button btnMacbookPro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electornic);
        btnHp=(Button) findViewById(R.id.btnLenovo);
        btnIphone=(Button) findViewById(R.id.btnIphone);
        btnMacbookPro=(Button) findViewById(R.id.btnMackbookPro);

        btnHp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedText=" Hp Labtop \n Core i7-5500k 2.4 Gzh\n 8gb of ram\n SSD 128gb";
                sharedImage = getResources().getDrawable( R.drawable.hp );
                Intent intent=new Intent(ElectornicActivity.this , DetailsActivity.class);
                startActivity(intent);
                //   finish();
            }
        });

        btnIphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedImage = getResources().getDrawable( R.drawable.iphonex );
                sharedText="iphone X \n A11 chip 2.00 Ghz\n 3gb of ram\n FaceId";
                Intent intent=new Intent(ElectornicActivity.this , DetailsActivity.class);
                startActivity(intent);
                //   finish();
            }
        });

        btnMacbookPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedImage = getResources().getDrawable( R.drawable.mac );
                sharedText="MacbookPro  \n Core i7-8800k 3.4 Gzh\n 16gb of ram\n SSD 265gb";
                Intent intent=new Intent(ElectornicActivity.this , DetailsActivity.class);
                startActivity(intent);
                //   finish();
            }
        });
    }
}