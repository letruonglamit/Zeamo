package com.shsl.android.zeamo;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.util.TypedValue;

public class ActivitySeach131 extends FragmentActivity {
    ViewPager viewPager = null;
    PagerTitleStrip titleStrip;
    @Override
    protected  void onCreate(Bundle sis){
        super.onCreate(sis);
        setContentView(R.layout.activity_1_3_1);
        viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapterSeach131(fragmentManager));
        titleStrip = (PagerTitleStrip) findViewById(R.id.title);
        titleStrip.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18);
        titleStrip.setTextColor(Color.parseColor("#00947B"));
    }
}
class MyAdapterSeach131 extends FragmentPagerAdapter{

    public MyAdapterSeach131(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Log.d("HDHHDHD","getItem "+position);
        Fragment frag = null;
        if(position == 0) frag = new FragmentToday();
        if(position == 1) frag = new FragmentTomorrow();
        return frag;

    }

    @Override
    public int getCount() {
        return 2;
    }



    @Override
    public CharSequence getPageTitle(int position){
        Log.d("getPageTitle: ","position"+position);
        if(position == 0) {

            return "Today";
        }
        if(position == 1) return "Tomorrow";

        return null;
    }
}
class MyAdapterSeach131Temp extends FragmentPagerAdapter{

    public MyAdapterSeach131Temp(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }



    @Override
    public CharSequence getPageTitle(int position){
        Log.d("getPageTitle: ","position"+position);
        if(position == 0) {

            return "17/02";
        }
        if(position == 1) return "18/02";

        return null;
    }
}
