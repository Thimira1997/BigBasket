package com.example.bigbasket;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;


public class Register extends AppCompatActivity {

    EditText edtfname,edtlname,edtemail,edtpass,edtcompass;
    Button btnRegister;
    public Button button;

    public final Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "[a-zA-Z0-9+._%-+]{1,256}" +
                    "@" +
                    "[a-zA-Z0-9][a-zA-Z0-9-]{0,64}" +
                    "(" +
                    "." +
                    "[a-zA-Z0-9][a-zA-Z0-9-]{0,25}" +
                    ")+"
    );



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView txtVMsg2 = findViewById(R.id.textView2);
        txtVMsg2.setText(R.string.title1);

        edtfname=(EditText)findViewById(R.id.editTextTextPersonName);
        edtlname=(EditText)findViewById(R.id.editTextTextPersonName2);
        edtemail=(EditText)findViewById(R.id.editTextTextPersonName3);
        edtpass=(EditText)findViewById(R.id.editTextTextPassword);
        edtcompass=(EditText)findViewById(R.id.editTextTextPassword2);
        btnRegister=(Button)findViewById(R.id.editOK);

        btnRegister.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View arg0) {



                if(edtfname.getText().toString().trim().length()==0){
                    edtfname.setError("First Name is not entered");
                    edtfname.requestFocus();
                }

                if(edtlname.getText().toString().trim().length()==0){
                    edtlname.setError("Last Name is not entered");
                    edtlname.requestFocus();
                }
                if(edtemail.getText().toString().trim().length()==0){
                    edtemail.setError("Email is not entered");
                    edtemail.requestFocus();

                }
                else{

                    String checkemail = edtemail.getText().toString();
                    if(!EMAIL_ADDRESS_PATTERN.matcher(checkemail).matches()){
                        Toast.makeText(Register.this,"Invalid Email Address",Toast.LENGTH_SHORT).show();
                        edtemail.requestFocus();

                }

                }

                if(edtpass.getText().toString().trim().length()==0){
                    edtpass.setError("Password is not entered");
                    edtpass.requestFocus();
                }
                if(edtcompass.getText().toString().trim().length()==0){
                    edtcompass.setError("Confirm Password is not entered");
                    edtcompass.requestFocus();
                }

                else if(edtfname.getText().toString().trim().length()!=0)if(edtlname.getText().toString().trim().length()!=0)
                    if(edtemail.getText().toString().trim().length()!=0) if(edtpass.getText().toString().trim().length()!=0)
                        if(edtcompass.getText().toString().trim().length()!=0)  {
                            Intent it=new Intent(getApplicationContext(), UserProfile.class);
                            startActivity(it);

                }




            }




        });

        }



    }

