package com.example.mapdemo.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mapdemo.R;

import java.util.List;

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.ViewHolder> {
    String[] ss={"群1","群2","群3"};
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_group, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.groupNameTv.setText(ss[position]);
    }



    @Override
    public int getItemCount() {
        return ss.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView groupNameTv;

        public ViewHolder(View v) {
            super(v);
            // 在创建的时候利用传递过来的View去findViewById

            groupNameTv =  itemView.findViewById(R.id.recycler_group_name);
        }
    }

}
