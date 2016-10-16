package com.example.android.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] phones = {
                            "Nokia",
                            "Samsung",
                            "Apple",
                            "Motorola",
                            "Lenovo",
                            "Xiaomi",
                            "LG",
                            "Oppo",
                            "Micromax",
                            "Intex",
                            "Karbonn",
                            "Vivo",
                            "Xolo",
                            "LYF"   };

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,phones);
        listView.setAdapter(adapter);


    }

}
