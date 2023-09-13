package com.example.klik_kontagailua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int kontagailua;
    TextView klikkontagailua;
    Button gehiketa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        klikkontagailua = findViewById(R.id.klikkontagailua);
        gehiketa = findViewById(R.id.gehiketa);

    gehiketa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            kontagailua++;
            klikkontagailua.setText(kontagailua + " aldiz klikatu duzu!");
        }
    });
}
}