package com.project.sportfacilitiesreservationapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * Created by jylee on 2017-04-14.
 */

public class SportFacRecyclerAdapter extends RecyclerView.Adapter<SportFacRecyclerAdapter.ViewHolder>{
    private String[] titles = {"Capert One", "Chapter two", "Chapter three"};

    private String[] details = {"Item one","Item two","Item three"};

    private int[] images = { R.drawable.ic_basketball, R.drawable.ic_football, R.drawable.ic_badminton};

    class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView) itemView.findViewById(R.id.iv_fac_list_img);
            itemTitle = (TextView) itemView.findViewById(R.id.tv_placenm);
            itemDetail = (TextView) itemView.findViewById(R.id.tv_sportnm);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view_sport_facility_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.itemTitle.setText(titles[position]);
        viewHolder.itemDetail.setText(details[position]);
        viewHolder.itemImage.setImageResource(images[position]);
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    @Override
    public int getItemCount() {
        return titles.length;
    }
}
