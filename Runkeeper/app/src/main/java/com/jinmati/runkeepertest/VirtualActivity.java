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
        arrayList.add(new Sports( R.drawable.ic_longest_run,"Virtual Half Marathon Race","00:00"));
        arrayList.add(new Sports( R.drawable.ic_highest_elevation,"Tokyo-Hakone Ekiden 2020","00:00:00"));
        arrayList.add(new Sports( R.drawable.ic_fastest_5k,"Virtual 10K Race","00:00:00"));
        arrayList.add(new Sports( R.drawable.ic_fastest_10k,"Hakone Ekiden","00:00:00"));
        arrayList.add(new Sports( R.drawable.ic_fastest_half_marathon,"Mizuno Singapore Ekiden 2015","00:00:00"));
        arrayList.add(new Sports( R.drawable.ic_fastest_marathon,"Virtual 5K Race","23:07"));

        GridViewFactory dynamic = new GridViewFactory(this);
        GridView runkeeperGridView = dynamic.createGridView(arrayList, virtualActivityLayout);

    }
}