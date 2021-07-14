package com.example.a8july_birdsgrid_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    private ArrayList<Birds> birdsArrayList;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildData();
        setRecyclerViewData();


    }

    private void setRecyclerViewData() {
        BirdsAdapter birdsAdapter = new BirdsAdapter(this,birdsArrayList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,4);
        recyclerView.setAdapter(birdsAdapter);
        recyclerView.setLayoutManager(gridLayoutManager);

    }

    private void buildData() {
        birdsArrayList = new ArrayList<>();
        for(int i=0; i<100; i++){
            if(i%4==0){
                birdsArrayList.add(new Birds("Red Sparrow",R.drawable.bird1));
            }else if(i%4==1){
                birdsArrayList.add(new Birds("Yellow Sparrow",R.drawable.bird2));
            }else if(i%4==2){
                birdsArrayList.add(new Birds("Yellow and White Sparrow", R.drawable.bird3));
            }else {
                birdsArrayList.add(new Birds("Toucan", R.drawable.bird4));

            }
        }
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerview);
    }

    @Override
    public void OnitemClicked(Birds birds) {
        Toast.makeText(this,"Bird name is "+birds.getName(),Toast.LENGTH_SHORT).show();

    }
}