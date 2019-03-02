package com.example.icebreaker;

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
        String nameValue = name.getText().toString();
        String uniValue = uni.getText().toString();
        String colourValue = colour.getText().toString();
        String editorValue = editor.getText().toString();

        Boolean cakeValue = cake.isSelected();
        Boolean biscuitValue = biscuit.isSelected();

        String jaffa = "";

        if(cakeValue)
            jaffa = "cake";
        else if(biscuitValue)
            jaffa = "biscuit";

        String output = "My name is " + nameValue + ". " + "I go to " + uniValue + ". " + "My favourite colour is "
                 + colourValue + ". " + "My favourite editor is " + editorValue + ". " + "A Jaffa Cake is definately a "
                + jaffa + "";
                //". " + "I always use " + tabsspaces + ". " + "I prefer " + mode + ".";

        Toast.makeText(Details_Input.this, output, Toast.LENGTH_LONG).show();
    }
}


