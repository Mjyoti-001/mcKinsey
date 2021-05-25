package com.app.mydemoproject;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CategoryAdapter extends BaseAdapter {
    private Category categoryItems;

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView categoryName = convertView.findViewById(R.id.categoryItemName);
        categoryName.setText(categoryItems.getName());

        categoryName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // listener.onCategoryClicked(categoryItems.getId());
            }
        });
        return null;
    }
}
