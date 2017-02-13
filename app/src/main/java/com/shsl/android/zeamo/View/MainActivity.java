package com.shsl.android.zeamo.view;

import android.app.Activity;
import android.app.SearchManager;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.shsl.android.zeamo.view.adapter.CustomViewPager;
import com.shsl.android.zeamo.view.adapter.ViewPagerAdapter;
import com.shsl.android.zeamo.R;

public class MainActivity extends AppCompatActivity {
    private static final String LOG = "MainActivity";

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private CustomViewPager viewPager;
    private ViewPagerAdapter adapter;
    private static final String TAB_0 = "SEARCH";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainn);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (CustomViewPager) findViewById(R.id.viewpager);

        viewPager.setPagingEnabled(false);

        tabLayout.setBackgroundColor(Color.WHITE);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(5);
        tabLayout.setupWithViewPager(viewPager);

        View searchView = LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        final ImageView imageSearch = (ImageView) searchView.findViewById(R.id.image);
        final TextView textSearch = (TextView) searchView.findViewById(R.id.text_view);
        imageSearch.setImageResource(R.drawable.ic_bar_search_1);
        textSearch.setText("Search");

        View bookingsView = LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        final ImageView imageBookings = (ImageView) bookingsView.findViewById(R.id.image);
        final TextView textBookings = (TextView) bookingsView.findViewById(R.id.text_view);
        imageBookings.setImageResource(R.drawable.ic_bar_bookings_1);
        textBookings.setText("Bookings");

        View favoritesView = LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        final ImageView imageFavorites = (ImageView) favoritesView.findViewById(R.id.image);
        final TextView textFavorites = (TextView) favoritesView.findViewById(R.id.text_view);
        imageFavorites.setImageResource(R.drawable.ic_bar_favorites_1);
        textFavorites.setText("Favorites");

        View insuranceView = LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        final ImageView imageInsurance = (ImageView) insuranceView.findViewById(R.id.image);
        final TextView textInsurance = (TextView) insuranceView.findViewById(R.id.text_view);
        imageInsurance.setImageResource(R.drawable.ic_bar_insurance_1);
        textInsurance.setText("Insurance");

        View accountView = LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        final ImageView imageAccount = (ImageView) accountView.findViewById(R.id.image);
        final TextView textAccount = (TextView) accountView.findViewById(R.id.text_view);
        imageAccount.setImageResource(R.drawable.ic_bar_account_1);
        textAccount.setText("Account");


        tabLayout.getTabAt(0).setCustomView(searchView);
        tabLayout.getTabAt(1).setCustomView(bookingsView);
        tabLayout.getTabAt(2).setCustomView(favoritesView);
        tabLayout.getTabAt(3).setCustomView(insuranceView);
        tabLayout.getTabAt(4).setCustomView(accountView);


        TabLayout.Tab tabCall = tabLayout.getTabAt(0);
        tabCall.setIcon(R.drawable.custom_tab_layout);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0: {
                        imageSearch.setImageResource(R.drawable.ic_bar_search_on_1);
                        imageBookings.setImageResource(R.drawable.ic_bar_bookings_1);
                        imageFavorites.setImageResource(R.drawable.ic_bar_favorites_1);
                        imageInsurance.setImageResource(R.drawable.ic_bar_insurance_1);
                        imageAccount.setImageResource(R.drawable.ic_bar_account_1);

                        textSearch.setTextColor(Color.parseColor("#16DBC9"));
                        textBookings.setTextColor(Color.parseColor("#007360"));
                        textFavorites.setTextColor(Color.parseColor("#007360"));
                        textInsurance.setTextColor(Color.parseColor("#007360"));
                        textAccount.setTextColor(Color.parseColor("#007360"));

                        break;
                    }
                    case 1: {
                        imageSearch.setImageResource(R.drawable.ic_bar_search_1);
                        imageBookings.setImageResource(R.drawable.ic_bar_bookings_on_1);
                        imageFavorites.setImageResource(R.drawable.ic_bar_favorites_1);
                        imageInsurance.setImageResource(R.drawable.ic_bar_insurance_1);
                        imageAccount.setImageResource(R.drawable.ic_bar_account_1);

                        textSearch.setTextColor(Color.parseColor("#007360"));
                        textBookings.setTextColor(Color.parseColor("#16DBC9"));
                        textFavorites.setTextColor(Color.parseColor("#007360"));
                        textInsurance.setTextColor(Color.parseColor("#007360"));
                        textAccount.setTextColor(Color.parseColor("#007360"));
                        break;
                    }
                    case 2: {
                        imageSearch.setImageResource(R.drawable.ic_bar_search_1);
                        imageBookings.setImageResource(R.drawable.ic_bar_bookings_1);
                        imageFavorites.setImageResource(R.drawable.ic_bar_favorites_on_1);
                        imageInsurance.setImageResource(R.drawable.ic_bar_insurance_1);
                        imageAccount.setImageResource(R.drawable.ic_bar_account_1);

                        textSearch.setTextColor(Color.parseColor("#007360"));
                        textBookings.setTextColor(Color.parseColor("#007360"));
                        textFavorites.setTextColor(Color.parseColor("#16DBC9"));
                        textInsurance.setTextColor(Color.parseColor("#007360"));
                        textAccount.setTextColor(Color.parseColor("#007360"));
                        break;
                    }
                    case 3: {
                        imageSearch.setImageResource(R.drawable.ic_bar_search_1);
                        imageBookings.setImageResource(R.drawable.ic_bar_bookings_1);
                        imageFavorites.setImageResource(R.drawable.ic_bar_favorites_1);
                        imageInsurance.setImageResource(R.drawable.ic_bar_insurance_on_1);
                        imageAccount.setImageResource(R.drawable.ic_bar_account_1);

                        textSearch.setTextColor(Color.parseColor("#007360"));
                        textBookings.setTextColor(Color.parseColor("#007360"));
                        textFavorites.setTextColor(Color.parseColor("#007360"));
                        textInsurance.setTextColor(Color.parseColor("#16DBC9"));
                        textAccount.setTextColor(Color.parseColor("#007360"));
                    }
                    case 4: {
                        imageSearch.setImageResource(R.drawable.ic_bar_search_1);
                        imageBookings.setImageResource(R.drawable.ic_bar_bookings_1);
                        imageFavorites.setImageResource(R.drawable.ic_bar_favorites_1);
                        imageInsurance.setImageResource(R.drawable.ic_bar_insurance_1);
                        imageAccount.setImageResource(R.drawable.ic_bar_account_on_1);

                        textSearch.setTextColor(Color.parseColor("#007360"));
                        textBookings.setTextColor(Color.parseColor("#007360"));
                        textFavorites.setTextColor(Color.parseColor("#007360"));
                        textInsurance.setTextColor(Color.parseColor("#007360"));
                        textAccount.setTextColor(Color.parseColor("#16DBC9"));
                    }
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        // Get the SearchView and set the searchable configuration
        SearchManager searchManager = (SearchManager) getSystemService(MainActivity.this.SEARCH_SERVICE);
        //MenuItem searchItem=menu.findItem(R.id.searchitem);
        //SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        final SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        //searchView.setBackgroundColor(Color.parseColor("#086A87"));
        // Sets the SearchableInfo for this SearchView
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        //expand the search widget
        searchView.setIconifiedByDefault(false);
        // Show the submit button
        searchView.setSubmitButtonEnabled(true);
        return true;
    }
    private Fragment getCurrentFragment(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        String fragmentTag = fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount()-1).getName();
        Fragment currentFragment = fragmentManager.findFragmentByTag(fragmentTag);
        return  currentFragment;
    }
    @Override
    public void onBackPressed() {
        int position = viewPager.getCurrentItem();
        Fragment fragment = getSupportFragmentManager().getFragments().get(position);
        if (fragment instanceof SearchContainerFragment) {
            SearchContainerFragment containerFragment = (SearchContainerFragment) fragment;
            if (containerFragment.popFragment()) {
                return;
            }
        }
        super.onBackPressed();
    }
    private boolean isFragmentOnTop(Activity parentActivity, final String fragmentName){
        android.app.FragmentManager fmManager = parentActivity.getFragmentManager();
        if(fmManager.getBackStackEntryCount() == 0){
            return false;
        }
        String fragmentNameOnStackTop = "";
        final FragmentManager.BackStackEntry topEntry = (FragmentManager.BackStackEntry) fmManager.getBackStackEntryAt(fmManager.getBackStackEntryCount() -1);
        if(topEntry != null) {
            fragmentNameOnStackTop = topEntry.getName();
        }
        return fragmentNameOnStackTop != null ? fragmentNameOnStackTop.equals(fragmentName) : false;
    }

}