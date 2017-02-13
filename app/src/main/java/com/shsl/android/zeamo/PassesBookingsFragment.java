package com.shsl.android.zeamo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by shsl on 15/01/2017.
 */

public class PassesBookingsFragment extends Fragment {
    private View root;

    public static PassesBookingsFragment getInstance() {
        PassesBookingsFragment f = new PassesBookingsFragment();

        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_passes_bookings, container, false);

//        TextView textView = (TextView) root.findViewById(R.id.text);
//        textView.setText("Random number: " + randomNumber);

        return root;
    }
}
