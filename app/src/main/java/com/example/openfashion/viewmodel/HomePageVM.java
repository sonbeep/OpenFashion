package com.example.openfashion.viewmodel;

import com.example.openfashion.R;
import com.example.openfashion.model.Arrival;
import com.example.openfashion.model.Banner;
import com.example.openfashion.model.Brand;
import com.example.openfashion.model.Count;
import com.example.openfashion.model.ForYou;
import com.example.openfashion.model.Infor;
import com.example.openfashion.model.Trending;

import java.util.ArrayList;

public class HomePageVM extends BaseViewModel{
    public ArrayList<Arrival> listArrival = new ArrayList<>();
    public ArrayList<Brand> listBrand = new ArrayList<>();
    public ArrayList<Trending> listTrending = new ArrayList<>();
    public ArrayList<Infor> listInfor = new ArrayList<>();
    public ArrayList<ForYou> listForYou = new ArrayList<>();
    public ArrayList<Banner> listBanner = new ArrayList<>();
    public ArrayList<Count> listCount = new ArrayList<>();
    public void initData() {
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

        listBanner.add(new Banner(R.drawable.bg_home_page));
        listBanner.add(new Banner(R.drawable.bg_home_page));
        listBanner.add(new Banner(R.drawable.bg_home_page));
        listBanner.add(new Banner(R.drawable.bg_home_page));
        for (int i = 0 ; i < listBanner.size(); i++){
            listCount.add(new Count(R.drawable.ic_choose));
        }

    }
}
