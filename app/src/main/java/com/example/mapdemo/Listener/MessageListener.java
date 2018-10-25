package com.example.mapdemo.Listener;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.mapdemo.MainActivity;
import com.example.mapdemo.MessageActivity;

public class MessageListener implements View.OnClickListener {
    Context context;
    public MessageListener(Context context){
        this.context=context;
    }
    @Override
    public void onClick(View v) {
        Intent i = new Intent(context,MainActivity.class);
        context.startActivity(i);
    }
}
