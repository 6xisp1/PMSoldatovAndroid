package com.example.taxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
}

    public void goRegistracia(View v) {
        Intent intent = new Intent(this, Registracia.class);
        startActivity(intent);
    }

    public void goGlavnuy(View v) {
        Intent intent = new Intent(this, Glavnuy.class);
        startActivity(intent);
    }

}