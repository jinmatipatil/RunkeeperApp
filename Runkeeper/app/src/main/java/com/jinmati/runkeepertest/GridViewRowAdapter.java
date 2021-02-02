package com.jinmati.runkeepertest;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.core.content.ContextCompat;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class GridViewRowAdapter extends BaseAdapter {

    Context context;
    ArrayList<Sports> arrayList;

    public GridViewRowAdapter(Context context, ArrayList<Sports> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView ==  null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_row_gridview, parent, false);
        }

        TextView textViewName = (TextView) convertView.findViewById(R.id.textView);
        ImageView imageViewRunkeeper = (ImageView) convertView.findViewById(R.id.image_view);
        TextView textViewTime = (TextView) convertView.findViewById(R.id.textViewtime);
        textViewName.setText(arrayList.get(position).getSportsName());
        textViewTime.setText(arrayList.get(position).getSportsTime());
        imageViewRunkeeper.setImageResource(arrayList.get(position).getSportsImage());
        return convertView;
    }
}
