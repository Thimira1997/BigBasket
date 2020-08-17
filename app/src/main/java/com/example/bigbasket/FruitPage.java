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

public class FruitPage extends AppCompatActivity {

    TextView textView;
    EditText editNo,editName,editQuantity,editPrice;
    Button buttonAdd,buttonView,buttonUpdate,buttonDelete;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_page);

        textView = findViewById(R.id.fruitTopic);
        textView.setText(R.string.fruit_Store);

        textView = findViewById(R.id.fruitName);
        textView.setText(R.string.name);

        textView = findViewById(R.id.fruitQuantity);
        textView.setText(R.string.quantity);

        textView = findViewById(R.id.fruitPrice);
        textView.setText(R.string.price);

        textView = findViewById(R.id.fruitNo);
        textView.setText(R.string.itemNo);

        editNo = (EditText)findViewById(R.id.etNo2);
        editName = (EditText)findViewById(R.id.etName2);
        editQuantity = (EditText)findViewById(R.id.etQuan2);
        editPrice = (EditText)findViewById(R.id.etPrice2);
        buttonAdd = (Button)findViewById(R.id.btnAdd2);
        buttonView = (Button)findViewById(R.id.btnView2);
        buttonUpdate = (Button)findViewById(R.id.btnUpdate2);
        buttonDelete = (Button)findViewById(R.id.btnDelete2);
        imageView = (ImageView)findViewById(R.id.imageView4);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FruitPage.this,"Insert Image!!",Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(FruitPage.this,"Item Added Successfully!!",Toast.LENGTH_SHORT).show();
                    }
            }
        });

        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FruitPage.this,ViewFruitPage.class);
                startActivity(it);
            }
        });

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FruitPage.this,"Item Updated Successfully!!",Toast.LENGTH_SHORT).show();
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FruitPage.this,"Item Deleted !!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}