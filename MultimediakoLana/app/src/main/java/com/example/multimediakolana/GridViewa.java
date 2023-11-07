package com.example.multimediakolana;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.example.multimediakolana.CourseGVAdapter;
import com.example.multimediakolana.CourseData;
import java.util.ArrayList;
import java.util.List;

public class GridViewa extends Fragment {
    GridView coursesGV;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gridview, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        coursesGV = view.findViewById(R.id.gridview);
        CourseData.initializeCourseList(); // Assuming CourseData is a valid class

        CourseGVAdapter adapter = new CourseGVAdapter(requireContext(), CourseData.getCourseList());
        coursesGV.setAdapter(adapter);
    }


}
