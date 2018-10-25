package com.example.mapdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.mapdemo.Adapter.GroupAdapter;
import com.example.mapdemo.Adapter.MessageAdapter;
import com.example.mapdemo.Listener.MessageListener;

public class MessageActivity extends AppCompatActivity {
    Toolbar tl;
    RecyclerView rv_message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        tl = findViewById(R.id.toolbar_message);

        tl.setNavigationIcon(R.mipmap.icon_back);
        tl.setNavigationOnClickListener(new MessageListener(this));

        rv_message = findViewById(R.id.rv_message);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this );
        rv_message.setLayoutManager(layoutManager);
        layoutManager.setOrientation(OrientationHelper.VERTICAL);
        rv_message.setAdapter(new MessageAdapter());
        rv_message.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }
}
