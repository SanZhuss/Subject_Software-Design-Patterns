public class Car extends Vehicle {

    public Car(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }

    @Override
    public String vehicleInfo(){
        return "Car";
    }
}