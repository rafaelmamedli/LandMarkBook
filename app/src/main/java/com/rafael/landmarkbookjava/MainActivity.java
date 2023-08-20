package com.rafael.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.rafael.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    ArrayList<LandMark> landMarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        landMarkArrayList = new ArrayList<>();


        LandMark pisa = new LandMark("Pisa", "Italy", R.drawable.pisa);
        LandMark eiffel = new LandMark("Eiffel", "France", R.drawable.eiffel);
        LandMark colosseum = new LandMark("Colosseum", "Italy", R.drawable.coliseum);
        LandMark londonBridge = new LandMark("London Bridge", "England", R.drawable.londongbridge);


        landMarkArrayList.add(pisa);
        landMarkArrayList.add(eiffel);
        landMarkArrayList.add(colosseum);
        landMarkArrayList.add(londonBridge);
        landMarkArrayList.add(pisa);
        landMarkArrayList.add(eiffel);
        landMarkArrayList.add(colosseum);
        landMarkArrayList.add(londonBridge);
        landMarkArrayList.add(pisa);
        landMarkArrayList.add(eiffel);
        landMarkArrayList.add(colosseum);
        landMarkArrayList.add(londonBridge);
        landMarkArrayList.add(pisa);
        landMarkArrayList.add(eiffel);
        landMarkArrayList.add(colosseum);
        landMarkArrayList.add(londonBridge);
        landMarkArrayList.add(londonBridge);
        landMarkArrayList.add(pisa);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter(landMarkArrayList);
        binding.recyclerView.setAdapter(adapter);


    }
}