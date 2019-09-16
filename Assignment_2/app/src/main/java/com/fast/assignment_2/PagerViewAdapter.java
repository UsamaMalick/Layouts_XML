package com.fast.assignment_2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class PagerViewAdapter extends FragmentPagerAdapter {

    public PagerViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new fragment_relative();
                break;
            case 1:
                fragment = new fragment_constraint();
                break;
            case 2:
                fragment = new fragment_frame();
                break;
            case 3:
                fragment = new fragment_linear();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
