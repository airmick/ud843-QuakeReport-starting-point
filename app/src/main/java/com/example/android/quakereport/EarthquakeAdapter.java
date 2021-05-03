package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    /**
     * Constructor
     *
     * @param context  The current context.
     * @param earthquakeArrayList  The objects to represent in the ListView.
     */
    public EarthquakeAdapter(@NonNull Context context, ArrayList<Earthquake> earthquakeArrayList) {
        super(context, 0, earthquakeArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Earthquake} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        TextView magTextView = listItemView.findViewById(R.id.magnitude_textView_id);
        magTextView.setText(currentEarthquake.getMag());

        TextView placeTextView = listItemView.findViewById(R.id.place_textView_id);
        placeTextView.setText(currentEarthquake.getPlaces());

        TextView dateTextView = listItemView.findViewById(R.id.date_textView_id);
        dateTextView.setText(currentEarthquake.getDate());

        return listItemView;
    }
}
