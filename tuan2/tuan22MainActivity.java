package com.example.firstapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.firstapplication.R;

public class tuan22MainActivity extends AppCompatActivity {
    ListView lv;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);
        lv=findViewById(R.id.tuan22Listview);
        //nguon du lieu
        String[] arr=new String[]{"Mon1","Tuan 2","Mon3","Mon4","Tuan5","item6","Tuan7","Tuan8"};
        //adapter
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
        // hien thi listview
        lv.setAdapter(adapter);
    }
}