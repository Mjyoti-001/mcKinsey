package com.app.mydemoproject;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CategoryViewModel extends ViewModel {

     CategoryRepository repository;
     MutableLiveData<String> items;
      /*get Repo instance*/

     private void getCategoryItems(){
         items.postValue();
     }

}
