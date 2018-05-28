package com.example.acer.edittext.Products.Repository;

import com.example.acer.edittext.ApiRest.RestApiAdapter;
import com.example.acer.edittext.ApiRest.Service;
import com.example.acer.edittext.Products.Model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Acer on 28/05/2018.
 */

public class ProductRepositoryImpl implements ProductRepository {

    List<Product> productList;
    @Override
    public void getDataProduct() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service= restApiAdapter.getClientService();
        Call<List<Product>> products=service.getDataProducts();
        products.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                productList=response.body();
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {

            }
        });
    }
}
