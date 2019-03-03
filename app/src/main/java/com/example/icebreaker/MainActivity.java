package com.example.icebreaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

    public void loadInfo(View view) {
        String information = "This game is played in the following way: the first person enters their details in a survey," +
                "then passes the phone to the next person. That person has to choose a false statement out of three which appear on the " +
                "next screen based on the previous person's answers (they try to guess whether a statement is true or false." +
                "Then this person enters their own details and passes the phone to the next.";

        Toast.makeText(this, information, Toast.LENGTH_LONG).show();
    }
}
