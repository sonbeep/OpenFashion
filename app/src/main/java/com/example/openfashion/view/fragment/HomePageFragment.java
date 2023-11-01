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

import java.util.ArrayList;

public class HomePageFragment extends BaseFragment<HomePageFrgBinding, CommonVM> {
    public static final String TAG = HomePageFragment.class.getName();
    private ArrayList<Arrival> listArrival = new ArrayList<>();
    private ArrayList<Brand> listBrand = new ArrayList<>();
    private ArrayList<Trending> listTrending = new ArrayList<>();
    private ArrayList<Infor> listInfor = new ArrayList<>();
    private ArrayList<ForYou> listForYou = new ArrayList<>();
    @Override
    protected Class<CommonVM> getClassVM() {
        return CommonVM.class;
    }

    @Override
    protected void initView() {
        initData();
        binding.rcArrival.setAdapter(new ArrivalAdapter(context, listArrival));
        binding.rcBrand.setAdapter(new BrandAdapter(context, listBrand));
        binding.rcTrending.setAdapter(new TrendingAdapter(context, listTrending));
        binding.rcInfor.setAdapter(new InforAdapter(context, listInfor));
        binding.rcForyou.setAdapter(new ForYouAdapter(context, listForYou));
    }

    private void initData() {
        listArrival.add(new Arrival(R.drawable.img_arrival, "21WN reversible angora cardigan", "$120"));
        listArrival.add(new Arrival(R.drawable.img_arrival, "21WN reversible angora cardigan", "$120"));
        listArrival.add(new Arrival(R.drawable.img_arrival, "21WN reversible angora cardigan", "$120"));
        listArrival.add(new Arrival(R.drawable.img_arrival, "21WN reversible angora cardigan", "$120"));

        listBrand.add(new Brand(R.drawable.prada));
        listBrand.add(new Brand(R.drawable.burberry));
        listBrand.add(new Brand(R.drawable.boss));
        listBrand.add(new Brand(R.drawable.catier));
        listBrand.add(new Brand(R.drawable.gucci));
        listBrand.add(new Brand(R.drawable.tiffany_co));

        listTrending.add(new Trending("#2021"));
        listTrending.add(new Trending("#spring"));
        listTrending.add(new Trending("#collection"));
        listTrending.add(new Trending("#fall"));
        listTrending.add(new Trending("#dress"));
        listTrending.add(new Trending("#autumncollection"));
        listTrending.add(new Trending("#openfashion"));

        listInfor.add(new Infor(R.drawable.avatar, "mia"));
        listInfor.add(new Infor(R.drawable.avatar, "mia"));
        listInfor.add(new Infor(R.drawable.avatar, "mia"));
        listInfor.add(new Infor(R.drawable.avatar, "mia"));

        listForYou.add(new ForYou(R.drawable.img_arrival, "21WN reversible angora cardigan", "$120"));
        listForYou.add(new ForYou(R.drawable.img_arrival, "21WN reversible angora cardigan", "$120"));
        listForYou.add(new ForYou(R.drawable.img_arrival, "21WN reversible angora cardigan", "$120"));
        listForYou.add(new ForYou(R.drawable.img_arrival, "21WN reversible angora cardigan", "$120"));

    }

    @Override
    protected HomePageFrgBinding initViewBinding(@NonNull LayoutInflater inflater, @Nullable ViewGroup container) {
        return HomePageFrgBinding.inflate(inflater, container, false);
    }
}
