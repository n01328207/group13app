package com.example.group13app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Security extends AppCompatActivity {
    public TextView backprof;
    private TextView savechange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);
        backprof = (TextView) findViewById(R.id.profileback);
        backprof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Security.this,MainActivity.class);
                startActivity(intent);
            }
        });
        onClickListenerButton();

    }
    public void onClickListenerButton() {
        savechange = (TextView) findViewById(R.id.savechanges1);
        savechange.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Security.this,savechange.getText().toString(),Toast.LENGTH_SHORT).show();;
                    }
                }
        );
    }
}