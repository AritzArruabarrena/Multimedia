package com.example.multimediakolana;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseGVAdapter extends ArrayAdapter<Ekipoak> {

    public CourseGVAdapter(@NonNull Context context, ArrayList<Ekipoak> courseModelArrayList) {
        super(context, 0, courseModelArrayList);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.cardview, parent, false);
        }

        Ekipoak courseModel = getItem(position);
        TextView courseTV = listItemView.findViewById(R.id.idTVCourse);
        ImageView courseIV = listItemView.findViewById(R.id.imageView);

        courseTV.setText(courseModel.getCourse_name());
        courseIV.setImageResource(courseModel.getImgid());

        return listItemView;
    }
}


