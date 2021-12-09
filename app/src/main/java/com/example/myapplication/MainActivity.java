package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
Button B1,B2;
String getUsername,getPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.uname);
        e2=(EditText) findViewById(R.id.pass);
        B1=(AppCompatButton)findViewById(R.id.login);
        B2=(AppCompatButton)findViewById(R.id.goToReg);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUsername=e1.getText().toString();
                Toast.makeText(getApplicationContext(),getUsername,Toast.LENGTH_LONG).show();
                getPassword=e2.getText().toString();
                Toast.makeText(getApplicationContext(),getPassword,Toast.LENGTH_LONG).show();

            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);

            }
        });


    }
}