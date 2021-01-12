package com.example.mvvm.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.mvvm.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {
    private MutableLiveData<List<Product>> mutableProductList;
    public LiveData<List<Product>> getProducts(){
        if (mutableProductList == null){
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }
    private void loadProducts(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(),"Vivo x50 pro",49990,true,"https://static.digit.in/default/7ee5904c449a41e689938e3989e1bf1239c678b7.jpeg?tr=1200"));
        productList.add(new Product(UUID.randomUUID().toString(),"Vivo s1 Prime",18990,false,"https://assets.mspimages.in/wp-content/uploads/2020/08/Vivo-S1-Prime-2.png"));
        productList.add(new Product(UUID.randomUUID().toString(),"Vivo V19",24990,true,"https://static.digit.in/default/ecc9bccbe133b207187e07937c24e4ab0a05c826.jpeg?tr=1200"));
        productList.add(new Product(UUID.randomUUID().toString(),"Vivo x30",14999,false,"https://www.vopmart.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/x/3/x30-pro.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(),"Vivo z1x",16000,true,"https://static.toiimg.com/thumb/msid-71033162,width-1200,resizemode-4/71033162.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(),"Vivo U20",17990,false,"https://fdn2.gsmarena.com/vv/pics/vivo/vivo-u20-1.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(),"Vivo U10",10999,true,"https://www.bgr.in/wp-content/uploads/2019/09/Vivo-U10-2.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(),"Vivo Y5s",14999,false ,"https://i.gadgets360cdn.com/large/vivo_y5s_thumb_1573044636542.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(),"Vivo Y11",9999,true,"https://fdn2.gsmarena.com/vv/pics/vivo/vivo-y11-2019-1.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(),"Vivo z1 pro",11999,true,"https://imgk.timesnownews.com/story/1562238088-vivo-z1-pro-review-2.jpg?tr=w-600,h-450"));
        productList.add(new Product(UUID.randomUUID().toString(),"Vivo Nex",52999,true,"https://i2.wp.com/www.pdevice.com/wp-content/uploads/2019/09/Vivo-Nex-3.jpg?fit=450%2C450&ssl=1"));
        productList.add(new Product(UUID.randomUUID().toString(),"Vivo Y20i",11999,true,"https://i0.wp.com/technosports.co.in/wp-content/uploads/2020/08/Vivo-Y20-Y20i-NoypiGeeks.jpg?resize=1024%2C576&ssl=1"));
        productList.add(new Product(UUID.randomUUID().toString(),"Vivo Y30",14999,true,"https://manual-user-guide.com/images/phones/vivo_y30.png"));
        productList.add(new Product(UUID.randomUUID().toString(),"Vivo Y53",9999,true,"https://5.imimg.com/data5/CU/EO/MY-50912093/vivo-y53-500x500.jpg"));

        mutableProductList.setValue(productList);
    }

}
