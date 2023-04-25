package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button bt;
    String name,age;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editname);
        et2=findViewById(R.id.editage);
        bt=findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              name=et1.getText().toString();
              age=et2.getText().toString();
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("Name",name);
                intent.putExtra("Age",age);
                startActivity(intent);
            }
        });
    }
}