package com.example.mapdemo.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mapdemo.R;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder> {
    String[] messages={"消息1","消息2","消息3"};
    String[] time = {"5：00 pm" ,"7:00 pm","10:00 pm"};

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_message, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.messageContent.setText(messages[position]);
        holder.time.setText(time[position]);
    }



    @Override
    public int getItemCount() {
        return messages.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView messageContent;
        public TextView time;

        public ViewHolder(View v) {
            super(v);
            // 在创建的时候利用传递过来的View去findViewById

            messageContent =  itemView.findViewById(R.id.message_tv_content);
            time = itemView.findViewById(R.id.message_tv_time);
        }
    }

}