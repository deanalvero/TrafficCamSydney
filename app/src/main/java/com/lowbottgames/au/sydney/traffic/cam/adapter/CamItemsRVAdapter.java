package com.lowbottgames.au.sydney.traffic.cam.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lowbottgames.au.sydney.traffic.cam.R;
import com.lowbottgames.au.sydney.traffic.cam.TCSHelper;
import com.lowbottgames.au.sydney.traffic.cam.domain.CamItem;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

public class CamItemsRVAdapter extends RecyclerView.Adapter<CamItemsRVAdapter.CamItemsRVViewHolder> {

    private CamItem[] items;
    private OnCamItemsRVAdapterListener onCamItemsRVAdapterListener;
    private boolean showCamItemImages;

    @Override
    public CamItemsRVViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CamItemsRVViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cam, parent, false));
    }

    @Override
    public void onBindViewHolder(final CamItemsRVViewHolder holder, int position) {
        final CamItem item = items[position];

        Context context = holder.itemView.getContext();

        holder.textViewTitle.setText(item.camName);
        holder.textViewSubtitle.setText(item.camDirection);

//        if (showCamItemImages) {
//            holder.imageView.setVisibility(View.VISIBLE);

            String url = TCSHelper.getImageURLString(item.camID);

            Picasso.with(context)
                    .load(url)
//                .networkPolicy(NetworkPolicy.OFFLINE)
                    .into(holder.imageView);
//        } else {
//            holder.imageView.setVisibility(View.GONE);
//        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCamItemsRVAdapterListener != null) {
                    int adapterPosition = holder.getAdapterPosition();
                    onCamItemsRVAdapterListener.onSelectCamItem(adapterPosition, items[adapterPosition]);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        if (items == null) {
            return 0;
        }
        return items.length;
    }

    public void setItems(CamItem[] items) {
        this.items = items;
    }

//    public void setShowCamItemImages(boolean showCamItemImages) {
//        this.showCamItemImages = showCamItemImages;
//    }

    static class CamItemsRVViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        TextView textViewSubtitle;
        ImageView imageView;

        public CamItemsRVViewHolder(View itemView) {
            super(itemView);

            textViewTitle = (TextView) itemView.findViewById(R.id.textView_title);
            textViewSubtitle = (TextView) itemView.findViewById(R.id.textView_subtitle);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

    public void setOnCamItemsRVAdapterListener(OnCamItemsRVAdapterListener onCamItemsRVAdapterListener) {
        this.onCamItemsRVAdapterListener = onCamItemsRVAdapterListener;
    }

    public interface OnCamItemsRVAdapterListener {
        void onSelectCamItem(int position, CamItem camItem);
    }
}