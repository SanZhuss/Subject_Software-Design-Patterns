public class SecuritySystem {

    private boolean armed;

    public void armSystem() {
        this.armed = true;
        IO.println("Security system armed.");
    }

    public void disarmSystem() {
        this.armed = false;
        IO.println("Security system disarmed.");
    }
}
