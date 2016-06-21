package com.example.ebrooke.criminalintent;

import java.util.UUID;

/**
 * Created by ebrooke on 6/20/16.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        // Generate unique identifer
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
