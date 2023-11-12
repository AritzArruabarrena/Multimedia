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

public class AddFragment extends Fragment {

    public AddFragment() {
        // Constructor vacío requerido por Fragment
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        EditText ekipoEditText = view.findViewById(R.id.Ekipo);
        EditText descriptionEditText = view.findViewById(R.id.description);
        Button newElementBtn = view.findViewById(R.id.newElementBtn);

        newElementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nuevoNombreEquipo = ekipoEditText.getText().toString();
                String descriptionText = descriptionEditText.getText().toString();
                Ekipoak nuevoEquipo = new Ekipoak(nuevoNombreEquipo, R.drawable.ic_launcher_background, descriptionText);

                CourseData.addCourse(nuevoEquipo);


                NavController navController = Navigation.findNavController(v);
                navController.popBackStack();
            }
        });
    }
}
