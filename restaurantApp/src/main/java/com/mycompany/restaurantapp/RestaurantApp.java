package com.mycompany.restaurantapp;

import com.mycompany.restaurantapp.food.Dish;
import com.mycompany.restaurantapp.food.Menu;
import com.mycompany.restaurantapp.people.Customer;
import com.mycompany.restaurantapp.values.CustomerRole;
import com.mycompany.restaurantapp.values.DishType;
import com.mycompany.restaurantapp.values.DishVariation;

public class RestaurantApp {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "asd", "Fulanito de Tal");
        student.sellFood();
        
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE, "sss", "Sutanito de tal");
        administrative.sellFood();
        
        Menu menu = new Menu();
        
        Dish dish1 = new Dish("Huevos pericos", DishType.BREAKFAST, 20, 2400, DishVariation.OPTION1);
        Dish dish2 = new Dish("Caldo con arepa", DishType.BREAKFAST, 20, 2400, DishVariation.OPTION2);
        Dish dish3 = new Dish("Arroz chino", DishType.LUNCH, 20, 2400, DishVariation.OPTION1);
        
        menu.addDish(dish1);
        menu.addDish(dish2);
        menu.addDish(dish3);
        
        menu.showMenu();
    }
}
