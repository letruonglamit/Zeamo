package com.shsl.android.zeamo.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.shsl.android.zeamo.R;

import java.util.List;

public class SportAdapter extends RecyclerView.Adapter<SportAdapter.MyViewHolder> {

    private List<String> list_item;
    public Context mContext;
    OnItemClickListener mItemClickListener;

    public SportAdapter(List<String> list, Context context) {
        list_item = list;
        mContext = context;
    }

    // Called when RecyclerView needs a new RecyclerView.ViewHolder of the given type to represent an item.
    @Override
    public SportAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a layout
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_seach, null);
        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    // Called by RecyclerView to display the data at the specified position.
    @Override
    public void onBindViewHolder(final MyViewHolder viewHolder, final int position) {
        viewHolder.country_name.setText(list_item.get(position));
        viewHolder.country_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, list_item.get(position),
                        Toast.LENGTH_LONG).show();
//                SpinningFragment frag = new SpinningFragment();
//                ((BaseFragment)get)
            }
        });
    }

    // initializes some private fields to be used by RecyclerView.
    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView country_name;

        public MyViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            itemLayoutView.setOnClickListener(this);
            country_name = (TextView) itemLayoutView.findViewById(R.id.tv_name);
        }

        @Override
        public void onClick(View view) {

        }
    }

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
    }

    public void SetOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    //Returns the total number of items in the data set hold by the adapter.
    @Override
    public int getItemCount() {
        return list_item.size();
    }


}

