package com.example.erronka_t4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.ArrayList;

public class Adapter extends ArrayAdapter<Element> {

    public  Adapter(@NonNull Context context, ArrayList<Element> elementArrayList){
        super(context, 0, elementArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listitemView = convertView;
        if (listitemView == null){
            listitemView = LayoutInflater.from(getContext().inflate(R.layout.grid_item, parent, false));
        }

        Element element = getItem(position);
        TextView textView = listitemView.findViewById(R.id.name);
        ImageView imageView = listitemView.findViewById(R.id.grid_image);

        textView.setText(element.getName());
        imageView.setImageResource(element.getImage());
        return listitemView;
    }
}
