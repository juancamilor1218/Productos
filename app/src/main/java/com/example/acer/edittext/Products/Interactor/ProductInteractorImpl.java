package com.example.acer.edittext.Products.Interactor;

import com.example.acer.edittext.Products.Model.Product;
import com.example.acer.edittext.Products.Presenter.ProductPresenter;
import com.example.acer.edittext.Products.Repository.ProductRepository;

import java.util.List;

/**
 * Created by Acer on 28/05/2018.
 */

public class ProductInteractorImpl implements ProductInteractor{
    private ProductRepository productRepository;
    private ProductPresenter productPresenter;

    @Override
    public void getDataProduct() {
        productRepository.getDataProduct();
    }

    @Override
    public void showResultProduct(List<Product> productList) {
        productPresenter.showResultProduct(productList);
    }
}
