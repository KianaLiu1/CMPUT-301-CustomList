package com.example.simpleparadox.listycity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList extends ArrayAdapter<City> {

    private ArrayList<City> cities;
    private Context context;

    public CustomList(Context context, ArrayList<City> cities){
        super(context,0, cities);
        this.cities = cities;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.content, parent,false);
        }

        City city = cities.get(position);

        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;

    }


    /**
     * this function get size of list
     * @return
     */
    @Override
    public int getCount(){
        return cities.size();
    }

    /**
     * this function will add a city
     * @return
     */
    public void addCity(City city){
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns boolean to check if a list has a city
     * @return
     * Return bool
     */
    public boolean hasCity(City city){
        if (cities.contains(city)) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * This deletes a city from the list if the city exists
     * @param city
     * This is a candidate city to delete
     */
    public void delete(City city){
//        if (!cities.contains(city)) {
//            throw new IllegalArgumentException();
//        }
//        cities.remove(city);
        return;
    }

}
