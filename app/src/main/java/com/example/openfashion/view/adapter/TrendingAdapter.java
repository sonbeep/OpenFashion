package com.example.openfashion.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.openfashion.R;
import com.example.openfashion.model.Trending;

import java.util.ArrayList;

public class TrendingAdapter extends RecyclerView.Adapter<TrendingAdapter.TrendingVH> {
    private Context context;
    private ArrayList<Trending> listTrending;

    public TrendingAdapter(Context context, ArrayList<Trending> listTrending) {
        this.context = context;
        this.listTrending = listTrending;
    }

    @NonNull
    @Override
    public TrendingVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_trending, parent, false);
        return new TrendingVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendingVH holder, int position) {
        Trending trending = listTrending.get(position);
        holder.tv_title.setText(trending.getTitle());
    }

    @Override
    public int getItemCount() {
        return listTrending.size();
    }

    public class TrendingVH extends RecyclerView.ViewHolder {
        TextView tv_title;
        public TrendingVH(@NonNull View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_trending);
        }
    }
}
