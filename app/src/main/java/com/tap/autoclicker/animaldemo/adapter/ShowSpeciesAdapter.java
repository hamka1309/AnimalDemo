package com.tap.autoclicker.animaldemo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.tap.autoclicker.animaldemo.R;
import com.tap.autoclicker.animaldemo.model.FavoritesModel;
import com.tap.autoclicker.animaldemo.utils.OnClickSpecies;

import java.util.ArrayList;

public class ShowSpeciesAdapter extends RecyclerView.Adapter<ShowSpeciesAdapter.ViewHolder> {
    private ArrayList<FavoritesModel> mArrSpecies;
    private Context context;
    private OnClickSpecies setOnClick;

    public ShowSpeciesAdapter(ArrayList<FavoritesModel> mArrSpecies, Context context) {
        this.mArrSpecies = mArrSpecies;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_show_species,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.imgAvatar.setImageResource(mArrSpecies.get(i).getmImage());
        viewHolder.txtName.setText(mArrSpecies.get(i).getmName());
        viewHolder.txtAge.setText(mArrSpecies.get(i).getmAge()+"");
        viewHolder.txtSize.setText(mArrSpecies.get(i).getmSize()+"");
    }

    @Override
    public int getItemCount() {
        return mArrSpecies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgAvatar;
        private TextView txtName,txtAge,txtSize;
        private CheckBox cbFavorites;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAvatar=itemView.findViewById(R.id.imgAvatar);
            txtName=itemView.findViewById(R.id.txtName);
            txtSize=itemView.findViewById(R.id.txtSize);
            txtAge=itemView.findViewById(R.id.txtAge);
            cbFavorites=itemView.findViewById(R.id.cbFavourite);
            cbFavorites.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });
        }
    }
}
