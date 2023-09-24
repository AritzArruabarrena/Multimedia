package com.example.secondactivityv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button ButtonBidali;
    EditText InputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonBidali = findViewById(R.id.ButtonBidali);
        InputText = findViewById(R.id.InputText);
    }
}