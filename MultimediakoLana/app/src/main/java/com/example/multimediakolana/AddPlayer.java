package com.example.multimediakolana;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import java.util.ArrayList;

public class AddPlayer extends Fragment {

    public AddPlayer() {
        // Constructor vacío requerido por Fragment
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_player, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        EditText playerNameEditText = view.findViewById(R.id.Jokalaria);
        Button newElementBtn = view.findViewById(R.id.newElementBtn);

        newElementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String playerName = playerNameEditText.getText().toString();

                ArrayList<Ekipoak> teamList = CourseData.getCourseList();

                if (!teamList.isEmpty()) {
                    Ekipoak selectedTeam = teamList.get(teamList.size() - 1);

                    Jokalariak newPlayer = new Jokalariak(playerName, R.drawable.ic_launcher_background);
                    selectedTeam.addPlayer(newPlayer);

                    NavController navController = Navigation.findNavController(v);
                    navController.popBackStack();
                } else {

                }
            }
        });
    }
}
