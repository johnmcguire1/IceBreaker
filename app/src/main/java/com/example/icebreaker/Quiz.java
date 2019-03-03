package com.example.icebreaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {

    private String[] trueStatements, falseStatements;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Intent intent = getIntent();
        trueStatements = intent.getExtras().getStringArray("statements");
        falseStatements = intent.getExtras().getStringArray("notStatements");
        text = intent.getExtras().getString("output");

        TextView persontext = findViewById(R.id.persontext);



        String trueselection1 = trueStatements[0];
        String trueselection2 = trueStatements[1];
        String falseselection = falseStatements[0];

        persontext.setText(text + trueselection1 + trueselection2 + falseselection);

        Button truebutton1 = findViewById(R.id.Question1);
        Button truebutton2 = findViewById(R.id.Question2);
        Button falsebutton = findViewById(R.id.Question3);

        truebutton1.setText(trueselection1);
        truebutton2.setText(trueselection2);
        falsebutton.setText(falseselection);




    }
}
