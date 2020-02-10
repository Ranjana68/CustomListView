package com.example.lenovo.customlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String> {
    Activity activity;
    String text[];
    Integer pics[];

    public  MyAdapter(Activity activity,String text[],Integer pics[]) //error
    {
        super(activity,R.layout.custom_layout,text); //calls getview
        this.activity=activity;
        this.text=text;
        this.pics=pics;

    }


    @Override
    public View getView(int position,View convertView,ViewGroup parent) {

        LayoutInflater inflater=activity.getLayoutInflater();

        View apna_view=inflater.inflate(R.layout.custom_layout,null);

        ImageView iv=apna_view.findViewById(R.id.iv);
        TextView tv=apna_view.findViewById(R.id.tv);
        //for button logic not for design

        iv.setImageResource(pics[position]);
        tv.setText(text[position]);
        return apna_view;
        //return tv;

        //return super.getView(position, convertView, parent);
    }
}
