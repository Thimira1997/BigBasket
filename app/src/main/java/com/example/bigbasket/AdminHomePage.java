package com.example.bigbasket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminHomePage extends AppCompatActivity {

    private Button eVeg;
    private Button eFruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home_page);

        eVeg = findViewById(R.id.btnVeg);
        eFruit = findViewById(R.id.btnFruit);

        eVeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHomePage.this, VegetablePage.class);
                startActivity(intent);
            }
        });

        eFruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(AdminHomePage.this, FruitPage.class);
                startActivity(intent);
            }
        });



    }
}