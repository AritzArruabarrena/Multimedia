package com.example.seconactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {
    Button ButtonBidali;
    EditText messageInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageInput = findViewById(R.id.messageInput);
        ButtonBidali = findViewById(R.id.ButtonBidali);

        ButtonBidali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle datuakbidali = new Bundle();
                datuakbidali.putString("key",messageInput.getText().toString());

                Intent intent = new Intent( MainActivity.this, SecondActivity.class);
                intent.putExtras(datuakbidali);
                startActivity(intent);
                }
        });
    }
}