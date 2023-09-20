package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToast("Created");
    }

    @Override
    protected void onStart() {
        super.onStart();

        showToast("Start");
    }

    @Override
    protected void onResume() {
        super.onResume();

        showToast("Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        showToast("Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        showToast("Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        showToast("Destroy");
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}