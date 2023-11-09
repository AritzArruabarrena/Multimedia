package com.example.multimediakolana;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

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

        if (CourseData.getCourseList().isEmpty()) {
            CourseData.initializeCourseList();
        }

        CourseGVAdapter adapter = new CourseGVAdapter(requireContext(), CourseData.getCourseList());
        coursesGV.setAdapter(adapter);

        coursesGV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Ekipoak courseModel = (Ekipoak) parent.getItemAtPosition(position);
                NavController navController = Navigation.findNavController(view);
                Bundle bundle = new Bundle();
                navController.navigate(R.id.action_gridview_to_players, bundle);
            }
        });
    }
    }


