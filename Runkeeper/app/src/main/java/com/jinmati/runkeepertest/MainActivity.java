package com.jinmati.runkeepertest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int totalPages = 0;
    int currentPage = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout mainActivityLayout = (LinearLayout) findViewById(R.id.linearLayoutMain);
        this.setTitle("Achievements");

        //Get Data to render grid view.
        ArrayList<Sports> runkeeperArrayList = getSportData();

        //Calculate total number of pages.
        totalPages = (runkeeperArrayList.size() + 6 - 1) / 6;

        //Set text view for pagination.
        TextView totalPagesText = (TextView) findViewById(R.id.totalPage);
        totalPagesText.setText(Integer.toString(totalPages));
        TextView currentPageText = (TextView) findViewById(R.id.currentPage);

        //Create gridView and render on layout.
        GridView runkeeperGridView =  new GridViewFactory(this).createGridView(runkeeperArrayList, mainActivityLayout);

        //On click listener for action on grid view cell.
        runkeeperGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent i = new Intent(getApplicationContext(), VirtualActivity.class);
                startActivity(i);
            }
        });

        //On Scroll Listener for getting visible item count.
        runkeeperGridView.setOnScrollListener(new AbsListView.OnScrollListener() {

            @Override
            public void onScrollStateChanged(AbsListView absListView, int i) {
                currentPageText.setText(Integer.toString(currentPage));
            }

            @Override
            public void onScroll(AbsListView absListView, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                if (totalItemCount > 0) {
                    int lastVisibleItem = firstVisibleItem + visibleItemCount;
                    currentPage = (firstVisibleItem / totalPages) ;
                    System.out.println("HERE currentPage >>>>> "+currentPage);
//                    System.out.println("HERE page >>>>> "+page);
                    System.out.println("HERE numberOfPages >>>>> "+totalPages);
                    System.out.println("HERE lastVisibleItem >>>>> "+lastVisibleItem);
                    System.out.println("HERE firstVisibleItem >>>>> "+firstVisibleItem);
                    System.out.println("HERE visibleItemCount >>>>> "+visibleItemCount);
                    System.out.println("HERE totalItemCount >>>>> "+totalItemCount);
                }
            }
        });
    }

    private ArrayList getSportData() {
        //Create dummy array with model class
        ArrayList<Sports> runkeeperArrayList = new ArrayList<>();
        runkeeperArrayList.add(new Sports( R.drawable.ic_longest_run,"Longest Run","00:00"));
        runkeeperArrayList.add(new Sports( R.drawable.ic_highest_elevation,"Highest Elevation","2095 ft"));
        runkeeperArrayList.add(new Sports( R.drawable.ic_fastest_5k,"Fastest 5K","00:00"));
        runkeeperArrayList.add(new Sports( R.drawable.ic_fastest_10k,"10K","00:00:00"));
        runkeeperArrayList.add(new Sports( R.drawable.ic_fastest_half_marathon,"Half Marathon","00:00"));
        runkeeperArrayList.add(new Sports( R.drawable.ic_fastest_marathon,"Marathon","Not Yet"));

        runkeeperArrayList.add(new Sports( R.drawable.ic_longest_run,"Longest Run","00:00"));
        runkeeperArrayList.add(new Sports( R.drawable.ic_highest_elevation,"Highest Elevation","2095 ft"));
        runkeeperArrayList.add(new Sports( R.drawable.ic_fastest_5k,"Fastest 5K","00:00"));
        runkeeperArrayList.add(new Sports( R.drawable.ic_fastest_10k,"10K","00:00:00"));
        runkeeperArrayList.add(new Sports( R.drawable.ic_fastest_half_marathon,"Half Marathon","00:00"));
        runkeeperArrayList.add(new Sports( R.drawable.ic_fastest_marathon,"Marathon","Not Yet"));

        return  runkeeperArrayList;
    }
}