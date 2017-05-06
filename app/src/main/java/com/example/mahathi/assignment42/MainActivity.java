package com.example.mahathi.assignment42;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import com.example.mahathi.assignment42.beans.CustomHandler;
import com.example.mahathi.assignment42.adapters.CustomAdapter;

public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemClickListener{

    ListView list;
    String name[]=new String[]{"Name1","Name2","Name3","Name4","Name5","Name6","Name7"};
    String phneNo[]=new String[]{"PhneNumber1","PhneNumber2","PhneNumber3","PhneNumber4","PhneNumber5","PhneNumber6","PhneNumber7"};
    ArrayList<CustomHandler> model = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.list);
        //Setting the name and phne number to customhandler and setting the adapter
        for (int i = 0; i < name.length; i++) {
            CustomHandler handler = new CustomHandler();
            handler.setName(name[i]);
            handler.setPhneNo(phneNo[i]);
            model.add(handler);
            CustomAdapter adapter = new CustomAdapter(this, model);
            list.setAdapter(adapter);
            list.setOnItemClickListener(this);

        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,name[position], Toast.LENGTH_SHORT).show();
    }
}
