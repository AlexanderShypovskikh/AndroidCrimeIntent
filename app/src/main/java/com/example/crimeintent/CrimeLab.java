package com.example.crimeintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Пользователь on 09.02.2017.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private Context mAppContext;
    private ArrayList<Crime> mCrimes;

    private CrimeLab(Context appContext){
        mAppContext = appContext;
     for(int i = 0; i < 100; i++){
         Crime c = new Crime();
         c.setmTitle("Crime #"+i);
         c.setmSolved(i%2 == 0);
         mCrimes.add(c);
     }
    }

    public static CrimeLab get(Context c){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }

    public ArrayList<Crime>getCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for(Crime c:mCrimes){
            if(c.getmId().equals(id))
                return c;
        }
        return null;
    }
}
