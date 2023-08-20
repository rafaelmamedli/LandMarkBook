package com.rafael.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rafael.landmarkbookjava.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {


    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        Singleton singleton = Singleton.getInstance();
        LandMark clickedLandmark = singleton.getSentLandmark();


        binding.nameTxt.setText(clickedLandmark.name);
        binding.countryTxt.setText(clickedLandmark.country);
        binding.imageView.setImageResource(clickedLandmark.image);


    }
}