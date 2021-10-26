package com.example.explain;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
public void button1 (View view) {
        EditText editText=findViewById(R.id.editTextTextPersonName);

        EditText editText1=findViewById(R.id.editTextTextPassword);

        TextView textView=findViewById(R.id.hello);

Intent intent = new Intent(this,MainActivity2.class);
startActivity(intent);


    }

}



