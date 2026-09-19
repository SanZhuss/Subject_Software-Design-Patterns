public class Main {
    static void main(String[] args) {
        Director director = new Director();

        //Director building 3 types houses
        //Regular
        Builder builder1 = new RegularHouse();
        House regularHouse = director.construct(builder1);

        //SwimmingPool
        Builder builder2 = new HouseWithSwimmingPool();
        House houseWithSwimmingPool = director.construct(builder2);

        //Garden
        Builder builder3 = new HouseWithGarden();
        House houseWithGarden = director.construct(builder3);

        //Print Result of Building
        IO.println(regularHouse + "\n" + houseWithSwimmingPool + "\n" + houseWithGarden);
    }
}
