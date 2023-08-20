package com.rafael.landmarkbookjava;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rafael.landmarkbookjava.databinding.LayoutLandmarkBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    public Adapter(ArrayList<LandMark> landMarkArrayList) {
        this.landMarkArrayList = landMarkArrayList;
    }

    ArrayList<LandMark> landMarkArrayList;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutLandmarkBinding layoutLandmarkBinding = LayoutLandmarkBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(layoutLandmarkBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.binding.textView.setText(landMarkArrayList.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                Singleton singleton = Singleton.getInstance();
                singleton.setSentLandmark(landMarkArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return landMarkArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private LayoutLandmarkBinding binding;

        public ViewHolder(LayoutLandmarkBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


}
