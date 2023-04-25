package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    AlertDialog.Builder builder;
    String nname,aage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent2=getIntent();
        nname=intent2.getStringExtra("Name");
        aage=intent2.getStringExtra("Age");
        builder=new AlertDialog.Builder(this);
        int agee= Integer.parseInt(String.valueOf(aage));
        if(agee>=18) {
            builder.setMessage("Welcome " + nname +"\nyou are eligible to use this application").setTitle("Eligibility").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity2.this, "Thankyou for using our application", Toast.LENGTH_SHORT).show();
                    dialogInterface.cancel();
                }
            });
        }
        else
        {
            builder.setMessage("Welcome " + nname +"\nyou are not eligible to use this application").setTitle("Eligibility").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity2.this, "Sorry!You are not eligible to use our application", Toast.LENGTH_SHORT).show();
                    finish();
                }
            });
        }
        AlertDialog alert= builder.create();
        alert.setTitle("Eligibility");
        alert.show();
    }
}