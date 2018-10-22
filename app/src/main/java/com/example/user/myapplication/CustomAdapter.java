package com.example.user.myapplication;

import android.content.ClipData;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Item>{
    private int resourceLayout;
    private Context mContext;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<Item> objects) {
        super(context, resource, objects);
        this.resourceLayout = resource;
        this.mContext = context;
    }


    public View getView(int position, View convertView, ViewGroup parent){
        View V = convertView;
        if (V == null)
            V = LayoutInflater.from(mContext).inflate(resourceLayout,parent,false);

        Item p = getItem(position);

        if (p != null){
            TextView tvName = (TextView) V.findViewById(R.id.tvName);
            tvName.setText(p.getNmae());

            ImageView imageView = (ImageView) V.findViewById(R.id.imageView);
            imageView.setImageResource(p.getImage());

        }
        return V;

    }
}