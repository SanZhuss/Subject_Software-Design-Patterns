public class Car extends Vehicle {

    public Car(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        IO.println("Car is driving");
    }

    @Override
    public String vehicleInfo(){
        return "Car";
    }
}