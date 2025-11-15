package com.example.bttablayout_viewpager;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class StaggeredFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycler_fragment, container, false);

        RecyclerView recycler = view.findViewById(R.id.recyclerView);
        recycler.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        ItemAdapter adapter = new ItemAdapter(getData());
        recycler.setAdapter(adapter);

        return view;
    }

    private ArrayList<String> getData() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) list.add("Staggered Item " + i);
        return list;
    }
}
