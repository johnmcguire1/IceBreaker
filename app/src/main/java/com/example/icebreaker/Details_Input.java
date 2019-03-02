package com.example.icebreaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Details_Input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details__input);
    }
    String name, uni, colour, editor, jaffa, tabspaces, mode;
    public String generateText(){
        return "My name is " + name + ". " + "I go to " + uni + ". " + "My favourite colour is "
                + colour + ". " + "My favourite editor is " + editor + ". " + "A Jaffa Cake is definately a "
                + jaffa + ". " + "I always use " + tabspaces + ". " + "I prefer " + mode + ".";
}

}
