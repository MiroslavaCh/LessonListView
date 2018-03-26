package com.example.mires.lessonlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Main32Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main32);

        PersonAdapter forbesAdapter = new PersonAdapter(this, makePerson());
        ListView lvf = findViewById(R.id.listViewForbes);
        lvf.setAdapter(forbesAdapter);
    }

    Person[] makePerson() {
        Person[] arr = new Person[30];

        String[] nameArr = {"Bill Gates", "Warren Buffett", "Jeff Bezos", "Amancio Ortega", "Mark Zuckerberg",
                "Carlos Slim Helu","Larry Ellison", "Charles Koch","David Koch", "Michael Bloomberg",
                "Bernard Arnault", "Larry Page", "Sergei Brin", "Liliane Bettencourt", "S. Robson Walton",
                "Jim Walton", "Alice Walton", "Wang Jianlin", "Li Ka-shing", "Sheldon Adelson", "Steve Ballmer",
                "Jorge Paulo Lemann", "Jack Ma", "Beate Heister & Karl Albrecht Jr.", "David Thopson",
                "Jacqueline Mars", "Johc Mars", "Phil Knight", "Maria Franca Fissolo", "George Soros"};
        String[] moneyArr = {"$86B","$75.6B", "$72.8B", "$71.3B", "$56B", "$54.5B", "$52.2B", "$48.3B", "$48.3B",
                "$47.5B", "$41.5B", "$40.7B", "$39.8B", "$39.5B", "$34.1B", "$34B", "$33.8B", "$31.3B", "$31.2B",
                "$30.4B", "$30B", "$29.2B", "$28.3B", "$27.2B", "$27.2B", "$27B", "$27B", "$26.2B", "$25.2B", "$25.2"};
        int flagResArr[] = {R.drawable.flag_brazil, R.drawable.flag_canada, R.drawable.flag_china, R.drawable.flag_france,
                R.drawable.flag_germany, R.drawable.flag_hong_kong, R.drawable.flag_italy, R.drawable.flag_mexico,
                R.drawable.flag_spain, R.drawable.flag_united_states};


        for (int i = 0; i < arr.length; i++) {
            arr[i]= new Person();
            arr[i].money = moneyArr[i];
            arr[i].name = nameArr[i];
            arr[i].flagRes = flagResArr[i];

        }
        return arr;
    }
}
