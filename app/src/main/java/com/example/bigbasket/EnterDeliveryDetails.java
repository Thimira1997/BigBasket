package com.example.bigbasket;

//package com.example.enteryourdeliverydetails;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;

public class EnterDeliveryDetails extends AppCompatActivity {
    private  static  final String TAG = "MainActivity";

    private Button SUBMIT, CANCEL;
    private TextView tv1, tv2,tv3,tv4,tv5,tv6,tv7;
    private EditText Name, MobileNumber, Email, Address1, Address2, Address3, Date;
    private DatePickerDialog.OnDateSetListener mDateSetListner;
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        tv4 = (TextView) findViewById(R.id.textView5);
        tv5 = (TextView) findViewById(R.id.textView7);
        tv6 = (TextView) findViewById(R.id.textView8);
        tv7 = (TextView) findViewById(R.id.textView9);

        Name = (EditText) findViewById(R.id.Name);
        MobileNumber = (EditText) findViewById(R.id.MobileNumber);
        Email = (EditText) findViewById(R.id.Email);
        Address1 = (EditText) findViewById(R.id.Address1);
        Address2 = (EditText) findViewById(R.id.Address2);
        Address3 = (EditText) findViewById(R.id.Address3);
        Date = (EditText) findViewById(R.id.Date);
        SUBMIT = (Button) findViewById(R.id.button);

        Date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(EnterDeliveryDetails.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,mDateSetListner,year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mDateSetListner = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month +1;
                Log.d(TAG,"onDateSet: mm/dd/yyy: " + month + "/" +day+ "/" +year);
                String date = month + "/" + day + "/" + year ;
                Date.setText(date);

            }
        };


        SUBMIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set condition

                String st = Name.getText().toString();
                String st1 = MobileNumber.getText().toString();
                String st2 = Email.getText().toString();
                String st3 = Address1.getText().toString();
                String st4 = Address2.getText().toString();
                String st5 = Address3.getText().toString();
                String st6 = Date.getText().toString();

                if (Name.length() == 0) {
                    Name.setError("Please Enter Your Name !!");
                } else if (MobileNumber.length() == 0) {
                    MobileNumber.setError("Please Enter your Mobile Number !!");
                } else if (Email.length() == 0) {
                    Email.setError("Please Enter A valid Email Address !!");
                } else if (Address1.length() == 0) {
                    Address1.setError("Please Enter Your Region !!");
                } else if (Address3.length() == 0) {
                    Address3.setError("Please Enter Your City !!");
                } else if (Date.length() == 0) {
                    Date.setError("Please Enter the Relavent date !!");
                } else {
                    Toast.makeText(EnterDeliveryDetails.this, "Recode Successfully Added !!", Toast.LENGTH_SHORT).show();
                    /*Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);*/

                    Intent intent = new Intent(EnterDeliveryDetails.this, ViewYourDeliveryDetails.class);
                    intent.putExtra("st",st);
                    intent.putExtra("st1",st1);
                    intent.putExtra("st2",st2);
                    intent.putExtra("st3",st3);
                    intent.putExtra("st4",st4);
                    intent.putExtra("st5",st5);
                    intent.putExtra("st6",st6);
                    startActivity(intent);
                }
            }
        });

    }
}










