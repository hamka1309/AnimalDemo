package com.tap.autoclicker.animaldemo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.tap.autoclicker.animaldemo.R;
import com.tap.autoclicker.animaldemo.adapter.ShowSpeciesAdapter;
import com.tap.autoclicker.animaldemo.model.FavoritesModel;

import java.util.ArrayList;

public class ShowSpeciesActivity extends AppCompatActivity {
    private RecyclerView mRccSpecies;
    private ShowSpeciesAdapter mAdapter;
    private ArrayList<FavoritesModel>mArrSpecies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_species);
        initView();
        event();

    }

    private void event() {
    }

    private void initView() {
        mArrSpecies=new ArrayList<>();
        mRccSpecies=findViewById(R.id.rccShowSpecies);
    }
}
