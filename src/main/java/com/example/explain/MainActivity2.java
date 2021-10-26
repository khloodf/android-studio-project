package com.example.explain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void button (View view){
        EditText firsname = findViewById(R.id.editTextTextPersonName2);
        EditText lastname = findViewById(R.id.editTextTextPersonName3);
        EditText email = findViewById(R.id.editTextTextEmailAddress);

        TextView textView = findViewById(R.id.textView);

        textView.setText(firsname.getText().toString());

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(lastname.getText().toString());
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText(email.getText().toString());


    }



}