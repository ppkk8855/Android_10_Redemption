package com.example.redemption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button M1_2;
    private Button M3_4;
    private Button M5_6;
    private Button M7_8;
    private Button M9_10;
    private Button M11_12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        M1_2=findViewById(R.id.btn1_2);
        M3_4=findViewById(R.id.btn3_4);
        M5_6=findViewById(R.id.btn5_6);
        M7_8=findViewById(R.id.btn7_8);
        M9_10=findViewById(R.id.btn9_10);
        M11_12=findViewById(R.id.btn11_12);


        M1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Month",1);
                startActivity(intent);
            }
        });

        M3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Month",3);
                startActivity(intent);
            }
        });

        M5_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Month",5);
                startActivity(intent);
            }
        });
        M7_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Month",7);
                startActivity(intent);
            }
        });
        M9_10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Month",9);
                startActivity(intent);
            }
        });
        M11_12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Month", 11);
                startActivity(intent);
            }
        });

    }
}
