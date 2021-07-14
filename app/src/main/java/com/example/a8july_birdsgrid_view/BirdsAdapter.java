package com.example.a8july_birdsgrid_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BirdsAdapter extends RecyclerView.Adapter<BirdsViewHolder> {

    public BirdsAdapter(ItemClickListener itemClickListener, ArrayList<Birds> birdsArrayList) {
        this.itemClickListener = itemClickListener;
        this.birdsArrayList = birdsArrayList;
    }

    private ItemClickListener itemClickListener;
    private ArrayList<Birds> birdsArrayList;
    @NonNull
    @Override
    public BirdsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new BirdsViewHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull BirdsViewHolder holder, int position) {
        Birds birds = birdsArrayList.get(position);
        holder.setData(birds);

    }

    @Override
    public int getItemCount() {
        return birdsArrayList.size();
    }
}
