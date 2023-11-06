package com.example.multimediakolana;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class GridViewa extends Fragment {
    GridView coursesGV;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gridview, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        coursesGV = view.findViewById(R.id.gridview);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        courseModelArrayList.add(new CourseModel("Betis", R.mipmap.betis));
        courseModelArrayList.add(new CourseModel("Real Sociedad", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("Osasuna", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("Alaves", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("Sevilla", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("Cadiz", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("Celta de Vigo", R.drawable.ic_launcher_background));


        CourseGVAdapter adapter = new CourseGVAdapter(coursesGV.getContext(), courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }

}