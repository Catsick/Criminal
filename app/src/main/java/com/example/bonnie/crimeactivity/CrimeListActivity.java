package com.example.bonnie.crimeactivity;

import android.support.v4.app.Fragment;

/**
 * Created by Bonnie on 3/23/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListActivity();
    }

}
