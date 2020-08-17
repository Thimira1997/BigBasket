package com.example.bigbasket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class ViewVegPage extends AppCompatActivity {

    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_veg_page);

        textview = findViewById(R.id.txtNo);
        textview.setText(R.string.exampleNo);

        textview = findViewById(R.id.txtName);
        textview.setText(R.string.exampleName);

        textview = findViewById(R.id.txtQuan);
        textview.setText(R.string.exampleQuan);

        textview = findViewById(R.id.txtPrice);
        textview.setText(R.string.examplePrice);




    }
}