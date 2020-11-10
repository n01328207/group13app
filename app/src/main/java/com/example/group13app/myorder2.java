package com.example.group13app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class myorder2 extends AppCompatActivity {
    public TextView seeDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myorder2);
        seeDetail= (TextView) findViewById(R.id.seeDetail2);
        seeDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(myorder2.this,myorder3.class);
                startActivity(intent);
            }
        });
    }
}