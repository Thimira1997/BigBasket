package com.example.bigbasket;

//package com.example.enteryourdeliverydetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class YourDeliveryPaymentInfo extends AppCompatActivity {

    private TextView textView1, textView2, textView3, textView4;

    private EditText  destination, kilometer;

    private Button NEXT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_delivery_payment_info);

        textView1 = findViewById(R.id.textView13);
        textView1.setText(R.string.interface3);

        textView2 = findViewById(R.id.textView14);
        textView2.setText(R.string.Pay1);

        textView3 = findViewById(R.id.textView15);
        textView3.setText(R.string.Pay2);

        textView4 = findViewById(R.id.textView16);
        textView4.setText(R.string.Pay3);

        //charge = (EditText) findViewById(R.id.Charge);
        destination = (EditText) findViewById(R.id.Destination);
        kilometer = (EditText) findViewById(R.id.Km);

        NEXT = (Button) findViewById(R.id.button6);

        NEXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String d1 = destination.getText().toString();
                String d2 = kilometer.getText().toString();

                if (destination.length() == 0) {
                    destination.setError("Please Enter Your Destination !!");
                } else if (kilometer.length() == 0) {
                    kilometer.setError("Please Enter How Many Km You Have !!");
                } else {
                    Toast.makeText(YourDeliveryPaymentInfo.this, "Payment Detail Successfully Added !!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(YourDeliveryPaymentInfo.this, ViewDeliveryPayment.class);
                    intent.putExtra("d1", d1);
                    intent.putExtra("d2", d2);
                    startActivity(intent);
                }
            }
        });
    }
}

