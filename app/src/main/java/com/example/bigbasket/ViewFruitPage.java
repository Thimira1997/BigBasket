package com.example.bigbasket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class ViewFruitPage extends AppCompatActivity {

    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_fruit_page);

        textview = findViewById(R.id.txtNo2);
        textview.setText(R.string.exampleNo2);

        textview = findViewById(R.id.txtName2);
        textview.setText(R.string.exampleName2);

        textview = findViewById(R.id.txtQuan2);
        textview.setText(R.string.exampleQuan2);

        textview = findViewById(R.id.txtPrice2);
        textview.setText(R.string.examplePrice2);




    }
}