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
import com.example.openfashion.model.Infor;
import java.util.ArrayList;

public class InforAdapter extends RecyclerView.Adapter<InforAdapter.InforVH> {
    private Context context;
    private ArrayList<Infor> listInfor;

    public InforAdapter(Context context, ArrayList<Infor> listInfor) {
        this.context = context;
        this.listInfor = listInfor;
    }

    @NonNull
    @Override
    public InforVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_infor, parent, false);
        return new InforVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InforVH holder, int position) {
        Infor infor = listInfor.get(position);
        holder.iv_avatar.setImageResource(infor.getAvatar());
        holder.tv_name.setText(infor.getName());
    }

    @Override
    public int getItemCount() {
        return listInfor.size();
    }

    public class InforVH extends RecyclerView.ViewHolder {
        ImageView iv_avatar;
        TextView tv_name;
        public InforVH(@NonNull View itemView) {
            super(itemView);
            iv_avatar = itemView.findViewById(R.id.iv_avatar);
            tv_name = itemView.findViewById(R.id.tv_name);
        }
    }
}
