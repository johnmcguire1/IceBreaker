package com.example.icebreaker;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import java.lang.String;
import java.util.Objects;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Details_Input extends AppCompatActivity {

    EditText name, uni, colour, editor, age, siblings;
    RadioButton cake, biscuit, tabs, spaces, dark, light;
    Button save;

    String nameValue, uniValue, colourValue, editorValue, jaffa, tabsSpaces, mode, notJaffa, notTabsSpaces, notMode, output, notColour, notEditor;
    int ageValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details__input);

        //EditText:
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        uni = findViewById(R.id.university);
        colour = findViewById(R.id.colour);
        editor = findViewById(R.id.texteditor);
        siblings = findViewById(R.id.siblings);

        //RadioButtons:
        cake = findViewById(R.id.cake);
        biscuit = findViewById(R.id.biscuit);
        tabs = findViewById(R.id.tabs);
        spaces = findViewById(R.id.spaces);
        dark = findViewById(R.id.dark);
        light = findViewById(R.id.light);
        save = findViewById(R.id.Save);
    }

    public void generateText(View view){

        nameValue = "Ice Man Nice Man";
        uniValue = "Antarctican University of Political Science";
        ageValue = 80;
        colourValue = "Pink";
        editorValue = "Microsoft Word";
        String sibling = "15";


        if (!name.getText().toString().matches("")) {
                    nameValue = name.getText().toString();}
        if (!uni.getText().toString().matches("")) {
                    uniValue = uni.getText().toString(); }
        if (!siblings.getText().toString().matches("")) {
            sibling = siblings.getText().toString(); }
        if (!age.getText().toString().matches("")) {
            ageValue = Integer.parseInt(age.getText().toString()); }
        if (!colour.getText().toString().matches("")) {
            colourValue = colour.getText().toString(); }
        if (!editor.getText().toString().matches("")) {
            editorValue = editor.getText().toString(); }

        boolean biscuitValue = biscuit.isSelected();
        boolean tabsValue = tabs.isSelected();
        boolean darkValue = dark.isSelected();

        jaffa = "";
        tabsSpaces = "";
        mode = "";

        if(biscuitValue)
            jaffa = "biscuit";
        else
            jaffa = "cake";

        if(tabsValue)
            tabsSpaces = "tabs";
        else
            tabsSpaces = "spaces";

        if(darkValue)
            mode = "dark";
        else
            mode = "light";

        output = "My name is " + nameValue + ". " + "I go to " + uniValue + ". " + "I am " + ageValue + " years old.";
    }


    public void continueToQuiz(View view) {

        generateText(view);

        if(colourValue.equals("red")) {
            notColour = "blue";
        }else {
            notColour = "red";
        }
        if(editorValue.equals("Atom")) {
            notEditor = "Nano";
        }else{
            notEditor = "Atom";
        }

        String[] statements = {"My favourite editor is " + editorValue, "My favourite colour is " + colourValue,
                "A Jaffa Cake is definitely a " + jaffa, "I always use " + tabsSpaces, "I always use " + mode};


        String[] notStatement = {"My favourite colour is " + notColour, "My favourite editor is " + notEditor,
                "A Jaffa Cake is definitely a " + notJaffa, "I always use " + notTabsSpaces, "I always use " + notMode};

        Intent intent = new Intent(Details_Input.this, Quiz.class);
        intent.putExtra("statements", statements);
        intent.putExtra("notStatements", notStatement);
        intent.putExtra("output", output);
        startActivity(intent);
        finish();

    }
}
