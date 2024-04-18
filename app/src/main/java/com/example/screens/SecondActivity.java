package com.example.screens;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textViewInfo);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String name = extras.getString("Who");
            int number = extras.getInt("Age");
            String sleep = extras.getString("Need sleep?");

            text.setText("Name: " + name + " Age: " + number + " Need sleep: " + sleep);

        }


    }
}
