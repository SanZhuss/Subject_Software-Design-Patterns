public abstract class Builder {
    protected House house = new House();

    public void buildWalls(String walls) {
        house.setWalls(walls);
    }

    public void buildDoors(String doors) {
        house.setDoors(doors);
    }

    public void buildWindows(String windows) {
        house.setWindows(windows);
    }

    public void buildRooms(String rooms) {
        house.setRooms(rooms);
    }

    public abstract House build();
}
