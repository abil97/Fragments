package com.example.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyFragment extends Fragment {

    private long dogId;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my, container, false);
    }

    public void setID(long i) {
        this.dogId = i;
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView nameText = view.findViewById(R.id.dog_breed);
            TextView tempText =  view.findViewById(R.id.dog_origin);
            ImageView imageView = view.findViewById(R.id.dog_image);
            Dog dog = Dog.dogs[(int) dogId];
            nameText.setText(dog.getBreed());
            tempText.setText("Origin: " + dog.getOrigin());
            imageView.setImageResource(dog.getImage());
        }


    }
}