package com.example.bigbasket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileEdit extends AppCompatActivity {

    Button btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_edit);

        TextView txtVMsg2 = findViewById(R.id.textView2);
        txtVMsg2.setText(R.string.useredit);

        btnEdit= (Button) findViewById(R.id.editOK);
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileEdit.this, UserProfile.class);
                startActivity(intent);
            }
        });

    }
}