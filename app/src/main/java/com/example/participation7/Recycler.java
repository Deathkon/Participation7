package com.example.participation7;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class Recycler extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerAdapter recyclerAdapter;
    List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recyclerView = findViewById(R.id.recyclerId);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        itemList = new ArrayList<>();
        itemList = fillTheList();
        recyclerAdapter = new RecyclerAdapter(this, itemList);
        recyclerView.setAdapter(recyclerAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        startActivity(new Intent(this, MainActivity.class));
        return super.onOptionsItemSelected(item);
    }

    private List<Item> fillTheList() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(R.drawable.p2, "Morgan Stanley", "INS", 26, 97));
        itemList.add(new Item(R.drawable.p3, "Morgan Freeman", "Actor", 60, 96));
        itemList.add(new Item(R.drawable.p5, "Iring Desi", "HTM", 22, 83));
        itemList.add(new Item(R.drawable.p8, "M Philbert", "INS", 20, 73));
        itemList.add(new Item(R.drawable.p1, "Robert Quinn", "HTM", 24, 33));
        itemList.add(new Item(R.drawable.p4, "Mary Tyler", "INS", 27, 85));
        itemList.add(new Item(R.drawable.p2, "Ivor weaselly", "INS", 30, 54));
        return itemList;
    }
}

