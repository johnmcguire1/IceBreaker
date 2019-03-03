package com.example.icebreaker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button breakButton, buildButton, infoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        breakButton = findViewById(R.id.breakice);
        buildButton = findViewById(R.id.buildice);
        infoButton = findViewById(R.id.info);
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

    public void loadInfo(View view) {
        String info = "This game is supposed to break the ice between two people who haven't met before. " +
                "One person fills out a survey about themselves, 'building the ice', then gives the phone to another person. " +
                "That second person 'breaks the ice' by choosing out of three statements about the previous person" +
                "two truths and a lie. Then they could enter their information and give the phone to the third person," +
                "or swipe to he side to answer questions about other people.";
        Toast.makeText(MainActivity.this, info, Toast.LENGTH_LONG).show();

    }
}
