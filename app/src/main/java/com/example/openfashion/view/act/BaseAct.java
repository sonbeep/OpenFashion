package com.example.openfashion.view.act;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;


import com.example.openfashion.OnMainCallback;
import com.example.openfashion.R;
import com.example.openfashion.view.fragment.BaseFragment;
import com.example.openfashion.view.fragment.CommonFragment;
import java.lang.reflect.Constructor;

public abstract class BaseAct<T extends ViewBinding, V extends ViewModel> extends AppCompatActivity implements View.OnClickListener, OnMainCallback {
    protected T binding;
    protected V viewModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = initViewBinding();
        setContentView(binding.getRoot());
        viewModel = new ViewModelProvider(this).get(getClassVM());
        initView();
    }

    protected abstract Class<V> getClassVM();

    protected abstract void initView();

    protected abstract T initViewBinding();

    @Override
    public  void onClick(View view){}

    @Override
    public void showFragment(String tag, Object data, boolean isBack){
        try {
            Class<?> calzz = Class.forName(tag);
            Constructor<?> constructor = calzz.getConstructor();
            BaseFragment<?,?> baseFragment = (BaseFragment<?,?>) constructor.newInstance();
            baseFragment.setCallback(this);
            baseFragment.setData(data);
            FragmentTransaction tran = getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.ln_main, baseFragment, CommonFragment.TAG);
            if (isBack){
                tran.addToBackStack(null);
            }
            tran.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
