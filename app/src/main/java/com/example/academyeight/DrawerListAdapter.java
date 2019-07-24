package com.example.academyeight;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DrawerListAdapter extends BaseAdapter
{
    private static LayoutInflater inflater=null;
    private ArrayList<String> titles;

    DrawerListAdapter(Activity activity, ArrayList<String> titles)
    {
        this.titles = titles;
        inflater = ( LayoutInflater )activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount()
    {
        return titles.size();
    }

    @Override
    public Object getItem(int position)
    {
        return position;
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    public class Holder
    {
        TextView tv_title;
        ImageView im_icon;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(final int position, View convertView, ViewGroup parent)
    {
        Holder holder=new Holder();
        View view;
        view = inflater.inflate(R.layout.layout_drawer_item, null);

        holder.tv_title = view.findViewById(R.id.tv_title);
        holder.im_icon = view.findViewById(R.id.im_icon);
        holder.tv_title.setText(titles.get(position));

        return view;
    }

}