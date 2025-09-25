package CarPulseTracker;

public class Car {
    private String model;
    private String brand;
    private int horsepower;
    private int pulseRating;

    public Car(String model, String brand, int horsepower, int pulseRating) {
        this.model = model;
        this.brand = brand;
        this.horsepower = horsepower;
        this.pulseRating = pulseRating;
    }

    public String getModel() { return model; }
    public String getBrand() { return brand; }
    public int getHorsepower() { return horsepower; }
    public int getPulseRating() { return pulseRating; }

    public String describe() {
        return brand + " " + model + " | HP: " + horsepower + " | Pulse: " + pulseRating;
    }
}