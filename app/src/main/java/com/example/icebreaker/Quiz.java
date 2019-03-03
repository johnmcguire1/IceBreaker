package com.example.icebreaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Quiz extends AppCompatActivity {

    String[] trueStatements, falseStatements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Intent intent = getIntent();
        trueStatements = intent.getExtras().getStringArray("statements");
        falseStatements = intent.getExtras().getStringArray("nonStatements");
    }



}
