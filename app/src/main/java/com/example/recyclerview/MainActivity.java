package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private List<Product>productList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productList.add(new Product("1","Product1",R.mipmap.ic_launcher));
        productList.add(new Product("2","Product2",R.mipmap.ic_launcher));
        productList.add(new Product("3","Product4",R.mipmap.ic_launcher));
        RecyclerView recyclerView=findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(new MyAdapter(this,productList));
    }
}
