package com.example.secondactivityv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView tituloTextView;

    TextView MessageTextView;

    Button ButtonBidali2;

    EditText InputText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tituloTextView = findViewById(R.id.tituloTextView);
        MessageTextView = findViewById(R.id.MessageTextView);

        Bundle datuakjaso = getIntent().getExtras();
        String key = datuakjaso.getString("key");
        MessageTextView.setText(key);

        ButtonBidali2 = findViewById(R.id.ButtonBidali2);
        InputText2 = findViewById(R.id.InputText2);

        ButtonBidali2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle datuakbidali = new Bundle();
                datuakbidali.putString("key2",InputText2.getText().toString());

                Intent intent = new Intent( SecondActivity.this, MainActivity.class);
                intent.putExtras(datuakbidali);
                startActivity(intent);
            }
        });
    }
}
