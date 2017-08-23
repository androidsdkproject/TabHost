package com.example.android1.tabhost;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Android1 on 6/10/2017.
 */

public class  TabsPagerAdapter extends FragmentPagerAdapter
{

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {
        switch (index)
        {
            case 0 : return new  GamesFragment();

            case 1 : return new TopRatedFragment();

            case 2: return new MoviesFragment();




        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
