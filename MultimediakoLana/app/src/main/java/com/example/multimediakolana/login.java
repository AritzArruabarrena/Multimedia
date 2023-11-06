package com.example.multimediakolana;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class login extends Fragment {

    Button btn_login;
    EditText EditTextUser;

    NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_loginn, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        EditTextUser = view.findViewById(R.id.EditTextUser);
        btn_login = view.findViewById(R.id.btn_login);
        navController = Navigation.findNavController(view);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user1 = EditTextUser.getText().toString();
                if (user1.equals("Admin")) {
                    navController.navigate(R.id.action_loginn_to_gridview);
                } else {
                    System.out.println("hola");
                }
            }
        });

    }
}