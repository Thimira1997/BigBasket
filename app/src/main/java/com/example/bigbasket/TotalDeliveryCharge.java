package com.example.bigbasket;

//package com.example.enteryourdeliverydetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TotalDeliveryCharge extends AppCompatActivity {

    private TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10;
    private Button PAY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_delivery_charge);

       /* PAY = (Button) findViewById(R.id.button9);
        PAY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TotalDeliveryCharge.this,TotalBill.class);
                startActivity(intent);
            }
        });*/

        tv1 = findViewById(R.id.textView18);
        tv1.setText(R.string.interface5);

        tv2 = findViewById(R.id.textView19);
        tv2.setText(R.string.Charge1);

        tv3 = findViewById(R.id.textView20);
        tv3.setText(R.string.Total1Value);

        tv4 = findViewById(R.id.textView21);
        tv4.setText(R.string.Charge2);

        tv5 = findViewById(R.id.textView22);
        tv5.setText(R.string.Tota_Km_Value);

        tv6 = findViewById(R.id.textView23);
        tv6.setText(R.string.Charge3);

        tv7 = findViewById(R.id.textView24);
        tv7.setText(R.string.Fee);

        tv8 = findViewById(R.id.textView25);
        tv8.setText(R.string.Warning);

        tv9 = findViewById(R.id.textView26);
        tv9.setText(R.string.thank);

        tv10 = findViewById(R.id.button9);
        tv10.setText(R.string.button_final);

    }
}