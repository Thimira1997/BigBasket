package com.example.bigbasket;

//package com.example.enteryourdeliverydetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.jar.Attributes;

public class ViewYourDeliveryDetails extends AppCompatActivity {

    private TextView n,m,e,a1,a2,a3,d;
    private Button EDIT,DELETE,NextPaymentInfo;

    private TextView Name, MobileNumber,Email,Address1,Address2,Address3,Date;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_your_delivery_details);

        n = (TextView) findViewById(R.id.name);
        m = (TextView) findViewById(R.id.mobile);
        e = (TextView) findViewById(R.id.email);
        a1 = (TextView) findViewById(R.id.ad1);
        a2 = (TextView) findViewById(R.id.ad2);
        a3 = (TextView) findViewById(R.id.ad3);
        d = (TextView) findViewById(R.id.date);

        n.setText(getIntent().getStringExtra("st"));
        m.setText(getIntent().getStringExtra("st1"));
        e.setText(getIntent().getStringExtra("st2"));
        a1.setText(getIntent().getStringExtra("st3"));
        a2.setText(getIntent().getStringExtra("st4"));
        a3.setText(getIntent().getStringExtra("st5"));
        d.setText(getIntent().getStringExtra("st6"));

        NextPaymentInfo = (Button)findViewById(R.id.button5);

        EDIT = (Button) findViewById(R.id.button3);

        DELETE = (Button) findViewById(R.id.button4);

        EDIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ViewYourDeliveryDetails.this,"Record SuccessFully Updated !!",Toast.LENGTH_SHORT).show();
            }
        });

        DELETE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ViewYourDeliveryDetails.this,"Record Successfully Deleted !!",Toast.LENGTH_SHORT).show();
            }
        });

        NextPaymentInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ViewYourDeliveryDetails.this,YourDeliveryPaymentInfo.class);
                Toast.makeText(ViewYourDeliveryDetails.this,"Now You can See How The Payment Is Calculated !!",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }

}
