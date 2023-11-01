package com.example.openfashion.view.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.openfashion.databinding.CommonFrgBinding;
import com.example.openfashion.viewmodel.CommonVM;


public class CommonFragment extends BaseFragment<CommonFrgBinding, CommonVM> {
    public static final String TAG = CommonFragment.class.getName();

    @Override
    protected Class<CommonVM> getClassVM() {
        return CommonVM.class;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected CommonFrgBinding initViewBinding(@NonNull LayoutInflater inflater, @Nullable ViewGroup container) {
        return CommonFrgBinding.inflate(inflater, container, false);
    }


}
