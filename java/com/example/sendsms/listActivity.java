package com.example.sendsms;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listActivity extends AppCompatActivity {
    ListView listView;
    String countries[];
    ArrayAdapter<String> adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.list);
        countries=getResources().getStringArray(R.array.countries);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countries);
        listView.setAdapter(adapter);
    }
}