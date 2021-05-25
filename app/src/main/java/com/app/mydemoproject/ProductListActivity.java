package com.app.mydemoproject;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductListActivity extends AppCompatActivity {
    ProductRepository repository;
    RecyclerView productAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productlist);
        productAdapter = findViewById(R.id.products_name);
        getProductsFromCategoryId();


    }

    private void getProductsFromCategoryId() {

       productAdapter.setAdapter(repository.getProductList());

    }

}
