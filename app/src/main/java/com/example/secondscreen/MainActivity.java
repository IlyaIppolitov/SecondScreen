package com.example.secondscreen;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate called");

        Button buttonOpenSecondActivity = findViewById(R.id.buttonOpenSecondActivity);
        buttonOpenSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Вызван метод onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Вызван метод onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Вызван метод onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Вызван метод onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Вызван метод onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Вызван метод onRestart");
    }
}