package com.jinmati.runkeepertest;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

public class GridViewFactory {

    Context context;

    public GridViewFactory(Context context){
        this.context=context;
    }

    public GridView createGridView(ArrayList<Sports> gridViewDataArray, LinearLayout layout) {
        //CREATING THE LAYOUT THROUGH CODE
        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT);
        GridView runkeeperGridView = new GridView(context);
        runkeeperGridView.setNumColumns(2);
        runkeeperGridView.setLayoutParams(new ViewGroup.LayoutParams(MATCH_PARENT,
                MATCH_PARENT));
        GridViewRowAdapter mainAdapter = new GridViewRowAdapter(context, gridViewDataArray);
        runkeeperGridView.setAdapter(mainAdapter);
        layout.addView(runkeeperGridView);
        return runkeeperGridView;
    }

}
