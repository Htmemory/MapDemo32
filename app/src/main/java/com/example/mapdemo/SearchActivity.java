package com.example.mapdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.mapdemo.Listener.MessageListener;

public class SearchActivity extends AppCompatActivity {
    Toolbar tl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        tl = findViewById(R.id.toolbar_searchh);

        tl.setNavigationIcon(R.mipmap.icon_back);
        tl.setNavigationOnClickListener(new MessageListener(this));


    }
}
