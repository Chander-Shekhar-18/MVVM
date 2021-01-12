package com.example.mvvm.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm.models.CartItem;
import com.example.mvvm.models.Product;
import com.example.mvvm.repositories.CartRepo;
import com.example.mvvm.repositories.ShopRepo;

import java.util.List;

public class ShopViewModels extends ViewModel {

    ShopRepo shopRepo = new ShopRepo();
    CartRepo cartRepo = new CartRepo();

    MutableLiveData<Product> mutableProduct = new MutableLiveData<>();

    public LiveData<List<Product>> getProducts(){
        return shopRepo.getProducts();
    }
    public void setProduct(Product product){
        mutableProduct.setValue(product);
    }
    public LiveData<Product> getProduct(){
        return mutableProduct;
    }
    public LiveData<List<CartItem>> getCart(){
        return cartRepo.getCart();
    }
    public boolean addItemToCart(Product product){
        return cartRepo.addItemToCart(product);
    }
    public void removeItemFromCart(CartItem cartItem){
        cartRepo.removeItemFromCart(cartItem);
    }
    public void changeQuantity(CartItem cartItem,int quantity){
        cartRepo.changeQuantity(cartItem,quantity);
    }
    public LiveData<Double> getTotalPrice(){
        return cartRepo.getTotalPrice();
    }
    public void resetCart(){
        cartRepo.initCart();
    }
}
