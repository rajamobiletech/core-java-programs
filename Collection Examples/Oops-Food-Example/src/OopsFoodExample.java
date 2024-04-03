import Implementations.HyderabadBriyani;
import Implementations.NonVegFood;
import Implementations.VegFood;
import Interfaces.BriyaniFood;

public class OopsFoodExample {
    public static void main(String[] args) {
        VegFood vegFood = new VegFood();
        vegFood.vessels();
        vegFood.cutting();
        vegFood.prepare();

        System.out.println("==================");
        NonVegFood nonVegFood = new NonVegFood();
        nonVegFood.vessels();
        nonVegFood.cutting();
        nonVegFood.prepare();

        System.out.println("==================");
        HyderabadBriyani hyderabadBriyani = new HyderabadBriyani();
        hyderabadBriyani.vessels();
        hyderabadBriyani.masalaPreparation();
        hyderabadBriyani.cutting();
        hyderabadBriyani.prepare();
    }
}
