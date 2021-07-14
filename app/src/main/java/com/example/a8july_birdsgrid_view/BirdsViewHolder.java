package com.example.a8july_birdsgrid_view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class BirdsViewHolder extends RecyclerView.ViewHolder {

    private ItemClickListener itemClickListener;
    private TextView mTvName;
    private ImageView mIvImage;
    private CardView cardView;


    public BirdsViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener =itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvImage = itemView.findViewById(R.id.ivImage);
        cardView = itemView.findViewById(R.id.cardview);
    }

    public void setData(Birds birds){
        mIvImage.setImageResource(birds.getImage());
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.OnitemClicked(birds);
            }
        });

    }
}
