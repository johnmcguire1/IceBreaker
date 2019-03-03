package com.example.icebreaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

    }

    public void loadHomeScreenFromQuiz(View view) {
        Intent intent = new Intent(Quiz.this,MainActivity.class);
        startActivity(intent);
        return;
    }

}
