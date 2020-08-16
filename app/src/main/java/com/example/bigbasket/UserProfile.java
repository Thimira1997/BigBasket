package com.example.bigbasket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class UserProfile extends AppCompatActivity {
    public Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        TextView txtVMsg2 = findViewById(R.id.textView3);
        txtVMsg2.setText(R.string.userprofile);

        TextView txtVMsg3 = findViewById(R.id.textView4);
        txtVMsg3.setText(R.string.fname);

        TextView txtVMsg4 = findViewById(R.id.textView5);
        txtVMsg4.setText(R.string.lname);

        TextView txtVMsg5= findViewById(R.id.textView6);
        txtVMsg5.setText(R.string.email);

        TextView txtVMsg6= findViewById(R.id.textView7);
        txtVMsg6.setText(R.string.password);

        TextView txtVMsg7= findViewById(R.id.textView8);
        txtVMsg7.setText(R.string.fname1);

        TextView txtVMsg8= findViewById(R.id.textView9);
        txtVMsg8.setText(R.string.lname1);

        TextView txtVMsg9= findViewById(R.id.textView10);
        txtVMsg9.setText(R.string.email3);

        TextView txtVMsg10= findViewById(R.id.textView11);
        txtVMsg10.setText(R.string.password1);






        button= (Button) findViewById(R.id.button3);
        button1= (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(UserProfile.this, ProfileEdit.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(UserProfile.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}