package com.mycompany.restaurantapp.food;

import com.mycompany.restaurantapp.values.DishType;
import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> dishList;
    
    public Menu() {
        this.dishList = new ArrayList<>();
    }
    
    public void addDish(Dish dish) {
        this.dishList.add(dish);
    }
    
    public void showMenu() {
        System.out.println("*** --- MENÚ --- ***");
        
        for(DishType dishType : DishType.values()) {
            System.out.println("--- " + dishType + " ---");
            
            for(Dish dish : dishList) {
                if(dish.getType() == dishType) {
                    System.out.println(dish.getName());
                }
            }   
        }
    }
}
