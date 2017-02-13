package com.shsl.android.zeamo.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shsl.android.zeamo.R;

/**
 * Created by shsl on 13/02/2017.
 */

public class SearchContainerFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search_container, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        SearchFragment fragment = SearchFragment.newInstance();
        replaceFragment(fragment, false, fragment.getClass().getSimpleName());
    }

}
