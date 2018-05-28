package com.example.acer.edittext.Products.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.acer.edittext.Products.Model.Product;
import com.example.acer.edittext.R;

import java.util.List;

/**
 * Created by Acer on 28/05/2018.
 */

public class ProductsAdapter extends RecyclerView.Adapter {
    List<Product> productList;
    Context context;

    public ProductsAdapter(List<Product> productList, Context context) {
        this.productList = productList;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_home, false);
        return new ViewHolderProduct(item);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Product product=productList.get(position);
        ViewHolderProduct viewHolderProduct=(ViewHolderProduct) holder;

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolderProduct extends RecyclerView.ViewHolder {

        public ViewHolderProduct(View itemView) {
            super(itemView);

        }
    }
}