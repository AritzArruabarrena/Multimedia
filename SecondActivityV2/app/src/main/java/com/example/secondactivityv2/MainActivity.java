package com.example.secondactivityv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button ButtonBidali;
    EditText InputText;
    TextView MessageTextView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonBidali = findViewById(R.id.ButtonBidali);
        InputText = findViewById(R.id.InputText);


        ButtonBidali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle datuakbidali = new Bundle();
                datuakbidali.putString("key",InputText.getText().toString());

                Intent intent = new Intent( MainActivity.this, SecondActivity.class);
                intent.putExtras(datuakbidali);
                startActivity(intent);
            }
        });

        MessageTextView2 = findViewById(R.id.MessageTextView2);

        Intent datuakjaso = getIntent();
        String key2 = datuakjaso.getStringExtra("key2");
        MessageTextView2.setText(key2);
    }
}