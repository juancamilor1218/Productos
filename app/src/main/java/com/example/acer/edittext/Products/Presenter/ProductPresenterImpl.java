package com.example.acer.edittext.Products.Presenter;

import com.example.acer.edittext.Products.Interactor.ProductInteractor;
import com.example.acer.edittext.Products.Model.Product;
import com.example.acer.edittext.Products.View.ProductView;

import java.util.List;

/**
 * Created by Acer on 28/05/2018.
 */

public class ProductPresenterImpl implements ProductPresenter {
    private ProductInteractor productInteractor;
    private ProductView productView;


    @Override
    public void showResultProduct(List<Product> productList) {
        productView.showResultProducts(productList);
    }

    @Override
    public void getDataProduct() {
        productInteractor.getDataProduct();
    }
}
