package com.app.mydemoproject;

import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class ProductRepository {
    Call<List<Category>> call = RetrofitClient.getInstance().getMyApi().getCategories();
        call.enqueue(new Callback<List<Category>>() {
        @Override
        public void onResponse(Call<List<Category>> call, Response<List<Category>> response) {
            List<Category> categoryList = response.body();
            //   categories.setAdapter((new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, categoryList));

        }

        @Override
        public void onFailure(Call<List<Category>> call, Throwable t) {
            Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();

        }
    });
}
