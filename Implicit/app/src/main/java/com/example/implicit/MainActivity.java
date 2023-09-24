package com.example.implicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button websiteButton, locationButton , ShareButton;
    EditText shareInput,locationInput,websiteInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        websiteButton = findViewById(R.id.websiteButton);
        locationButton = findViewById(R.id.locationButton);
        ShareButton = findViewById(R.id.ShareButton);
        shareInput = findViewById(R.id.shareInput);
        locationInput = findViewById(R.id.locationInput);
        websiteInput = findViewById(R.id.websiteInput);

        websiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse(websiteInput.getText().toString());
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });

        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("http://www.google.com/maps/place/" + locationInput.getText().toString());
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });

        ShareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(Intent.ACTION_SEND);
               intent.setType("text/plain");
               String sub = shareInput.getText().toString();
               intent.putExtra(Intent.EXTRA_TEXT, sub);
               startActivity(Intent.createChooser(intent, "share using"));
            }
        });

    }
}