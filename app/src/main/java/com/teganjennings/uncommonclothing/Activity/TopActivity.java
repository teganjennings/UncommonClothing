package com.teganjennings.uncommonclothing.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.teganjennings.uncommonclothing.Adapter.ClothesAdapter;
import com.teganjennings.uncommonclothing.List.ClothesList;
import com.teganjennings.uncommonclothing.R;

import java.util.ArrayList;

public class TopActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter2;
    private RecyclerView recyclerViewTopsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tops_activity);

    }

    private void recyclerViewTops() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewTopsList = findViewById(R.id.recyclerViewTop);
        recyclerViewTopsList.setLayoutManager(linearLayoutManager);

        ArrayList<ClothesList> clotheslist = new ArrayList<>();
        clotheslist.add(new ClothesList("Haikyuu Top", "popular_1",  9.75));
        clotheslist.add(new ClothesList("Anime Top", "popular_2", 8.75));
        clotheslist.add(new ClothesList("Tokyo Ghoul Bottoms", "popular_8", 5.95));
        clotheslist.add(new ClothesList("Hunter X Hunter Bottoms", "popular_11", 6.50));


        adapter2 = new ClothesAdapter(clotheslist);
        recyclerViewTopsList.setAdapter(adapter2);

    }
}