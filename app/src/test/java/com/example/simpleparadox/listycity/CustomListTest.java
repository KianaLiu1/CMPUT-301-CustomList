package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax","NS"));
        assertEquals(list.getCount(),listSize+1);

    }

    @Test
    public void testHasCity(){

        //test city in list
        City city = new City("Charlottetown", "Prince Edward Island");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
        //test city not in list
        City newCity = new City("Calgary", "Alberta");
        assertEquals(false, list.hasCity(newCity));

    }

    @Test
    public void testDeleteSucess(){
        City newCity = new City("Calgary", "Alberta");
        list.addCity(newCity);
        list.delete(newCity);
        assertEquals(false, list.hasCity(newCity));
    }
}
