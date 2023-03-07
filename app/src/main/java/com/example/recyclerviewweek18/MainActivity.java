package com.example.recyclerviewweek18;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

private ArrayList<ContactPojo> contactPojoArrayList;
private RecyclerViewAdapter adapter;
private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactPojoArrayList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        contactPojoArrayList.add(new ContactPojo("Rahul Kumar","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Sitaram Theeng ","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Arjun Thapa","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Renuka Raut","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Hari Gautam","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Rabindra Giri","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Mathura Aryal","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Jeevan Thapa","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Rubina Acharya","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Roshan Singh","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Bashant Thapa","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Sabina Sunawar","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Binod Thapa Magar","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Anu Thapa Magar","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Shiva sharma","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Kumari thapa","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Kabita Tamang","9823852056"));
        contactPojoArrayList.add(new ContactPojo(" Aashish Khatri","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Samjhana Chhetri","9823852056"));
        contactPojoArrayList.add(new ContactPojo("Ajay K.C","9823852056"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapter(contactPojoArrayList,this);
        recyclerView.setAdapter(adapter);



    }


}