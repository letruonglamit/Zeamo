package com.shsl.android.zeamo;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class ActivityBookings extends Fragment {
    Button btnUpcoming, btnHistory, btnPasses;
    LinearLayout linearLayoutBookings;
    int statusFrag;

    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_bookings, container, false);
        statusFrag = 0;
        createView();

        btnUpcoming.setOnClickListener(onFragmentUpcomingListener());
        btnHistory.setOnClickListener(onFragmentHistoryListener());
        btnPasses.setOnClickListener(onFragmentPasses());

        return view;
    }



    private OnClickListener onFragmentUpcomingListener() {
        return new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(statusFrag > 0){
                    setTextColorButton(0);

                    FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();

                    fragmentTransaction.setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out,
                            R.anim.slide_lceft_in, R.anim.slide_left_out);

                    UpcomingBookingsFragment fragment = UpcomingBookingsFragment.getInstance();

                    fragmentTransaction.replace(R.id.linear_bookings, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
                statusFrag = 0;
            }
        };
    }

    private OnClickListener onFragmentHistoryListener() {
        return new View.OnClickListener(){
          @Override
            public void onClick(View v){
              if(statusFrag != 1){
                  setTextColorButton(1);

                  FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();

                  if(statusFrag <1){
                      fragmentTransaction.setCustomAnimations(R.anim.slide_lceft_in, R.anim.slide_left_out,
                              R.anim.slide_right_in, R.anim.slide_right_out);
                  }else{
                      fragmentTransaction.setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out,
                              R.anim.slide_lceft_in, R.anim.slide_left_out);
                  }

                  HistoryBookingsFragment fragment = HistoryBookingsFragment.getInstance();

                  fragmentTransaction.replace(R.id.linear_bookings, fragment);
                  fragmentTransaction.addToBackStack(null);
                  fragmentTransaction.commit();
              }
              statusFrag = 1;
          }
        };
    }

    private OnClickListener onFragmentPasses() {
        return new OnClickListener() {
            @Override
            public void onClick(View v) {
                setTextColorButton(2);

                if(statusFrag < 2){
                    FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();

                    fragmentTransaction.setCustomAnimations(R.anim.slide_lceft_in, R.anim.slide_left_out,
                            R.anim.slide_right_in, R.anim.slide_right_out);

                    PassesBookingsFragment fragment = PassesBookingsFragment.getInstance();

                    fragmentTransaction.replace(R.id.linear_bookings, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
                statusFrag = 2;
            }

        };
    }

    public void createView(){
        btnUpcoming = (Button) view.findViewById(R.id.btn_upcoming);
        btnHistory = (Button) view.findViewById(R.id.btn_history);
        btnPasses = (Button) view.findViewById(R.id.btn_passes);

        setTextColorButton(1);

        linearLayoutBookings = (LinearLayout) view.findViewById(R.id.linear_bookings);

        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();

        fragmentTransaction.setCustomAnimations(R.anim.slide_lceft_in, R.anim.slide_left_out,
                R.anim.slide_right_in, R.anim.slide_right_out);

        UpcomingBookingsFragment fragment = UpcomingBookingsFragment.getInstance();

        fragmentTransaction.replace(R.id.linear_bookings, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void setTextColorButton(int postion){
        btnUpcoming.setTextColor(Color.parseColor("#798391"));
        btnHistory.setTextColor(Color.parseColor("#798391"));
        btnPasses.setTextColor(Color.parseColor("#798391"));
        switch (postion){
            case 0:
                btnUpcoming.setTextColor(Color.parseColor("#205BB8"));
                break;
            case 1:
                btnHistory.setTextColor(Color.parseColor("#205BB8"));
                break;
            case 2:
                btnPasses.setTextColor(Color.parseColor("#205BB8"));

        }
    }
}

