package com.app.mydemoproject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://enigmatic-coast-6264.herokuapp.com/categories";
    @GET("")
    Call<List<Category>> getCategories();

//    @GET("")
//    //Call<List<Product>> getProducts();

}
