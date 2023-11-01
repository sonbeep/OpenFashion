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
import com.example.openfashion.model.ForYou;
import com.example.openfashion.model.Infor;

import java.util.ArrayList;

public class ForYouAdapter extends RecyclerView.Adapter<ForYouAdapter.ForYoulVH> {
    private Context context;
    private ArrayList<ForYou> listInfor;

    public ForYouAdapter(Context context, ArrayList<ForYou> listInfor) {
        this.context = context;
        this.listInfor = listInfor;
    }

    @NonNull
    @Override
    public ForYoulVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_for_you, parent, false);
        return new ForYoulVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ForYoulVH holder, int position) {
        ForYou infor = listInfor.get(position);
        holder.iv_img.setImageResource(infor.getImage());
        holder.tv_name.setText(infor.getName());
        holder.tv_price.setText(infor.getPrice());
    }

    @Override
    public int getItemCount() {
        return listInfor.size();
    }

    public class ForYoulVH extends RecyclerView.ViewHolder {
        ImageView iv_img;
        TextView tv_name, tv_price;
        public ForYoulVH(@NonNull View itemView) {
            super(itemView);
            iv_img = itemView.findViewById(R.id.iv_img);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_price = itemView.findViewById(R.id.tv_price);
        }
    }
}
