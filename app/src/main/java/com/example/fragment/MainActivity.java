package com.example.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements DogListFragment.DogListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_main);
    }


    @Override
    public void itemClicked(long id) {
        MyFragment f = new MyFragment();
        f.setID(id);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frag_position, f)
                .commit();
    }
}
