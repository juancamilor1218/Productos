package com.example.acer.edittext.ApiRest;

import com.example.acer.edittext.Products.Model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Acer on 28/05/2018.
 */

public interface Service {

    @GET(Constants.URL_GET_PRODUCTS)
    Call<List<Product>> getDataProducts();

}
