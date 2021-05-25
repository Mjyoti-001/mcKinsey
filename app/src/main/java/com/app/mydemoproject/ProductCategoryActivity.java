package com.app.mydemoproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductCategoryActivity extends AppCompatActivity implements CategoryListener {
    RecyclerView categories;
    CategoryViewModel catvieModel;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_category);
            categories = findViewById(R.id.category_list);
            getCategories();


        }

    private void getCategories() {
        categories.setAdapter( repo.getCategoryItems());
        }

    @Override
    public void onCategoryClicked(int id) {
         /*Start ProductListActivity*/

        Intent i = new Intent(this, ProductListActivity.class);
        startActivity(i);
    }
}
