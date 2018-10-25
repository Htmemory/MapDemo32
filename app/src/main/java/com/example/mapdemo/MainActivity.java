package com.example.mapdemo;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mapdemo.Adapter.GroupAdapter;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    RecyclerView rv_index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_index = findViewById(R.id.rv_index);


        toolbar = findViewById(R.id.toolbar_index);
        toolbar.setTitle("");
        toolbar.setNavigationIcon(R.mipmap.icon_user_phone);
        LinearLayout ll=findViewById(R.id.ll_01);
        ll.setOnClickListener(this);
        TextView tv = findViewById(R.id.tv_search_group);
        tv.setOnClickListener(this);

        toolbar.setNavigationOnClickListener(this);
        toolbar.inflateMenu(R.menu.main_menu);
        Resources rs  =getResources();
        Drawable drawable = rs.getDrawable(R.drawable.icon_add);
        toolbar.setOverflowIcon(drawable);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this );
        rv_index.setLayoutManager(layoutManager);
        layoutManager.setOrientation(OrientationHelper.VERTICAL);
        rv_index.setAdapter(new GroupAdapter());
        rv_index.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }

    @Override
    public void onClick(View v) {
        System.out.println("点击了头像");
        switch (v.getId()){
            case R.id.ll_01:
                Intent i = new Intent(this,MessageActivity.class);
                startActivity(i);
                break;
            case R.id.tv_search_group:
                Intent i2 = new Intent(this,SearchActivity.class);
                startActivity(i2);
                break;
        }
    }
}
