package com.example.aluschoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class secondlog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondlog);
    }
    public void move(View View)
    {
        Intent mass = new Intent(this,themenu.class);
        startActivity(mass);
    }
}
