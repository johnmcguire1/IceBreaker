package com.example.icebreaker;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
//import java.lang.String;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


//ALSO DO AGE!

public class Details_Input extends AppCompatActivity {

    EditText name, uni, colour, editor;
    RadioButton cake, biscuit, tabs, spaces, dark, light;
    Button save;

    String nameValue, uniValue, colourValue, editorValue, jaffa, tabsSpaces, mode, notColour, notJaffa, notTabsSpaces, notMode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details__input);

        //EditText:
        name = findViewById(R.id.name);
        uni = findViewById(R.id.university);
        colour = findViewById(R.id.colour);
        editor = findViewById(R.id.texteditor);

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
        nameValue = name.getText().toString();
        uniValue = uni.getText().toString();
        colourValue = colour.getText().toString();
        editorValue = editor.getText().toString();


        Boolean cakeValue, biscuitValue, tabsValue, spacesValue, lightValue, darkValue;
        cakeValue = cake.isSelected();
        biscuitValue = biscuit.isSelected();
        tabsValue = tabs.isSelected();
        spacesValue = spaces.isSelected();
        lightValue = light.isSelected();
        darkValue = dark.isSelected();

        jaffa = ""; tabsSpaces = ""; mode = "";

        if(cakeValue) {
            jaffa = "cake";
            notJaffa = "biscuit";
        }else if(biscuitValue) {
            jaffa = "biscuit";
            notJaffa = "cake";
        }

        if(tabsValue) {
            tabsSpaces = "tabs";
            notTabsSpaces = "spaces";
        }else if(spacesValue) {
            tabsSpaces = "spaces";
            notTabsSpaces = "tabs";
        }

        if(lightValue) {
            mode = "light mode";
            notMode = "dark mode";
        }else if(darkValue) {
            mode = "dark mode";
            notMode = "light mode";
        }

        String output = "My name is " + nameValue + ". " + "I go to " + uniValue + ". ";

        Toast.makeText(Details_Input.this, output, Toast.LENGTH_LONG).show();
    }


    public void continueToQuiz(View view) {

        String notColour, notEditor;

        generateText(view);

        Intent intent = new Intent(Details_Input.this, Quiz.class);

        //True statements

        String[] statements = {"My favourite editor is " + editorValue, "My favourite colour is " + colourValue,
                        "A Jaffa Cake is definitely a " + jaffa, "I always use " + tabsSpaces, "I always use " + mode};

        intent.putExtra("statements", statements);

        //False statements

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

        String[] notStatement = {"My favourite colour is " + notColour, "My favourite editor is " + notEditor,
                "A Jaffa Cake is definitely a " + notJaffa, "I always use " + notTabsSpaces, "I always use " + notMode};

        intent.putExtra("notStatements", notStatement);

        startActivity(intent);
        return;
    }
}


