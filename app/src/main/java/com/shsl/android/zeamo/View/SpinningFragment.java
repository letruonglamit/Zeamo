package com.shsl.android.zeamo.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.shsl.android.zeamo.view.adapter.SpinningAdapter;
import com.shsl.android.zeamo.view.object.SpinningCollection;
import com.shsl.android.zeamo.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Admin on 11-12-2015.
 */
public class SpinningFragment extends Fragment {
    private RecyclerView mRecyclerView;
    public EditText search;
    private List<String> list = new ArrayList<String>();
    public SpinningAdapter mAdapter = null;
    private View view;
    public Context mcontext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_spinning, container, false);
        search = (EditText) view.findViewById( R.id.txt_seach_spinning);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerview_spinning);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        mAdapter = new SpinningAdapter(SpinningCollection.getSpinningCollection(),getActivity());
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {


            @Override    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                outRect.set(0, 0, 0, 30);
            }
        });

        mAdapter.SetOnItemClickListener(new SpinningAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(mcontext, "hhhhhhhhhhh",
                        Toast.LENGTH_LONG).show();


//                FragmentManager fragmentManager = getFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                SpinningFragment fragment = new SpinningFragment();
//                fragmentTransaction.add(R.id.fragment_spinning, fragment);
//                fragmentTransaction.commit();


            }
        });
        return view;
    }


}
