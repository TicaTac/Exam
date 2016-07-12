package com.clm.exam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList <student> studentsArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentsArray = new ArrayList<>();

        studentsArray.add(new student("Moshe",95));
        studentsArray.add(new student("Sarit",57));
        studentsArray.add(new student("David",75));

        ListView studentLV = (ListView) findViewById(R.id.listView);
        studentListAdapter listAdapter = new studentListAdapter(this,R.layout.list_item_1,studentsArray);
        studentLV.setAdapter(listAdapter);






    }
}
