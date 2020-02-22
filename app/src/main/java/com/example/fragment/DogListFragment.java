package com.example.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DogListFragment extends ListFragment {

    static interface DogListener {
        void itemClicked(long id);
    }

    private DogListener l;

    public DogListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        int len = Dog.dogs.length;
        String[] dog_breeds = new String[len];
        for (int i = 0; i < len; i++) {
            dog_breeds[i] = Dog.dogs[i].getBreed();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, dog_breeds);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            l = (DogListener) activity;
        }
    }

    @Override
    public void onListItemClick(ListView listView, View v, int position, long id) {
        if (l != null) {
            l.itemClicked(id);
        }

    }
}