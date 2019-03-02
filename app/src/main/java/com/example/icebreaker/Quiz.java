package com.example.icebreaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Quiz extends AppCompatActivity {

    String statementJaffa, statementTabs, statementMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Intent intent = getIntent();
        statementJaffa = intent.getExtras().getString("statementJaffa");
        statementTabs = intent.getExtras().getString("statementTabs");
        statementMode = intent.getExtras().getString("statementMode");
    }



}
