package Implementations;

import Interfaces.Food;

public class VegFood implements Food {

    @Override
    public void prepare() {
        System.out.println("Veg Interfaces.Food Preparation");
    }

    @Override
    public void vessels() {
        System.out.println("Collection Vessels for veg food");
    }

    @Override
    public void cutting() {
        System.out.println("Cutting vegtables for veg food");
    }
}
