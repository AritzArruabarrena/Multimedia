package com.example.multimediakolana;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Players extends Fragment {
    RecyclerView playersRecyclerView;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_players, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        playersRecyclerView = view.findViewById(R.id.recyclerView);

        Bundle args = getArguments();
        if (args != null) {
            Integer imagenResource = args.getInt("imagen", R.drawable.ic_launcher_background);
            String texto = args.getString("texto", "Default Text");
            String texto2 = args.getString("Description", "Default Text");


            ImageView imageView = view.findViewById(R.id.Escudo);
            TextView textView = view.findViewById(R.id.EquipoName);
            TextView descriptionView = view.findViewById(R.id.Deskription);

            imageView.setImageResource(imagenResource);
            textView.setText(texto);
            descriptionView.setText(texto2);

            ArrayList<Jokalariak> playersList = args.getParcelableArrayList("jugadores");
            if (playersList != null) {
                configureRecyclerView(playersList);
            }
        }
        navController = Navigation.findNavController(view);
        FloatingActionButton floatingActionButtonAdd2 = view.findViewById(R.id.floatingActionButton2);
        floatingActionButtonAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_players_to_addPlayer);
            }
        });
    }
    private void configureRecyclerView(ArrayList<Jokalariak> playersList) {
        CourseRVAdapter adapter = new CourseRVAdapter(requireContext(), playersList);
        playersRecyclerView.setAdapter(adapter);
        playersRecyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
    }
}
