package com.sonia.timestable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text = findViewById(R.id.newNumber);
        Button addBtn = findViewById(R.id.addBtn);

        ArrayList<String> listData = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                listData
        );

        ListView list = findViewById(R.id.listTest);
        list.setAdapter(adapter);

        addBtn.setOnClickListener(
                v->{
                    int timesNumber = Integer.parseInt(text.getText().toString());
                    for(int i = 1; i <= 10; i++){
                        listData.add(String.valueOf(i*timesNumber));
                    }
                    adapter.notifyDataSetChanged();
                }
        );
    }
}