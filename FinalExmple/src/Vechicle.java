public class Vechicle {

    private final static Integer NO_OF_WHEELS = 4;
    private String model;
    private String type;

    public Integer getNoOfWheels() {
        return NO_OF_WHEELS;
    }

    public Vechicle(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public Vechicle() {
    }

    // Complier Error
//    public void setNoOfWheels(Integer wheels) {
//        this.noOfWheels = wheels;
//    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printVechicleDetails() {
        System.out.println("Vechile details=Model:"+model);
    }
}
