package com.example.a2aplikazioa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   int gehiketaGenerala;
    int lehenengoGehiketa = 0;
    int bigarrenGehiketa = 0;
    int hirugarrenGehiketa = 0;
    int laugarrenGehiketa = 0;

    //TextView
    TextView KontagailuOrokorra;
    TextView KontagailuBat;
    TextView KontagailuBi;
    TextView KontagailuHiru;
    TextView KontagailuLau;

    //Button-Reset
    Button ResetOrokorra;
    Button ResetBat;
    Button ResetBi;
    Button ResetHiru;
    Button ResetLau;

    //Button-Gehitu
    Button GehituBat;
    Button GehituBi;
    Button GehituHiru;
    Button GehituLau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KontagailuOrokorra = findViewById(R.id.KontagailuOrokorra);
        KontagailuBat = findViewById(R.id.KontagailuBat);
        KontagailuBi = findViewById(R.id.KontagailuBi);
        KontagailuHiru = findViewById(R.id.KontagailuHiru);
        KontagailuLau = findViewById(R.id.KontagailuLau);
        ResetOrokorra = findViewById(R.id.ResetOrokorra);
        ResetBat = findViewById(R.id.ResetBat);
        ResetBi = findViewById(R.id.ResetBi);
        ResetHiru = findViewById(R.id.ResetHiru);
        ResetLau = findViewById(R.id.ResetLau);
        GehituBat = findViewById(R.id.GehituBat);
        GehituBi = findViewById(R.id.GehituBi);
        GehituHiru = findViewById(R.id.GehituHiru);
        GehituLau = findViewById(R.id.GehituLau);

        GehituBat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lehenengoGehiketa++;
                KontagailuBat.setText(lehenengoGehiketa + "");
                gehiketaGenerala++;
                KontagailuOrokorra.setText(gehiketaGenerala + "");
            }
        });
        GehituBi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bigarrenGehiketa++;
                KontagailuBi.setText(bigarrenGehiketa + "");
                gehiketaGenerala++;
                KontagailuOrokorra.setText(gehiketaGenerala + "");
            }
        });
        GehituHiru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hirugarrenGehiketa++;
                KontagailuHiru.setText(hirugarrenGehiketa + "");
                gehiketaGenerala++;
                KontagailuOrokorra.setText(gehiketaGenerala + "");
            }
        });
        GehituLau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                laugarrenGehiketa++;
                KontagailuLau.setText(laugarrenGehiketa + "");
                gehiketaGenerala++;
                KontagailuOrokorra.setText(gehiketaGenerala + "");
            }
        });

        ResetBat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gehiketaGenerala = gehiketaGenerala - lehenengoGehiketa;
                KontagailuOrokorra.setText(gehiketaGenerala + "");
                lehenengoGehiketa = 0;
               KontagailuBat.setText(lehenengoGehiketa + "");
            }
        });
        ResetBi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gehiketaGenerala = gehiketaGenerala - bigarrenGehiketa;
                KontagailuOrokorra.setText(gehiketaGenerala + "");
                bigarrenGehiketa = 0;
                KontagailuBi.setText(bigarrenGehiketa + "");
            }
        });
        ResetHiru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gehiketaGenerala = gehiketaGenerala - hirugarrenGehiketa;
                KontagailuOrokorra.setText(gehiketaGenerala + "");
                hirugarrenGehiketa = 0;
                KontagailuHiru.setText(hirugarrenGehiketa + "");
            }
        });
        ResetLau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gehiketaGenerala = gehiketaGenerala - laugarrenGehiketa;
                KontagailuOrokorra.setText(gehiketaGenerala + "");
                laugarrenGehiketa = 0;
                KontagailuLau.setText(laugarrenGehiketa + "");
            }
        });

        ResetOrokorra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gehiketaGenerala = 0;
                KontagailuOrokorra.setText(gehiketaGenerala + "");
                lehenengoGehiketa = 0;
                KontagailuBat.setText(gehiketaGenerala + "");
                bigarrenGehiketa = 0;
                KontagailuBi.setText(gehiketaGenerala + "");
                hirugarrenGehiketa = 0;
                KontagailuHiru.setText(gehiketaGenerala + "");
                laugarrenGehiketa = 0;
                KontagailuLau.setText(gehiketaGenerala + "");
            }
        });
    }
}