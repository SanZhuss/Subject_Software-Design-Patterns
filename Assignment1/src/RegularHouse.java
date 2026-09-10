public class RegularHouse implements Builder{
    private House house = new House();

    @Override
    public void buildWalls(String walls) {
        house.setWalls(walls);
    }

    @Override
    public void buildDoors(String doors) {
        house.setDoors(doors);
    }

    @Override
    public void buildWindows(String windows) {
        house.setWindows(windows);
    }

    @Override
    public void buildRooms(String rooms) {
        house.setRooms(rooms);
    }

    @Override
    public void buildSwimmingPool(boolean hasSwimmingPool) {
        house.setHasSwimmingPool(hasSwimmingPool);
    }

    @Override
    public void buildGarden(boolean hasGarden) {
        house.setHasGarden(hasGarden);
    }

    @Override
    public House getResult() {
        return house;
    }
}
