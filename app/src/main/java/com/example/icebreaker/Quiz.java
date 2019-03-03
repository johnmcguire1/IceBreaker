package com.example.icebreaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {

    String[] trueStatements, falseStatements;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Intent intent = getIntent();
        trueStatements = intent.getExtras().getStringArray("statements");
        falseStatements = intent.getExtras().getStringArray("nonStatements");
        text = intent.getExtras().getString("text");

        setContentView(R.layout.activity_quiz);
        TextView textBlock = (TextView) findViewById(R.id.text);
        textBlock.setText(text);

    }
}
