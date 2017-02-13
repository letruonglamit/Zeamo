package com.shsl.android.zeamo.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.shsl.android.zeamo.view.object.SpinningObj;
import com.shsl.android.zeamo.R;

import java.util.ArrayList;

public class SpinningAdapter extends RecyclerView.Adapter<SpinningAdapter.ViewHolderSpinning> {



    ArrayList<SpinningObj> spinnerAdapter;
    public Context mcontext;
    OnItemClickListener mItemClickListener;

    public SpinningAdapter(ArrayList<SpinningObj> spinnerAdapter, Context context) {
        this.spinnerAdapter = spinnerAdapter;
        this.mcontext = context;
    }

    // Called when RecyclerView needs a new RecyclerView.ViewHolder of the given type to represent an item.
    @Override
    public ViewHolderSpinning onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a layout
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_seach_spinning, null);
        ViewHolderSpinning myViewHolder = new ViewHolderSpinning(view);

        return myViewHolder;
    }


    // Called by RecyclerView to display the data at the specified position.
    @Override
    public void onBindViewHolder(final ViewHolderSpinning viewHolder, final int position ) {
        final String name=spinnerAdapter.get(position).getName();
        final String location=spinnerAdapter.get(position).getLocation();
        final String address=spinnerAdapter.get(position).getAddress();
        final int imageStudio=spinnerAdapter.get(position).getImageStudio();
        final int review = spinnerAdapter.get(position).getReview()+1;
        //BIND DATA

        viewHolder.imgStudio.setImageResource(imageStudio);
        viewHolder.txtLocation.setText(location);
        viewHolder.txtAddress.setText(address);
        viewHolder.txtName.setText(name);
        switch (review){
            case 5:
                viewHolder.s5.setImageResource(R.drawable.star_small_on);
            case 4:
                viewHolder.s4.setImageResource(R.drawable.star_small_on);
            case 3:
                viewHolder.s3.setImageResource(R.drawable.star_small_on);
            case 2:
                viewHolder.s2.setImageResource(R.drawable.star_small_on);
            case 1:
                viewHolder.s1.setImageResource(R.drawable.star_small_on);
        }

        switch (review){
            case 1:
                viewHolder.s1.setImageResource(R.drawable.star_small_off);
            case 2:
                viewHolder.s2.setImageResource(R.drawable.star_small_off);
            case 3:
                viewHolder.s3.setImageResource(R.drawable.star_small_off);
            case 4:
                viewHolder.s4.setImageResource(R.drawable.star_small_off);
            case 5:
                viewHolder.s5.setImageResource(R.drawable.star_small_off);
        }


        viewHolder.s1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                viewHolder.s1.setImageResource(R.drawable.star_small_on);
                viewHolder.s2.setImageResource(R.drawable.star_small_off);
                viewHolder.s3.setImageResource(R.drawable.star_small_off);
                viewHolder.s4.setImageResource(R.drawable.star_small_off);
                viewHolder.s5.setImageResource(R.drawable.star_small_off);
            }
        });
        viewHolder.s2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                viewHolder.s1.setImageResource(R.drawable.star_small_on);
                viewHolder.s2.setImageResource(R.drawable.star_small_on);
                viewHolder.s3.setImageResource(R.drawable.star_small_off);
                viewHolder.s4.setImageResource(R.drawable.star_small_off);
                viewHolder.s5.setImageResource(R.drawable.star_small_off);
            }
        });
        viewHolder.s3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                viewHolder.s1.setImageResource(R.drawable.star_small_on);
                viewHolder.s2.setImageResource(R.drawable.star_small_on);
                viewHolder.s3.setImageResource(R.drawable.star_small_on);
                viewHolder.s4.setImageResource(R.drawable.star_small_off);
                viewHolder.s5.setImageResource(R.drawable.star_small_off);
            }
        });
        viewHolder.s4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                viewHolder.s1.setImageResource(R.drawable.star_small_on);
                viewHolder.s2.setImageResource(R.drawable.star_small_on);
                viewHolder.s3.setImageResource(R.drawable.star_small_on);
                viewHolder.s4.setImageResource(R.drawable.star_small_on);
                viewHolder.s5.setImageResource(R.drawable.star_small_off);
            }
        });
        viewHolder.s5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                viewHolder.s1.setImageResource(R.drawable.star_small_on);
                viewHolder.s2.setImageResource(R.drawable.star_small_on);
                viewHolder.s3.setImageResource(R.drawable.star_small_on);
                viewHolder.s4.setImageResource(R.drawable.star_small_on);
                viewHolder.s5.setImageResource(R.drawable.star_small_on);
            }
        });

        viewHolder.btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mcontext, spinnerAdapter.get(position).getName(),
                        Toast.LENGTH_LONG).show();

//                SpinningFragment newFragment = new SpinningFragment();
//                FragmentTransaction transaction = /* Here is the change.*/mContext.getFragmentManager().beginTransaction();
//                transaction.replace(R.id.fragment_seach, newFragment);
            }
        });

    }

    // initializes some private fields to be used by RecyclerView.
    public static class ViewHolderSpinning extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txtName, txtLocation,txtAddress;
        public ImageView imgStudio;
        public ImageButton s1,s2,s3,s4,s5, btnShow;
        OnItemClickListener itemClickListener;

        public ViewHolderSpinning(View itemLayoutView) {
            super(itemLayoutView);
            itemLayoutView.setOnClickListener(this);
            txtName= (TextView) itemView.findViewById(R.id.txt_name);
            txtAddress= (TextView) itemView.findViewById(R.id.txt_address);
            txtLocation= (TextView) itemView.findViewById(R.id.txt_location);
            imgStudio= (ImageView) itemView.findViewById(R.id.image_studio);
            s1 = (ImageButton) itemView.findViewById(R.id.star_1);
            s2 = (ImageButton) itemView.findViewById(R.id.star_2);
            s3 = (ImageButton) itemView.findViewById(R.id.star_3);
            s4 = (ImageButton) itemView.findViewById(R.id.star_4);
            s5 = (ImageButton) itemView.findViewById(R.id.star_5);
            btnShow = (ImageButton) itemView.findViewById(R.id.btn_show);
        }
        @Override
        public void onClick(View view) {
            //this.itemClickListener.onItemClick(this.getLayoutPosition());
        }

    }
    public interface OnItemClickListener {
        public void onItemClick(int position);
    }

    public void SetOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    //Returns the total number of items in the data set hold by the adapter.
    @Override
    public int getItemCount() {
        return spinnerAdapter.size();
    }



}

