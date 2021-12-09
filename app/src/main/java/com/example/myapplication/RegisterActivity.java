package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
AppCompatButton b1,b2;
String getName,getAddress,getPhoneNumber,getEmailId,getUsername,getPassword,getConfirmPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.addr);
        ed3=(EditText) findViewById(R.id.ph);
        ed4=(EditText) findViewById(R.id.eid);
        ed5=(EditText) findViewById((R.id.uname));
        ed6=(EditText) findViewById(R.id.pass);
        ed7=(EditText) findViewById(R.id.cpass);
        b1=(AppCompatButton)findViewById(R.id.reg);
        b2=(AppCompatButton) findViewById(R.id.backtologin);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),getName,Toast.LENGTH_LONG).show();
                getAddress=ed2.getText().toString();
                Toast.makeText(getApplicationContext(),getAddress,Toast.LENGTH_LONG).show();
                getPhoneNumber=ed3.getText().toString();
                Toast.makeText(getApplicationContext(),getPhoneNumber,Toast.LENGTH_LONG).show();
                getEmailId=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getEmailId,Toast.LENGTH_LONG).show();
                getUsername=ed5.getText().toString();
                Toast.makeText(getApplicationContext(),getUsername,Toast.LENGTH_LONG).show();
                getPassword=ed6.getText().toString();
                Toast.makeText(getApplicationContext(),getPassword,Toast.LENGTH_LONG).show();
                getConfirmPass=ed7.getText().toString();
                Toast.makeText(getApplicationContext(),getConfirmPass,Toast.LENGTH_LONG).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}