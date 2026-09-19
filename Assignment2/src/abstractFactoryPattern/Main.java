package abstractFactoryPattern;

public class Main {

    static void createCar(CarFactory factory){
        IO.println("===============================");
        Engine engine = factory.createEngine();
        Wheel wheel = factory.createWheel();
        Interior interior = factory.createInterior();

        engine.start();

        System.out.println("Power: " + engine.getPower());

        System.out.println("Wheel size: " + wheel.getSize());
        wheel.rotate();

        System.out.println("Seats: " + interior.getSeats());
        interior.showDetails();

        engine.stop();

        IO.println("===============================\n");
    }

    static void main(String[] args) {

        CarFactory factoryToyota = new ToyotaFactory();

        CarFactory factoryBMW = new BMWFactory();

        createCar(factoryToyota);
        createCar(factoryBMW);

    }
}