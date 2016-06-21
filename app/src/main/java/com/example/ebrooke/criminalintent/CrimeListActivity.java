package com.example.ebrooke.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by ebrooke on 6/21/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
