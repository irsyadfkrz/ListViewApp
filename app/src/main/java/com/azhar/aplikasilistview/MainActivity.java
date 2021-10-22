package com.azhar.aplikasilistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Mendeklarasikan list view var dan menginisialasi array tipe data string
   private ListView lvItem;
   private String[] namanegara = new String[]{
           "Indonesia","Malaysia","Singapura",
           "Jepang","Thailand","Vietnam",
           "Inggris","Jerman",
           "Brunei","Amerika"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("ListView Sederhana"); //judul

        //Membinding atau memformat data
        lvItem = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, namanegara);

        //Menset data di dalam list view
        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Toast.makeText(MainActivity.this, "Memilih: "+namanegara[position], Toast.LENGTH_LONG).show();

            }
        });

    }
}