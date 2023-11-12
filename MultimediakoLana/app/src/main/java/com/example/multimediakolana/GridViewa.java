package com.example.multimediakolana;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.Navigator;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class GridViewa extends Fragment {
    GridView teamsGridView;
    NavController navController;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gridview, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        teamsGridView = view.findViewById(R.id.gridview);
        FloatingActionButton floatingActionButtonAdd = view.findViewById(R.id.floatingActionButton);
        navController = Navigation.findNavController(view);

        if (CourseData.getCourseList().isEmpty()) {
            CourseData.initializeCourseList();
        }

        floatingActionButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_gridview_to_AddFragment);
            }
        });

        CourseGVAdapter adapter = new CourseGVAdapter(requireContext(), CourseData.getCourseList());
        teamsGridView.setAdapter(adapter);

        teamsGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position) instanceof Ekipoak) {
                    Ekipoak selectedTeam = (Ekipoak) parent.getItemAtPosition(position);

                    // Bundle sortu eta detalleak pasatu hurrengoko horrira
                    Bundle bundle = new Bundle();
                    bundle.putInt("imagen", selectedTeam.getImgid());
                    bundle.putString("texto", selectedTeam.getCourse_name());
                    bundle.putString("Description",selectedTeam.getDescription());
                    bundle.putParcelableArrayList("jugadores", new ArrayList<>(selectedTeam.getPlayers()));

                    Navigation.findNavController(view).navigate(R.id.action_gridview_to_players, bundle);
                }
            }
        });
    }
}



