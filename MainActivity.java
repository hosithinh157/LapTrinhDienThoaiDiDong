package com.example.btrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NameAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Danh sách tên tiếng Việt
        List<String> nameList = Arrays.asList(
                "An", "Bình", "Cường", "Dũng", "Hằng", "Lan", "Minh", "Nam", "Oanh", "Phương", "Quỳnh"
        );

        adapter = new NameAdapter(this, nameList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}