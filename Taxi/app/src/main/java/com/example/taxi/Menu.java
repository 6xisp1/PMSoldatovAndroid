package com.example.taxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void goHistory(View v) {
        Intent intent = new Intent(this, History.class);
        startActivity(intent);
    }

    public void goSetting(View v) {
        Intent intent = new Intent(this, Setting.class);
        startActivity(intent);
    }
}