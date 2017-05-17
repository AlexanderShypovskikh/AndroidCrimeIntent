package com.example.crimeintent;


import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

/**
 * Created by Пользователь on 08.02.2017.
 */

public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;

    @Override
    public void onCreate(Bundle saveInstanceState){
            super.onCreate(saveInstanceState);
            mCrime = new Crime();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle saveInstanceState){
          View view = inflater.inflate(R.layout.crime_fragment,parent, false);
        mDateButton = (Button)view.findViewById(R.id.crime_date);
        mDateButton.setText(mCrime.getmDate().toString());
        mDateButton.setEnabled(false);
          mTitleField = (EditText)view.findViewById(R.id.crime_title);
          mTitleField.addTextChangedListener(new TextWatcher(){
              @Override
              public void beforeTextChanged(CharSequence s, int start, int count, int after) {

              }

              public void onTextChanged(CharSequence c, int start, int before, int count){
                  mCrime.setmTitle(c.toString());
              }

              @Override
              public void afterTextChanged(Editable s) {

              }


          });
        mSolvedCheckBox = (CheckBox)view.findViewById(R.id.crime_solved);
        mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
               // Назначение флага раскрытия преступления
                mCrime.setmSolved(isChecked);
            }
        });
           return view;
    }
}
