package com.example.dani.customlist;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Dani on 3/10/2018.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    Context mContext;
    int mLayoutResourceID;
    Place mData[] = null;


    public PlaceAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull Place[] data) {
        super(context, resource, data);

        this.mContext = context;
        this.mData = data;
        this.mLayoutResourceID = resource;
    }


    @Nullable
    @Override
    public Place getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        //inflate the layout for a single row

        LayoutInflater inflater = LayoutInflater.from(mContext);
        row = inflater.inflate(mLayoutResourceID,parent,false);

//      get a refernece to the  differentview element we wish to update

        TextView nameView =(TextView)row.findViewById(R.id.nameTextView);
        TextView zipView=(TextView)row.findViewById(R.id.zipcodetext);
        ImageView imageView=(ImageView)row.findViewById(R.id.imageView);



        //get the data from the array

        Place place = mData[position];

        //setting the view to reflect the data we need to display

        nameView.setText(place.mNameofPlace);
        zipView.setText(String.valueOf(place.mZipCode));

        int resId = mContext.getResources().getIdentifier(place.mNameOfImage,"drawable",mContext.getPackageName());
        imageView.setImageResource(resId);
         return row;
    }

}













