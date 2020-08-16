package com.example.bigbasket;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import android.os.Bundle;

public class TotalBill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_bill);

        TextView txtVMsg2 = findViewById(R.id.textView2);
        txtVMsg2.setText(R.string.title2);

        TextView txtVMsg3 = findViewById(R.id.orderpay1);
        txtVMsg3.setText(R.string.order);

        TextView txtVMsg4 = findViewById(R.id.deliverypay1);
        txtVMsg4.setText(R.string.delivery);

        TextView txtVMsg5 = findViewById(R.id.tot1);
        txtVMsg5.setText(R.string.total);

        TextView txtVMsg6 = findViewById(R.id.orderpay2);
        txtVMsg6.setText(R.string.order1);

        TextView txtVMsg7 = findViewById(R.id.deliverypay2);
        txtVMsg7.setText(R.string.delivery1);

        TextView txtVMsg8 = findViewById(R.id.tot2);
        txtVMsg8.setText(R.string.total1);





    }
}