package com.example.group13app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView goMyOrder1;
    public TextView goSecurity;
    public TextView goPayment1;
    public TextView goBackMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goMyOrder1 = (TextView) findViewById(R.id.myorder);
        goMyOrder1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,myorder1.class);
                startActivity(intent);
            }
        });
        goSecurity = (TextView) findViewById(R.id.security);
        goSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Security.class);
                startActivity(intent);
            }
        });
        goPayment1 = (TextView) findViewById(R.id.payment);
        goPayment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Payment1.class);
                startActivity(intent);
            }
        });

        goBackMain = (TextView) findViewById(R.id.backmain);
        goBackMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,myorder1.class);
                startActivity(intent);
            }
        });
    }


}