package com.example.myapp;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView = findViewById(R.id.recyclerView);
    private MyAdapter myAdapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            itemList.add(new Item("Item " + i));
        }
        myAdapter = new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter);
    }
}