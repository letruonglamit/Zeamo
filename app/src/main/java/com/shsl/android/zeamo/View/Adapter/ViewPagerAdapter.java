package com.shsl.android.zeamo.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.shsl.android.zeamo.ActivityBookings;
import com.shsl.android.zeamo.view.SearchContainerFragment;
import com.shsl.android.zeamo.view.welcome.AccountFragment;
import com.shsl.android.zeamo.view.favorites.FavoritesFragment;
import com.shsl.android.zeamo.view.insurance.InsuranceFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;
        switch (position){
            case 0:{
                frag = new SearchContainerFragment();
                break;
            }
            case 1:{
                frag = new ActivityBookings();
                break;
            }
            case 2:{
                frag = new FavoritesFragment();
                break;
            }
            case 3:{
                frag = new InsuranceFragment();
                break;
            }
            case 4:{
                frag = new AccountFragment();
                break;
            }
        }
        return frag;
    }


    @Override
    public int getCount() {
        return 5;
    }
}
