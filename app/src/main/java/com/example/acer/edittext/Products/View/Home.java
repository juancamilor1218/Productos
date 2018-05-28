package com.example.acer.edittext.Products.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.acer.edittext.Products.Adapter.ProductsAdapter;
import com.example.acer.edittext.Products.Model.Product;
import com.example.acer.edittext.Products.Presenter.ProductPresenter;
import com.example.acer.edittext.R;

import java.util.List;

public class Home extends AppCompatActivity implements ProductView {
    RecyclerView recyclerView;
    ProductPresenter productPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView=(RecyclerView)findViewById(R.id.id_rcv_products);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        productPresenter.getDataProduct();
    }

    @Override
    public void showResultProducts(List<Product> productList) {
        recyclerView.setAdapter(new ProductsAdapter(productList,getApplicationContext()));
    }
}
