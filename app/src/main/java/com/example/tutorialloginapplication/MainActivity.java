package com.example.tutorialloginapplication;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        TextView textView = findViewById(R.id.hello_text);
        textView.setText("Welcome back"+intent.getStringExtra("current_user"));
    }
}