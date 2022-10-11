package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    private TextView button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button5 = (TextView) findViewById(R.id.button5);
        button5.setOnClickListener(this);

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
                Toast.makeText(getApplicationContext(), "YOUR ACCOUNT WAS SUCCESSFULLY CREATED",
                        Toast.LENGTH_SHORT).show();


            }
        });


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button5:
                startActivity(new Intent(this, MainActivity2.class));
                break;
        }
    }
}