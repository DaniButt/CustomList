package com.example.dani.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Place[] mPlacesArray = new Place[]{
            new Place("Art House",78701,"art","This place is tasteful"),
            new Place("Car Shop",78702,"bike","Cool bikes"),
            new Place("DSLR Fix",72703,"polaroids","These guys always rip me off"),
            new Place("Wet Space",72704,"radio","I Love this place"),
            new Place("Ant House",78711,"ant","This place is tasteful"),
            new Place("Truck Shop",78722,"truck","Cool bikes"),
            new Place("Digital Fix",72733,"digital","These guys always rip me off"),
            new Place("Met Space",72744,"Met","I Love this place"),
            new Place("Art House",78701,"art","This place is tasteful"),
            new Place("Car Shop",78702,"bike","Cool bikes"),
            new Place("DSLR Fix",72703,"polaroids","These guys always rip me off"),
            new Place("Wet Space",72704,"radio","I Love this place"),
            new Place("Ant House",78711,"ant","This place is tasteful"),
            new Place("Truck Shop",78722,"truck","Cool bikes"),
            new Place("Digital Fix",72733,"digital","These guys always rip me off"),
            new Place("Met Space",72744,"Met","I Love this place"),

    };
    String[] myStringArray = new String[]{

            "Art House",
            "Bike Shop",
            "Camera Fix",
            "Yet Space",
            "Secret Space Pad",
            "Taylor's Tailor",
            "Boathouse",
            "Not Apple Store",
            "Tool Battleground",
            "Travelpediocity",
            "UFO Pick-a-Part",
            "Spawk's House",
            "Freak's House",

    };
    ListView myListview;

    private ArrayAdapter mArrayAdapter;
    private PlaceAdapter mPlaceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListview =(ListView)findViewById(R.id.myListVeiw);
        mPlaceAdapter = new PlaceAdapter(getApplicationContext(),R.layout.row,mPlacesArray);

        if(myListview!=null){
            myListview.setAdapter(mPlaceAdapter);
        }

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,View view,int i ,long l) {
                Log.v("Place",mPlacesArray[i].mNameofPlace);

            }
        });


    }
}
