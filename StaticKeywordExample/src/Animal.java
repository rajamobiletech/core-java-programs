public class Animal {

    static {
        System.out.println("Inside static code");
        noOfLegs = 6;
    }
    public static Integer noOfLegs;
    public String foodType;

    public Animal() {
        System.out.println("Inside constructor");
    }

    public static Integer getNoOfLegs() {
        return noOfLegs;
    }
    public static void setNoOfLegs(Integer noOfLegs) {
        Animal.noOfLegs = noOfLegs;
    }


    public static void printMyAnimal() {
        noOfLegs = 12;
        System.out.println("printMyAnimal method called");
    }


    public  void printAnimal() {
        foodType = "Veg";
        System.out.println("printAnimal method called");
    }



}
