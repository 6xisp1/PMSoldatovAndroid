package com.example.taxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registracia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registracia);
    }
    public void goGlavnuy(View v) {
        Intent intent = new Intent(this, Glavnuy.class);
        startActivity(intent);
    }
}