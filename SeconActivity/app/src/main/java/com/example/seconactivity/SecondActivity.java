package com.example.seconactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity  extends AppCompatActivity {
    TextView tituloTextView;

    TextView MessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tituloTextView = findViewById(R.id.tituloTextView);
        MessageTextView = findViewById(R.id.MessageTextView);

       Bundle datuakjaso = getIntent().getExtras();
        String key = datuakjaso.getString("key");
        MessageTextView.setText(key);
    }
}
