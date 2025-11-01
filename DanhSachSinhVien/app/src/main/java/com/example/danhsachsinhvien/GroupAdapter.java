package com.example.danhsachsinhvien;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.GroupViewHolder> {
    List<Group> groupList;

    public GroupAdapter(List<Group> groupList) {
        this.groupList = groupList;
    }

    @NonNull
    @Override
    public GroupAdapter.GroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new GroupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GroupAdapter.GroupViewHolder holder, int position) {
        Group group = groupList.get(position);
        holder.txtName.setText(group.getGroupName());
        holder.txtScore.setText(String.valueOf(group.getScore()));
        holder.txtFandom.setText("Fandom: " + group.getFandom());
        holder.imageView.setImageResource(group.getImageResource());

    }

    @Override
    public int getItemCount() {
        return groupList.size();
    }
    static class GroupViewHolder extends RecyclerView.ViewHolder{
        TextView txtName, txtScore, txtFandom;
        ImageView imageView;

        public GroupViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtScore = itemView.findViewById(R.id.txtScore);
            txtFandom = itemView.findViewById(R.id.txtFandom);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
