package com.example.rock_boy69.vu_collab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class SectionPagerAdapter extends FragmentPagerAdapter{


    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                UnitsFragment requestsFragment = new UnitsFragment();
                return requestsFragment;
            case 1:
                NewsFragment newsFragment = new NewsFragment();
                return newsFragment;
            case 2:
                FeedbackFragment feedbackFragment = new FeedbackFragment();
                return feedbackFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){

        switch (position){
            case 0:
                return "Units";
            case 1:
                return "News";
            case 2:
                return "FeedBack";
            default:
                return null;
        }
    }
}
