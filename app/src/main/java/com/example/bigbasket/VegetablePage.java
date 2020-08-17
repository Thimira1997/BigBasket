package com.example.bigbasket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class VegetablePage extends AppCompatActivity {

    TextView textView;
    EditText editNo,editName,editQuantity,editPrice;
    Button buttonAdd,buttonView,buttonUpdate,buttonDelete;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable_page);

        textView = findViewById(R.id.vegTopic);
        textView.setText(R.string.veg_Store);

        textView = findViewById(R.id.vegName);
        textView.setText(R.string.name);

        textView = findViewById(R.id.vegQuantity);
        textView.setText(R.string.quantity);

        textView = findViewById(R.id.vegPrice);
        textView.setText(R.string.price);

        textView = findViewById(R.id.vegNo);
        textView.setText(R.string.itemNo);

        editNo = (EditText)findViewById(R.id.etNo);
        editName = (EditText)findViewById(R.id.etName);
        editQuantity = (EditText)findViewById(R.id.etQuan);
        editPrice = (EditText)findViewById(R.id.etPrice);
        buttonAdd = (Button)findViewById(R.id.btnAdd);
        buttonView = (Button)findViewById(R.id.btnView);
        buttonUpdate = (Button)findViewById(R.id.btnUpdate);
        buttonDelete = (Button)findViewById(R.id.btnDelete);
        imageView = (ImageView)findViewById(R.id.imageView3);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VegetablePage.this,"Insert Image!!",Toast.LENGTH_SHORT).show();
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editNo.getText().toString().trim().length()==0){
                    editNo.setError("Item No entering is required");
                    editNo.requestFocus();
                }

                if(editName.getText().toString().trim().length()==0){
                    editName.setError("Item Name entering is required");
                    editName.requestFocus();
                }

                if(editQuantity.getText().toString().trim().length()==0){
                    editQuantity.setError("Quantity entering is required");
                    editQuantity.requestFocus();
                }

                if(editPrice.getText().toString().trim().length()==0){
                    editPrice.setError("Item Price entering is required");
                    editPrice.requestFocus();
                }

                else if(editNo.getText().toString().trim().length()!=0)if(editName.getText().toString().trim().length()!=0)
                    if(editQuantity.getText().toString().trim().length()!=0)if(editPrice.getText().toString().trim().length()!=0){
                        Toast.makeText(VegetablePage.this,"Item Added Successfully!!",Toast.LENGTH_SHORT).show();
                    }
            }
        });

        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(VegetablePage.this,ViewVegPage.class);
                startActivity(it);
            }
        });

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VegetablePage.this,"Item Updated Successfully!!",Toast.LENGTH_SHORT).show();
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VegetablePage.this,"Item Deleted !!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}