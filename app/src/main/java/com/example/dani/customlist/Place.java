package com.example.dani.customlist;

/**
 * Created by Dani on 3/10/2018.
 */

public class Place {

    public String mNameofPlace;
    public int mZipCode;
    public String mNameOfImage;
    public String mPopup;

    public Place(String startNameofPlace, int startZipCode, String startNameOfImage, String startPopup) {
        this.mNameofPlace = startNameofPlace;
        this.mZipCode = startZipCode;
        this.mNameOfImage = startNameOfImage;
        this.mPopup = startPopup;
    }
}
