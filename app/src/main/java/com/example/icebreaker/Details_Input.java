package com.example.icebreaker;

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
        String nameValue = "Ice Man Nice Man";
        String uniValue = "Antarctican University of Political Science";
        int ageValue = 80;
        String colourValue = "Pink";
        String editorValue = "Microsoft Word";
        String sibling = "";

        if (!name.getText().toString().matches("")) {
                    nameValue = name.getText().toString();}
        if (!uni.getText().toString().matches("")) {
                    uniValue = uni.getText().toString(); }
        if (!siblings.getText().toString().matches("")) {
            sibling = uni.getText().toString(); }
        if (!age.getText().toString().matches("")) {
            ageValue = Integer.parseInt(age.getText().toString()); }
        if (!colour.getText().toString().matches("")) {
            colourValue = colour.getText().toString(); }
        if (!editor.getText().toString().matches("")) {
            editorValue = editor.getText().toString(); }

        //Boolean cakeValue = cake.isSelected();
        boolean biscuitValue = biscuit.isSelected();
        boolean tabsValue = tabs.isSelected();
       // Boolean spacesValue = spaces.isSelected();
        boolean darkValue = dark.isSelected();
       // Boolean lightValue = light.isSelected();
        String jaffa = "";
        String tabsspaces = "";
        String mode = "";

        if(biscuitValue)
            jaffa = "biscuit";
        else
            jaffa = "cake";

        if(tabsValue)
            tabsspaces = "tabs";
        else
            tabsspaces = "spaces";

        if(darkValue)
            mode = "dark";
        else
            mode = "light";


        String output = "My name is " + nameValue + ", I am " + ageValue + " years old. I go to " + uniValue + ". " + "My favourite colour is "
                 + colourValue + ". " + "My favourite editor is " + editorValue + ". " + "A Jaffa Cake is definitely a "
                + jaffa + "" + ". " + "I always use " + tabsspaces + ". " + "I prefer " + mode + "mode. I have " + sibling + " siblings.";

        Toast.makeText(Details_Input.this, output, Toast.LENGTH_LONG).show();
    }
}
