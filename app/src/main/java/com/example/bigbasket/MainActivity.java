package com.example.bigbasket;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText edtuser,edtpass;
    Button btnLogin;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView txtVMsg2 = findViewById(R.id.textView);
        txtVMsg2.setText(R.string.title);


        edtuser=(EditText)findViewById(R.id.Username);
        edtpass=(EditText)findViewById(R.id.Password);
        btnLogin=(Button)findViewById(R.id.login);

        button= (Button) findViewById(R.id.editOK);
        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                if(edtuser.getText().toString().equals("Thimira") &&
                        edtpass.getText().toString().equals("1234")) {
                    Toast.makeText(getApplicationContext(),
                            "Login Sucessful",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Username or Password",Toast.LENGTH_SHORT).show();
                }

                if(edtuser.getText().toString().trim().length()==0){
                    edtuser.setError("Username is not entered");
                    edtuser.requestFocus();
                }
                if(edtpass.getText().toString().trim().length()==0){
                    edtpass.setError("Password is not entered");
                    edtpass.requestFocus();
                }
                else if(edtuser.getText().toString().trim().length()!=0)if(edtpass.getText().toString().trim().length()!=0){
                    Intent it=new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(it);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });

    }



}

