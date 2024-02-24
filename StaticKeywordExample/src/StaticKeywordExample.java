public class StaticKeywordExample {

    public static String str = "Raja Duraisamy";

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.printAnimal();
        Animal.printMyAnimal();
        System.out.println(Animal.noOfLegs);

        StaticKeywordExample.Sample obj = new StaticKeywordExample.Sample();
        obj.display();

    }

    static class Sample {
        public void display(){
            System.out.println(str);
        }
    }



}
