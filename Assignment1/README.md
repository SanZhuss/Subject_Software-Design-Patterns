# Builder Pattern – House Construction

This project demonstrates the implementation of the Builder Design Pattern in Java.

The system builds different types of houses using the same construction process while allowing different final representations.

Implemented house types:
Regular House
House With Garden
House With Swimming Pool


Builder Pattern Components:
    Product:
        House
    Builder:
        Builder (abstract class)
    Concrete Builders:
        RegularHouse
        HouseWithGarden
        HouseWithSwimmingPool
    Director:
        Director
    Client:
        Main

        
How It Works

The Director controls the construction process by calling the builder methods in a predefined order.

Different concrete builders create different house configurations while reusing the same construction logic.

Clean Code Principles Applied
Meaningful naming
Small methods
Single responsibility
One level of abstraction
DRY (Don't Repeat Yourself)
Consistent formatting
How to Run
Open the project in IntelliJ IDEA.
Make sure JDK 17 (or newer) is installed.
Run the Main class.
The program will create and display different house representations.