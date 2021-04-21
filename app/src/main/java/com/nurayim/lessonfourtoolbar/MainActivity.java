package com.nurayim.lessonfourtoolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainAdapter adapter;
    private ArrayList<String> list;
    private ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createList();
        initRecycler();
        imageView = findViewById(R.id.image_view);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),SecondActivity2.class);
                startActivity(intent);

            }
        });


    }


    private void createList() {
        list = new ArrayList<>();
        list.add("Нарине");
        list.add("Бекназар");
        list.add("Акназар");
        list.add("Асель");
        list.add("Бекжан");
        list.add("Нурсултан");
        list.add("Айдай ");
        list.add("Нарине");
        list.add("Нарине");
    }

    private void initRecycler() {

        recyclerView = findViewById(R.id.recycler);
        adapter = new MainAdapter();
        adapter.addList(list);
        recyclerView.setAdapter(adapter);



    }


}