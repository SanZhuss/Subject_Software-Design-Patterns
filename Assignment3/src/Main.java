public class Main {
    static void main(String[] args) {
        Vehicle car = new Car(new ElectricEngine());
        Vehicle truck = new Truck(new GasolineEngine());
        vehicleConstruct(car);
        vehicleConstruct(truck);
    }

    static void vehicleConstruct(Vehicle vehicle){
        IO.println("Vehicle: " + vehicle.vehicleInfo());
        vehicle.start();
        vehicle.showEngineType();
        vehicle.drive();
        vehicle.stop();
        IO.println();
    }
}
