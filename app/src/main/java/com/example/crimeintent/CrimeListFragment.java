package com.example.crimeintent;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Пользователь on 09.02.2017.
 */

public class CrimeListFragment extends ListFragment {
    private static final String TAG = "CrimeListFragment";
  private ArrayList<Crime> mCrimes;
    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        getActivity().setTitle(R.string.crimes_title);
        mCrimes = CrimeLab.get(getActivity()).getCrimes();

        ArrayAdapter<Crime> adapter =
                new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, mCrimes);
        setListAdapter(adapter);

    }

    public void onListItemClick(ListView l, View v, int position, long id ){
        Crime crime = (Crime)(getListAdapter()).getItem(position);
        Log.d(TAG, crime.getmTitle()+"was clicked");

    }


}
