package com.example.crimeintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

/**
 * Created by Пользователь on 16.05.2017.
 */

public class CrimePagerActivity extends FragmentActivity {
     ViewPager mViewPager;
     private ArrayList<Crime> mCrimes;

     @Override
    protected void onCreate(Bundle saveInstanceState){
         super.onCreate(saveInstanceState);
         mViewPager = new ViewPager(this);
         mViewPager.setId(R.id.viewPager);
         setContentView(mViewPager);

         mCrimes = CrimeLab.get(this).getCrimes();
         FragmentManager fm = getSupportFragmentManager();
         mViewPager.setAdapter(new FragmentStatePagerAdapter() {
             @Override
             public Fragment getItem(int position) {
                 Crime crime = mCrimes.get(position);

                 return CrimeFragment.newInstance(crime.getmId());
             }

             @Override
             public int getCount() {
                 return mCrimes.size();
             }
         });
     }

}
