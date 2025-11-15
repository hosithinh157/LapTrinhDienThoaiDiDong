package com.example.bttablayout_viewpager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

    List<String> data;

    public ItemAdapter(List<String> data) {
        this.data = data;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgItem;
        TextView txtTitle;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgItem = itemView.findViewById(R.id.imgItem);
            txtTitle = itemView.findViewById(R.id.txtTitle);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtTitle.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
