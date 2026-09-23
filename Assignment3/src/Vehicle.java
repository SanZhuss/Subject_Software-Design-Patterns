public abstract class Vehicle {
    protected Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public abstract String vehicleInfo();
    public abstract void drive();

    public void start() {
        engine.startEngine();
    }

    public void stop() {
        engine.stopEngine();
    }

    public void showEngineType() {
        IO.println(engine.getEngineType());
    }
}