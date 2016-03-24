package com.example.bonnie.crimeactivity;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Bonnie on 3/3/2016.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime () {

        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }
    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }



}
