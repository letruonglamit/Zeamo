package com.shsl.android.zeamo.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.shsl.android.zeamo.R;

public class BaseFragment extends Fragment {

    public void replaceFragment(Fragment fragment, boolean addToBackStack, String tag) {
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        if (addToBackStack) {
            transaction.addToBackStack(tag);
        }
        transaction.replace(R.id.containerLayout, fragment, tag);
        transaction.commit();
    }

    public boolean popFragment() {
        return getChildFragmentManager().popBackStackImmediate();
    }

}
