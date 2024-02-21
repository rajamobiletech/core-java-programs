public class Car {

    static Integer wheel = 4;
    private String type;
    private Integer airBagCount;

    public Car(String type, Integer airBagCount) {
        this.type = type;
        this.airBagCount = airBagCount;
    }

    public static Integer getWheel() {
        return wheel;
    }

    public String getType() {
        return type;
    }

    public Integer getAirBagCount() {
        return airBagCount;
    }

    public void drive() {
        System.out.println("Car is running with "+wheel+" wheels");
    }

}
