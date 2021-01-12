package com.example.mvvm.views;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.mvvm.R;
import com.example.mvvm.databinding.FragmentProductDetailsBinding;
import com.example.mvvm.viewmodels.ShopViewModels;


public class ProductDetailsFragment extends Fragment {

    FragmentProductDetailsBinding fragmentProductDetailsBinding;

    ShopViewModels shopViewModels;
    public ProductDetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentProductDetailsBinding = FragmentProductDetailsBinding.inflate(inflater,container,false);
        return fragmentProductDetailsBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        shopViewModels = new ViewModelProvider(requireActivity()).get(ShopViewModels.class);
        fragmentProductDetailsBinding.setShopViewModel(shopViewModels);
    }
}