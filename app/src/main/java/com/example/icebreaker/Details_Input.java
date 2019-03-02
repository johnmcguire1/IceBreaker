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


public class Details_Input extends AppCompatActivity {

    EditText name, uni, colour, editor;
    RadioButton cake, biscuit, tabs, spaces, dark, light;
    Button save;

    String nameValue, uniValue, colourValue, editorValue, jaffa, tabsSpaces, mode;

    //hardcoded lists
    String[] editors = {"Atom", "Nano"};
    String[] colours = {"Red", "Blue"};

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
        }else if(biscuitValue) {
            jaffa = "biscuit";
        }

        if(tabsValue) {
            tabsSpaces = "tabs";
        }else if(spacesValue) {
            tabsSpaces = "spaces";
        }

        if(lightValue) {
            mode = "light mode";
        }else if(darkValue) {
            mode = "dark mode";
        }

        String output = "My name is " + nameValue + ". " + "I go to " + uniValue + ". ";

        /*+ "My favourite colour is "
                 + colourValue + ". " + "My favourite editor is " + editorValue + ". " + "A Jaffa Cake is definitely a "
                + jaffa + . " + "I always use " + tabsspaces + ". " + "I prefer " + mode + ".";*/

        Toast.makeText(Details_Input.this, output, Toast.LENGTH_LONG).show();
    }


    public void continueToQuiz(View view) {
        generateText(view);

        //True statements
        String statementJaffa = "A Jaffa Cake is definitely a " + jaffa;
        String statementTabs = "I always use " + tabsSpaces;
        String statementMode = "I always use " + mode;

        Intent intent = new Intent(Details_Input.this, Quiz.class);
        startActivity(intent);
        return;
    }
}


