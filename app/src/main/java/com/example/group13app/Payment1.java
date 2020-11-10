package com.example.group13app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Payment1 extends AppCompatActivity {
    public TextView backprof;
    public TextView edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment1);
        backprof = (TextView) findViewById(R.id.profileback);
        backprof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Payment1.this,MainActivity.class);
                startActivity(intent);
            }
        });
        edit = (TextView) findViewById(R.id.edit);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Payment1.this,Payment2.class);
                startActivity(intent);
            }
        });
    }
}