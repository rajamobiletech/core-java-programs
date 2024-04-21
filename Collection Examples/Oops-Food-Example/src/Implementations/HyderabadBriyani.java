package Implementations;

import Interfaces.BriyaniFood;
import Interfaces.Food;

public class HyderabadBriyani implements BriyaniFood {
    @Override
    public void masalaPreparation() {
        System.out.println("Briyani masala Preparation");
    }

    @Override
    public void prepare() {
        System.out.println("Briyani Interfaces.Food Preparation");
    }

    @Override
    public void vessels() {
        System.out.println("Collection Vessels for Briyani food");
    }

    @Override
    public void cutting() {
        System.out.println("Cutting Meat for Briyani food");
    }
}
