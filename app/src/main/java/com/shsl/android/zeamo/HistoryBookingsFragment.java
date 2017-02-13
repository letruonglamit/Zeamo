package com.shsl.android.zeamo;

import java.util.Random;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class HistoryBookingsFragment extends Fragment {

    private View root;

    public static HistoryBookingsFragment getInstance() {
        HistoryBookingsFragment f = new HistoryBookingsFragment();

        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.history_fragment, container, false);

//        TextView textView = (TextView) root.findViewById(R.id.text);
//        textView.setText("Random number: " + randomNumber);

        return root;
    }
}
