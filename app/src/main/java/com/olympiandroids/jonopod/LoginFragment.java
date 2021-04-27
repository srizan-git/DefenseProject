package com.olympiandroids.jonopod;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LoginFragment extends Fragment {
    Button button;
    NavController  navController;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        button = view.findViewById(R.id.button_register);

        navController = Navigation.findNavController(view);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                navController.navigate(R.id.registerFragment);
                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}