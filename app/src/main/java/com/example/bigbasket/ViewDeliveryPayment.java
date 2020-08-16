package com.example.bigbasket;

//package com.example.enteryourdeliverydetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ViewDeliveryPayment extends AppCompatActivity {

    private TextView destination, km, tv1, tv2, tv3;
    private Button EDIT,SHOW_TOTAL_CHARGE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_delivery_payment);

        tv1 = findViewById(R.id.textView6);
        tv1.setText(R.string.viewPay);

        tv2 = findViewById(R.id.textView10);
        tv2.setText(R.string.ViewPay1);

        tv3 = findViewById(R.id.textView12);
        tv3.setText(R.string.ViewPay2);

        destination = (TextView) findViewById(R.id.textView11);
        km = (TextView) findViewById(R.id.textView17);

        destination.setText(getIntent().getStringExtra("d1"));
        km.setText(getIntent().getStringExtra("d2"));

        EDIT = (Button) findViewById(R.id.button7);

        EDIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ViewDeliveryPayment.this,"Record Successfully Updated !!", Toast.LENGTH_SHORT).show();
            }
        });

        SHOW_TOTAL_CHARGE = (Button) findViewById(R.id.button8);

        SHOW_TOTAL_CHARGE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ViewDeliveryPayment.this,TotalDeliveryCharge.class);
                Toast.makeText(ViewDeliveryPayment.this,"Now You Can See Your Total Charge !!",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }
}