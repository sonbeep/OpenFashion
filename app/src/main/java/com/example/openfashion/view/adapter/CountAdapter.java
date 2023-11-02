package com.example.openfashion.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.openfashion.R;
import com.example.openfashion.model.Count;
import com.example.openfashion.view.fragment.HomePageFragment;

import java.util.ArrayList;
import java.util.List;

public class CountAdapter extends RecyclerView.Adapter<CountAdapter.CountVH> {
    private Context context;
    private ArrayList<Count> listCount;
    public CountAdapter(Context context, ArrayList<Count> listCount) {
        this.context = context;
        this.listCount = listCount;
    }

    @NonNull
    @Override
    public CountVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_count, parent, false);
        return new CountVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountVH holder, int position) {
        Count count = listCount.get(position);
            holder.iv_count.setImageResource(count.getCount());
    }

    @Override
    public int getItemCount() {
        return listCount.size();
    }

    public class CountVH extends RecyclerView.ViewHolder {
        ImageView iv_count;
        public CountVH(@NonNull View itemView) {
            super(itemView);
            iv_count = itemView.findViewById(R.id.iv_count);
        }
    }
}
