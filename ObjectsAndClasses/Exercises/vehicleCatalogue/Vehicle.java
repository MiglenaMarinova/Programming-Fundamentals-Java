package ObjectsAndClasses.Exercises.vehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int hp;

    public Vehicle(String type, String model, String color, int hp) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.hp = hp;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getHp() {
        return this.hp;
    }

    @Override
    public String toString() {
        String typeVehicle = type.equals("car") ? "Car" : "Truck";
        return String.format("Type: %s%n" +
                "Model: %s%n" +
                "Color: %s%n" +
                "Horsepower: %d", typeVehicle, this.model, this.color, this.hp);
    }
}
