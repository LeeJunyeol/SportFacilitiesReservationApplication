package com.project.sportfacilitiesreservationapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.StrictMode;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONException;

/**
 * Created by jylee on 2017-04-14.
 */

public class SportFacRecyclerAdapter extends RecyclerView.Adapter<SportFacRecyclerAdapter.ViewHolder>{

    // 각각 카드뷰에 들어갈 데이터. OpenAPI에서 받아와 적용하도록 할 것.
    private String[] titles = {"Capert One", "Chapter two", "Chapter three"};

    private String[] details = {"Item one","Item two","Item three"};

    private int[] images = { R.drawable.ic_basketball, R.drawable.ic_football, R.drawable.ic_badminton};

/*
    String url = "http://lod.seoul.go.kr/home/sparqlEndpoint/sparqlResult.jsp?query=PREFIX%2520rdf%253A%2520%253Chttp%253A%252F%252Fwww.w3.org%252F1999%252F02%252F22-rdf-syntax-ns%2523%253E%250APREFIX%2520rdfs%253A%2520%253Chttp%253A%252F%252Fwww.w3.org%252F2000%252F01%252Frdf-schema%2523%253E%250APREFIX%2520seoul%253A%2520%253Chttp%253A%252F%252Flod.seoul.go.kr%252Fontology%252F%253E%250APREFIX%2520schema%253A%2520%253Chttp%253A%252F%252Fschema.org%252F%253E%250ASELECT%2520*%250AWHERE%2520%257B%2520%250A%2520%2520%2520%2520%253Freserve%2520rdf%253Atype%2520seoul%253AReservationInfo%2520.%250A%2520%2520%2520%2520%253Freserve%2520seoul%253AmainServiceCategory%2520%253Chttp%253A%252F%252Flod.seoul.go.kr%252Fresource%252FPublicServiceCategory%252FT100%253E%2520.%250A%2520%2520%2520%2520%253Freserve%2520rdfs%253Alabel%2520%253Fname%2520.%250A%257D&rslt_type=html";
    boolean isFavorite = false;

    StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
    StrictMode.setThreadPolicy(policy);
    try {
            String s = HttpUtil.get(url);
    } catch (JSONException e2) {
        // TODO Auto-generated catch block
        e2.printStackTrace();
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
*/

    class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView) itemView.findViewById(R.id.iv_fac_list_img);
            itemTitle = (TextView) itemView.findViewById(R.id.tv_placenm);
            itemDetail = (TextView) itemView.findViewById(R.id.tv_sportnm);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                    Intent intent = new Intent(v.getContext(), SportFacInfoActivity.class);
                    v.getContext().startActivity(intent);
                }
            });
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

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
