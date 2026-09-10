public class House {
    private String Walls;
    private String Doors;
    private String Windows;
    private String Rooms;
    private boolean HasSwimmingPool;
    private boolean HasGarden;

    //Getters
    public String getWalls(){ return Walls; }
    public String getDoors() { return Doors; }
    public String getWindows() { return Windows; }
    public String getRooms() { return Rooms; }
    public boolean isSwimmingPool() { return HasSwimmingPool; }
    public boolean isGarden() { return HasGarden; }

    //Setters
    public void setWalls(String walls) { this.Walls = walls; };
    public void setDoors(String doors) { this.Doors = doors; };
    public void setWindows(String windows) { this.Windows = windows; };
    public void setRooms(String rooms){ this.Rooms = rooms; };
    public void setHasSwimmingPool(boolean hasSwimmingPool){ this.HasSwimmingPool = hasSwimmingPool; };
    public void setHasGarden(boolean hasGarden){ this.HasGarden = hasGarden; };

    //toString
    @Override
    public String toString() {
        String base = "House with " + Walls + " walls " + Doors + " doors " + Rooms + " Rooms";

        if (HasGarden){
            base += " with garden";
        }
        if (HasSwimmingPool) {
            base += " with swimming pool";
        }

        return base + ".";
    }
}
