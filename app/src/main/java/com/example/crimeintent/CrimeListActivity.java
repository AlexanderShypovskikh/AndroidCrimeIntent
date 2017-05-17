package com.example.crimeintent;

import android.support.v4.app.Fragment;

/**
 * Created by Пользователь on 09.02.2017.
 */

public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
