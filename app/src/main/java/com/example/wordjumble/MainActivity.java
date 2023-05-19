package com.example.wordjumble;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint("WrongViewCast")
        ImageButton start = findViewById(R.id.start);
        EditText word=findViewById(R.id.wordin);
        EditText clue=findViewById(R.id.hint);
        String answer = word.getText().toString().toUpperCase();
        String hint = clue.getText().toString().toUpperCase();


        start.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("WORD", answer);
            intent.putExtra("CLUE", hint);
            startActivity(intent);

        });

    }
}