package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler = findViewById(R.id.house_recycler);
        HouseModel houseModel = new HouseModel() ;


        recycler.setLayoutManager(new LinearLayoutManager(this));
        HouseAdapter adapter = new HouseAdapter(this,houseModel.houses);
        recycler.setAdapter(adapter);
    }
}