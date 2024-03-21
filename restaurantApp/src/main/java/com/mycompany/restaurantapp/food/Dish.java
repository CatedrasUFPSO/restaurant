package com.mycompany.restaurantapp.food;

import com.mycompany.restaurantapp.values.DishType;
import com.mycompany.restaurantapp.values.DishVariation;

public class Dish {
    private String name;
    private DishType type;
    private int stock;
    private int price;
   
    DishVariation variation;

    public Dish(String name, DishType type, int stock, int price, DishVariation variation) {
        this.name = name;
        this.type = type;
        this.stock = stock;
        this.price = price;
        this.variation = variation;
    }

    public String getName() {
        return name;
    }

    public DishType getType() {
        return type;
    }
    
    
}
