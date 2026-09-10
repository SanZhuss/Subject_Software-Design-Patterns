public interface Builder {
    void buildWalls(String walls);
    void buildDoors(String doors);
    void buildWindows(String windows);
    void buildRooms(String rooms);
    void buildSwimmingPool(boolean hasSwimmingPool);
    void buildGarden(boolean hasGarden);
    House getResult();
}
