package com.tot;

public class FoodApp {
    public static void main(String[] args) {
        Food f1 = new Food("Shivtej", 100);
        Food f2 = new Food("Tej", 200);

        FoodItem fi = new FoodItem(f1, f2);
        fi.compare();
    }
}
