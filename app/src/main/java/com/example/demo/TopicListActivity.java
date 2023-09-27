package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class TopicListActivity extends AppCompatActivity implements TopicListner{
    ArrayList<TopicModel> arr;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_list);
        arr=new ArrayList<>();
        recyclerView = findViewById(R.id.topicrecycleview);
        setdata();
        setAdapter();
    }

     void setAdapter(){
        RecycleTopicAdapter adapter = new RecycleTopicAdapter(this, arr,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
    void setdata(){
        arr.add(new TopicModel("hghsvc","bvsvcgvgxv"));
        arr.add(new TopicModel("djjbcuj","ncjudbuc"));
        arr.add(new TopicModel("bchjbdhc","ncjdbjc"));
        arr.add(new TopicModel("ncjdbc","ncidcjdbcjhd"));
        arr.add(new TopicModel("cjbdhcbhd","ncjhdbhc"));
        arr.add(new TopicModel("bchdbchdc","njsbchhvcd"));
        Log.i("array","all data enter");
    }

    @Override
    public void onItemClick(TopicModel tm) {
        Intent intent = new Intent(this,TopicActivity.class);
        intent.putExtra("Name",tm.name);
        intent.putExtra("description",tm.description);
        //Toast.makeText(this,tm.name,Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}