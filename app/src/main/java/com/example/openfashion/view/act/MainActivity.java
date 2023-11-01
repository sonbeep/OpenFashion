package com.example.openfashion.view.act;
import android.view.View;

import com.example.openfashion.databinding.MainActivityBinding;
import com.example.openfashion.view.fragment.HomePageFragment;
import com.example.openfashion.viewmodel.CommonVM;

public class MainActivity extends BaseAct<MainActivityBinding, CommonVM> {
    @Override
    protected Class<CommonVM> getClassVM() {
        return CommonVM.class;
    }

    @Override
    protected void initView() {
        showFragment(HomePageFragment.TAG, null, false);
    }

    @Override
    public void onClick(View view) {
    }

    @Override
    protected MainActivityBinding initViewBinding() {
        return MainActivityBinding.inflate(getLayoutInflater());
    }

}