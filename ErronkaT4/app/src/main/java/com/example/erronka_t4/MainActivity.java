package com.example.erronka_t4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = findViewById(R.id.gridView);
        ArrayList<Element> elementArrayList = new ArrayList<Element>();

        elementArrayList.add(new Element("Android Original", R.drawable.android_original));
        elementArrayList.add(new Element("JAVA", R.drawable.java_original));
        elementArrayList.add(new Element("C++", R.drawable.cplusplus_original));
        elementArrayList.add(new Element("C#", R.drawable.csharp_original));
        elementArrayList.add(new Element("CSS", R.drawable.css3_original));
        elementArrayList.add(new Element("C", R.drawable.c_original));

        Adapter adapter2 = new Adapter(this, elementArrayList);
        adapter2.setAdapter(adapter);
    }
}