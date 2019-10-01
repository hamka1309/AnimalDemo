package com.tap.autoclicker.animaldemo.model;

public class FavoritesModel {
    private int mImage,mAge,mSize;
    private String id,mName,mSpecies;

    public FavoritesModel(String id,int mImage, int mAge, int mSize, String mName, String mSpecies) {
        this.id=id;
        this.mImage = mImage;
        this.mAge = mAge;
        this.mSize = mSize;
        this.mName = mName;
        this.mSpecies = mSpecies;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public int getmSize() {
        return mSize;
    }

    public void setmSize(int mSize) {
        this.mSize = mSize;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmSpecies() {
        return mSpecies;
    }

    public void setmSpecies(String mSpecies) {
        this.mSpecies = mSpecies;
    }
}
