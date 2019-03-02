package com.example.icebreaker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.lang.String;


public class Details_Input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details__input);
    }


    String name, uni, colour, editor, jaffa, tabsspaces, mode;

    public Details_Input() {
        this.name = findViewById(R.id.name).toString();
        uni = findViewById(R.id.university).toString();
        this.colour = findViewById(R.id.colour).toString();
        editor = findViewById(R.id.texteditor).toString();
        this.jaffa = findViewById(R.id.jaffacake).toString();
        this.tabsspaces = findViewById(R.id.tabsspacestext).toString();
        this.mode = findViewById(R.id.darklighttext).toString();
        }

}
