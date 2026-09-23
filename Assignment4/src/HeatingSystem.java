public class HeatingSystem {

    private boolean heatingOn;
    private double temperature;

    public void turnOn() {
        heatingOn = true;
        IO.println("Heating system turned on.");
    }

    public void turnOff() {
        heatingOn = false;
        IO.println("Heating system turned off.");
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        IO.println("Temperature set to " + temperature + "°C.");
    }
}