package com.cosmas.cosmas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);


        String [] myCourses={"Mobile programming  by Richard Kimera","Database Programming by  Mwavu Rodgers"
                ,"Business Intelligence by Aaron Atuhe","Software Engineering by Munguci Gloria",
                "Clent/Server programming for Applications by Aambrose Atuheire","Graphics and Modelling by Richard Ntwali",
                "Research Methods by Wilison Tumuhimbise"
        };

        ListAdapter myAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myCourses);
        ListView mv=(ListView)findViewById(R.id.mylistt);
        mv.setAdapter(myAdapter);
    }
}
