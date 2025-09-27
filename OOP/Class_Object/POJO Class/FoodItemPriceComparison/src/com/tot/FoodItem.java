package com.tot;

public class FoodItem {
    private Food[] foods;

    // Constructor accepts multiple Food objects
    public FoodItem(Food... foods) {
        this.foods = foods;
    }

    public void compare() {
        if (foods.length == 0) {
            System.out.println("No food items to compare.");
            return;
        }

        Food maxFood = foods[0];

        for (Food f : foods) {
            if (f.getPrice() > maxFood.getPrice()) {
                maxFood = f;
            }
        }

        System.out.println("Most expensive food item: " + maxFood.getName() + " with price " + maxFood.getPrice());
    }
}
