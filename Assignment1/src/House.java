
public class House {
    //Fields
    private String walls;
    private String doors;
    private String windows;
    private String rooms;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    //Getters
    public String getWalls(){ return walls; }
    public String getDoors() { return doors; }
    public String getWindows() { return windows; }
    public String getRooms() { return rooms; }
    public boolean isSwimmingPool() { return hasSwimmingPool; }
    public boolean isGarden() { return hasGarden; }

    //Setters
    public void setWalls(String walls) { this.walls = walls; };
    public void setDoors(String doors) { this.doors = doors; };
    public void setWindows(String windows) { this.windows = windows; };
    public void setRooms(String rooms){ this.rooms = rooms; };
    public void setHasSwimmingPool(boolean hasSwimmingPool){ this.hasSwimmingPool = hasSwimmingPool; };
    public void setHasGarden(boolean hasGarden){ this.hasGarden = hasGarden; };

    //toString
    @Override
    public String toString() {
        String base = "House: Walls {" + walls + "}; Doors {" + doors + "}; Windows {" + windows + "}; Rooms {" + rooms + "}";

        if (hasGarden){
            base += "; Garden {" + true + "}";
        }
        if (hasSwimmingPool) {
            base += "; SwimmingPool {" + true + "}";
        }

        return base + ".";
    }
}
