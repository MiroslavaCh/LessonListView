package com.example.mires.lessonlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonAdapter extends ArrayAdapter<Person> {

    public PersonAdapter(Context context, Person[] arr) {
        //Опечатки - это страшная вещь
        super(context, R.layout.list_forbse_item, arr);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Person person = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_forbse_item, null);
        }

        ((TextView) convertView.findViewById(R.id.name)).setText(person.name);
        ((TextView) convertView.findViewById(R.id.money)).setText(String.valueOf(person.money));
        ((TextView) convertView.findViewById(R.id.flag)).setText(String.valueOf(person.flagRes));

        if(person.name == ("Amancio Ortega"))          ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_spain);
        if(person.name == ("Carlos Slim Helu"))        ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_mexico);
        if(person.name == ("Bernard Arnault"))         ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_france);
        if(person.name == ("Liliane Bettencourt"))     ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_france);
        if(person.name == ("Wang Jianlin"))            ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_china);
        if(person.name == ("Li Ka-shing"))             ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_hong_kong);
        if(person.name == ("Jorge Paulo Lemann"))      ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_brazil);
        if(person.name == ("Jack Ma"))                 ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_china);
        if(person.name == ("Beate Heister & Karl Albrecht Jr."))            ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_germany);
        if(person.name == ("David Thopson"))           ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_canada);
        if(person.name == ("Maria Franca Fissolo"))    ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_italy);

        return convertView;

    }
}
