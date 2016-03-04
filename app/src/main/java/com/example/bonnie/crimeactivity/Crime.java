package com.example.bonnie.crimeactivity;

import java.util.UUID;

/**
 * Created by Bonnie on 3/3/2016.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime () {
        mId = UUID.randomUUID();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }


}
