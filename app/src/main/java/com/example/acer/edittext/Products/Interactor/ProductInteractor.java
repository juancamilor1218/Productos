package com.example.acer.edittext.Products.Interactor;

import com.example.acer.edittext.Products.Model.Product;

import java.util.List;

/**
 * Created by Acer on 28/05/2018.
 */

public interface ProductInteractor {
    void getDataProduct();
    void showResultProduct(List<Product> productList);
}
