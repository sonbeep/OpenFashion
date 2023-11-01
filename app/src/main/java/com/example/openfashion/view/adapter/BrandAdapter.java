package com.example.openfashion.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.openfashion.R;
import com.example.openfashion.model.Brand;

import java.util.ArrayList;

public class BrandAdapter extends RecyclerView.Adapter<BrandAdapter.BrandVH> {
    private Context context;
    private ArrayList<Brand> listBrand;

    public BrandAdapter(Context context, ArrayList<Brand> listBrand) {
        this.context = context;
        this.listBrand = listBrand;
    }

    @NonNull
    @Override
    public BrandVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_brand, parent, false);
        return new BrandVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BrandVH holder, int position) {
        Brand brand = listBrand.get(position);
        holder.iv_brand.setImageResource(brand.getDetailBrand());
    }

    @Override
    public int getItemCount() {
        return listBrand.size();
    }

    public class BrandVH extends RecyclerView.ViewHolder {
        ImageView iv_brand;
        public BrandVH(@NonNull View itemView) {
            super(itemView);
            iv_brand = itemView.findViewById(R.id.iv_brand);
        }
    }
}
