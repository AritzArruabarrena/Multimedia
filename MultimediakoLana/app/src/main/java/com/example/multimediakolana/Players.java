package com.example.multimediakolana;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Players extends Fragment {

    GridView coursesGV;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gridview, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        coursesGV = view.findViewById(R.id.gridview);
        if (CourseData.getCourseList().isEmpty()) {
            CourseData.PlayerList();
        }

        CourseGVAdapter adapter = new CourseGVAdapter(requireContext(), CourseData.getCourseModelArrayList1());
        coursesGV.setAdapter(adapter);

    }
}