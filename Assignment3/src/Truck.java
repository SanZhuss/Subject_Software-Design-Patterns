public class Truck extends Vehicle {

    public Truck(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.println("Truck is transporting cargo");
    }

    @Override
    public String vehicleInfo(){
        return "Truck";
    }
}