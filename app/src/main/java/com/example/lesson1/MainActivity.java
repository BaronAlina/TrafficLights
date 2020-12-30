package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button start;
    Button red;
    Button yellow;
    Button green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.button);
        red = findViewById(R.id.red);
        yellow = findViewById(R.id.yellow);
        green = findViewById(R.id.green);

        start.setOnClickListener(new View.OnClickListener() {
            int a=0;
            @Override
            public void onClick(View view) {
                a++;
                if (a==4){a=1;}
                switch (a){
                    case 1:
                        red.setBackgroundColor(getColor(R.color.red));
                        yellow.setBackgroundColor(getColor(R.color.grey));
                        green.setBackgroundColor(getColor(R.color.grey));
                        break;
                    case 2:
                        red.setBackgroundColor(getColor(R.color.grey));
                        yellow.setBackgroundColor(getColor(R.color.yellow));
                        green.setBackgroundColor(getColor(R.color.grey));
                        break;
                    case 3:
                        red.setBackgroundColor(getColor(R.color.grey));
                        yellow.setBackgroundColor(getColor(R.color.grey));
                        green.setBackgroundColor(getColor(R.color.green));
                        break;
                }
            }
        });
    }

}