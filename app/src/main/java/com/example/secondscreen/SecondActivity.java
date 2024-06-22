package com.example.secondscreen;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "Вызван метод onCreate");
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