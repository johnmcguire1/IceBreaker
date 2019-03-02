package com.example.icebreaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button breakButton, buildButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        breakButton = findViewById(R.id.breakice);
        buildButton = findViewById(R.id.buildice);
    }

    public void loadDetailsActivity(View view) {
        Intent intent = new Intent(MainActivity.this, Details_Input.class);
        startActivity(intent);
        return;
    }

    public void loadQuizActivity(View view) {
        Intent intent = new Intent(MainActivity.this, Quiz.class);
        startActivity(intent);
        return;
    }
}
