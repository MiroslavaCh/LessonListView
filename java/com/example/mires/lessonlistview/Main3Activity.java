package com.example.mires.lessonlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ListActivity;

import android.view.View;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main3Activity extends ListActivity  {

    String[] myArr = {"Январь", "Февраль", "Март", "Апрель",
            "Май", "Июнь", "Июль", "Август",
            "Сентябрь", "Октябрь", "Ноябрь", "Декабрь",
            "Весна", "Лето", "Осень", "Зима"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> monthAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myArr);
        setListAdapter(monthAdapter);

        myArr[11] = "November";
        monthAdapter.notifyDataSetInvalidated();
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String month = (String) getListAdapter().getItem(position);
        Toast.makeText(this, month, Toast.LENGTH_SHORT).show();
    }
}
