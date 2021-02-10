package com.jinmati.runkeepertest;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class VirtualActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtual);

        LinearLayout virtualActivityLayout = (LinearLayout) findViewById(R.id.linearLayoutVirtual);

        //Get Data to render grid view.
        ArrayList<Sports> arrayList;
        arrayList = new ArrayList<>();
        arrayList.add(new Sports( R.drawable.virtual_half_marathon_race,"Virtual Half Marathon Race","00:00"));
        arrayList.add(new Sports( R.drawable.tokyo_kakone_ekiden,"Tokyo-Hakone Ekiden 2020","00:00:00"));
        arrayList.add(new Sports( R.drawable.virtual_10k_race,"Virtual 10K Race","00:00:00"));
        arrayList.add(new Sports( R.drawable.hakone_ekiden,"Hakone Ekiden","00:00:00"));
        arrayList.add(new Sports( R.drawable.mizuno_singapore_ekiden,"Mizuno Singapore Ekiden 2015","00:00:00"));
        arrayList.add(new Sports( R.drawable.virtual_5k_race,"Virtual 5K Race","23:07"));

        GridViewFactory dynamic = new GridViewFactory(this);
        GridView runkeeperGridView = dynamic.createGridView(arrayList, virtualActivityLayout);

    }
}