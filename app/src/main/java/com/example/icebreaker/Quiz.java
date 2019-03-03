package com.example.icebreaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    private String[] trueStatements, falseStatements;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Intent intent = getIntent();

        if(intent.hasExtra("statements")) {
            trueStatements = intent.getExtras().getStringArray("statements");
        } else {
            trueStatements = new String[]{"I always use spaces", "My favourite colour is blue"};
        }

        if(intent.hasExtra("notStatements")) {
            falseStatements = intent.getExtras().getStringArray("notStatements");
        }else {
            falseStatements = new String[]{"I always use tabs", "My favourite colour is green"};
        }

        if(intent.hasExtra("output")) {
            text = intent.getExtras().getString("output");
        }else{
            text = "My name is Ice Man Nice Man. I go to Antarctican University of Political Science. I'm 80 years old.";
        }

        TextView persontext = findViewById(R.id.persontext);



        String trueselection1 = trueStatements[0];
        String trueselection2 = trueStatements[1];
        String falseselection = falseStatements[0];

        persontext.setText(text);

        Button truebutton1 = findViewById(R.id.Question1);
        Button truebutton2 = findViewById(R.id.Question2);
        Button falsebutton = findViewById(R.id.Question3);

        truebutton1.setText(trueselection1);
        truebutton2.setText(trueselection2);
        falsebutton.setText(falseselection);

    }


    public void check1(View view) {
        Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
    }

    public void check2(View view) {
        Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
    }

    public void check3(View view) {
        Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show();
    }


}
