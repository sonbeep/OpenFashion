package com.example.openfashion.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.openfashion.R;
import com.example.openfashion.model.Arrival;

import java.util.ArrayList;
import java.util.List;

public class ArrivalAdapter extends RecyclerView.Adapter<ArrivalAdapter.ArrivalVH> {
    private Context context;
    private ArrayList<Arrival> listArrival;

    public ArrivalAdapter(Context context, ArrayList<Arrival> listArrival) {
        this.context = context;
        this.listArrival = listArrival;
    }

    @NonNull
    @Override
    public ArrivalVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_arrival, parent, false);
        return new ArrivalVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArrivalVH holder, int position) {
        Arrival arrival = listArrival.get(position);
        holder.iv_img.setImageResource(arrival.getImage());
        holder.tv_name.setText(arrival.getName());
        holder.tv_price.setText(arrival.getPrice());
    }

    @Override
    public int getItemCount() {
        return listArrival.size();
    }

    public class ArrivalVH extends RecyclerView.ViewHolder {
        ImageView iv_img;
        TextView tv_name, tv_price;
        public ArrivalVH(@NonNull View itemView) {
            super(itemView);
            iv_img = itemView.findViewById(R.id.iv_img);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_price = itemView.findViewById(R.id.tv_price);
        }
    }
}
