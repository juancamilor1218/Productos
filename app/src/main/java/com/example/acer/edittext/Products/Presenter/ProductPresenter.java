package com.example.acer.edittext.Products.Presenter;

import com.example.acer.edittext.Products.Model.Product;

import java.util.List;

/**
 * Created by Acer on 28/05/2018.
 */

public interface ProductPresenter {
    void showResultProduct(List<Product> productList);
    void getDataProduct();
}
