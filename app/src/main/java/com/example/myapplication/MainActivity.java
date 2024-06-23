package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    TextView textviewTitle;
    EditText editTextEnterName;
    Button  buttonHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textviewTitle = findViewById(R.id.title);
        editTextEnterName = findViewById(R.id.editTextTextEnterName);
        buttonHello = findViewById(R.id.buttonHello);

        buttonHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enteredName = editTextEnterName.getText().toString();

               Toast.makeText(MainActivity.this," Welcome "+enteredName+ " to our App",Toast.LENGTH_LONG).show();



            }
        });

    }
}