
class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Car myCar1 = new Car("suzuki", "xxx");
        Car myCar2 = new Car(null, null);

        System.out.println("My Car 1 Make: " + myCar1.getMake());
        System.out.println("My Car 1 Model: " + myCar1.getModel());
        System.out.println("My Car 2 Make: " + myCar2.getMake());
        System.out.println("My Car 2 Model: " + myCar2.getModel());

        myCar2.setMake("TATA");
        myCar2.setModel("PUNCH");

        System.out.println("My Car 2 Make: " + myCar2.getMake());
        System.out.println("My Car 2 Model: " + myCar2.getModel());
    }
}