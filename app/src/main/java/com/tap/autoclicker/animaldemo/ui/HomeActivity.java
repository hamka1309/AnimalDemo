package com.tap.autoclicker.animaldemo.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.tap.autoclicker.animaldemo.R;
import com.tap.autoclicker.animaldemo.adapter.ShowSpeciesAdapter;
import com.tap.autoclicker.animaldemo.model.FavoritesModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView mRccHome;
    private ShowSpeciesAdapter mAdapter;
    private ArrayList<FavoritesModel> mArrHome;

    private LinearLayout mLnFish,mLnBird,mLnReptile,mLnMammals;
    private Button mBtFavorites;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        event();
        addReCycLerView();
    }

    private void addReCycLerView() {
        mArrHome=new ArrayList<>();
        mArrHome.add(new FavoritesModel("1",R.drawable.bird,2,2,"Đại Bàng","Chim ăn thịt"));
        mArrHome.add(new FavoritesModel("2",R.drawable.bird,1,2,"Chim bồ câu","Chim Ăn tạp"));

        mRccHome.setHasFixedSize(true);

        LinearLayoutManager linearLayout = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRccHome.setLayoutManager(linearLayout);

        mAdapter = new ShowSpeciesAdapter(mArrHome, getApplicationContext());
        mRccHome.setAdapter(mAdapter);
    }

    private void event() {
        mBtFavorites.setOnClickListener(this);
        mLnBird.setOnClickListener(this);
        mLnFish.setOnClickListener(this);
        mLnReptile.setOnClickListener(this);
        mLnMammals.setOnClickListener(this);
    }

    private void initView() {
        intent=new Intent(HomeActivity.this,ShowSpeciesActivity.class);
        mBtFavorites=findViewById(R.id.btSave);
        mLnBird=findViewById(R.id.lnBird);
        mLnFish=findViewById(R.id.lnFish);
        mLnReptile=findViewById(R.id.lnReptile);
        mLnMammals=findViewById(R.id.lnMammals);
        mRccHome=findViewById(R.id.rccHome);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btSave:
                startActivity(intent);
                break;
            case R.id.lnBird:
                startActivity(intent);
                break;
            case R.id.lnFish:
                startActivity(intent);
                break;
            case R.id.lnReptile:
                startActivity(intent);
                break;
            case R.id.lnMammals:
                startActivity(intent);
                break;
        }
    }
}
