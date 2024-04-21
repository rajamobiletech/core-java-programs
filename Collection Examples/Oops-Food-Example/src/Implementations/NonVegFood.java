package Implementations;

import Interfaces.Food;

public class NonVegFood implements Food {

    @Override
    public void prepare() {
        System.out.println("Non Veg Interfaces.Food Preparation");
    }

    @Override
    public void vessels() {
        System.out.println("Collection Vessels for Non veg food");
    }

    @Override
    public void cutting() {
        System.out.println("Cutting Meat for non veg food");
    }
}
