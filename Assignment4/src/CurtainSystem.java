public class CurtainSystem {

    private boolean opened;

    public void openCurtains() {
        opened = true;
        IO.println("Curtains opened.");
    }

    public void closeCurtains() {
        opened = false;
        IO.println("Curtains closed.");
    }
}