package com.example.crimeintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Пользователь on 08.02.2017.
 */

public class Crime {
    private  String mTitle;
    private UUID mId;
    private Date mDate;
    private boolean mSolved;

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    @Override
    public String toString(){
        return mTitle;
    }
}
