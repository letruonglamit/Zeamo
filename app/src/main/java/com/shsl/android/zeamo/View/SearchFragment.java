package com.shsl.android.zeamo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;

import com.shsl.android.zeamo.R;
import com.shsl.android.zeamo.view.adapter.SportAdapter;

import java.util.ArrayList;
import java.util.List;


public class SearchFragment extends BaseFragment {
    private RecyclerView mRecyclerView;
    public EditText search;
    private List<String> list = new ArrayList<String>();
    public SportAdapter mAdapter;
    private View view;
    public Context mcontext;

    public static SearchFragment newInstance() {
        return new SearchFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        view = inflater.inflate(R.layout.fragment_seach, container, false);
        search = (EditText) view.findViewById(R.id.txtSeach);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        sportList();  // in this method, Create a list of items.

        // call the adapter with argument list of items and context.
        mAdapter = new SportAdapter(list, getActivity());
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getContext(), mRecyclerView, new RecyclerItemClickListener.OnItemClickListener() {

            // replace fragment in event click item recyclerview
            @Override
            public void onItemClick(View view, int position) {
                SpinningFragment spinningFragment = new SpinningFragment();
                ((BaseFragment) getParentFragment()).replaceFragment(spinningFragment, true, "Search");
            }

            @Override
            public void onItemLongClick(View view, int position) {

            }
        }));

        mRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {

            int dividerHeight = 1;

            @Override
            public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
                final int left = parent.getPaddingLeft() + 50;
                final int right = parent.getWidth() - parent.getPaddingRight();

                // Tạo drawable: giả sử ta muốn tạo ra 1 dòng kẻ màu xám
                ColorDrawable colorDrawable = new ColorDrawable(Color.DKGRAY);

                final int childCount = parent.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    // Duyệt các item views, và add thêm drawable ở dưới view đó
                    final View child = parent.getChildAt(i);
                    final RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child
                            .getLayoutParams();
                    final int top = child.getBottom() + params.bottomMargin;
                    final int bottom = top + dividerHeight;
                    colorDrawable.setBounds(left, top, right, bottom);
                    colorDrawable.draw(c);
                }
            }


            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                outRect.set(0, 0, 0, dividerHeight);
            }
        });


//        // replace fragment in event click item recyclerview
//        mAdapter.SetOnItemClickListener(new SportAdapter.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(View v, int position) {
//                replaceFragment(new SpinningFragment(), true, SpinningFragment.class.getSimpleName());
//            }
//        });
        addTextListener();
        return view;
    }


    public void sportList() {
        list.add("Gym");
        list.add("Spinning");
        list.add("Yoga");
        list.add("Crossfit");
        list.add("Swimming");
        list.add("Tennis");
        list.add("Martial Arts");
        list.add("Rock Climbing");
        list.add("Physiotherapy");
        list.add("Volleyball");
        list.add("Soccer");
        list.add("Backgammon");
        list.add("Chess");
        list.add("Handball");
        list.add("Mountaineering");
        list.add("Snowboarding");
        list.add("Ten-pin bowling");
    }

    public void addTextListener() {
        final ImageView clearButtonImage = (ImageView) view.findViewById(R.id.clearButton);
        search.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                search.setText("");
                clearButtonImage.setVisibility(View.GONE);

            }

        });
        search.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence query, int start, int before, int count) {
                if (query.length() == 0) {
                    clearButtonImage.setVisibility(View.VISIBLE);
                }
                query = query.toString().toLowerCase();

                final List<String> filteredList = new ArrayList<>();

                for (int i = 0; i < list.size(); i++) {

                    final String text = list.get(i).toLowerCase();
                    if (text.contains(query)) {

                        filteredList.add(list.get(i));
                    }
                }

                mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                mAdapter = new SportAdapter(filteredList, getActivity());
                mRecyclerView.setAdapter(mAdapter);
                mAdapter.notifyDataSetChanged();  // data set changed
            }
        });
    }
}
