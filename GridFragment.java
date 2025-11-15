package com.example.bttablayout_viewpager;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class GridFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycler_fragment, container, false);

        RecyclerView recycler = view.findViewById(R.id.recyclerView);
        recycler.setLayoutManager(new GridLayoutManager(getContext(), 2));

        ItemAdapter adapter = new ItemAdapter(getData());
        recycler.setAdapter(adapter);

        return view;
    }

    private ArrayList<String> getData() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) list.add("Grid Item " + i);
        return list;
    }
}
