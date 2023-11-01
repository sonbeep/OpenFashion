package com.example.openfashion.view.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.openfashion.R;
import com.example.openfashion.databinding.HomePageFrgBinding;
import com.example.openfashion.model.Arrival;
import com.example.openfashion.model.Brand;
import com.example.openfashion.model.ForYou;
import com.example.openfashion.model.Infor;
import com.example.openfashion.model.Trending;
import com.example.openfashion.view.adapter.ArrivalAdapter;
import com.example.openfashion.view.adapter.BrandAdapter;
import com.example.openfashion.view.adapter.ForYouAdapter;
import com.example.openfashion.view.adapter.InforAdapter;
import com.example.openfashion.view.adapter.TrendingAdapter;
import com.example.openfashion.viewmodel.CommonVM;
import com.example.openfashion.viewmodel.HomePageVM;

import java.util.ArrayList;

public class HomePageFragment extends BaseFragment<HomePageFrgBinding, HomePageVM> {
    public static final String TAG = HomePageFragment.class.getName();

    @Override
    protected Class<HomePageVM> getClassVM() {
        return HomePageVM.class;
    }

    @Override
    protected void initView() {
        viewModel.initData();
        binding.rcArrival.setAdapter(new ArrivalAdapter(context, viewModel.listArrival));
        binding.rcBrand.setAdapter(new BrandAdapter(context, viewModel.listBrand));
        binding.rcTrending.setAdapter(new TrendingAdapter(context, viewModel.listTrending));
        binding.rcInfor.setAdapter(new InforAdapter(context, viewModel.listInfor));
        binding.rcForyou.setAdapter(new ForYouAdapter(context, viewModel.listForYou));
    }

    @Override
    protected HomePageFrgBinding initViewBinding(@NonNull LayoutInflater inflater, @Nullable ViewGroup container) {
        return HomePageFrgBinding.inflate(inflater, container, false);
    }
}
