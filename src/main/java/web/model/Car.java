package web.model;

public class Car {
    private String model;
    private Integer countOfWheels;
    private Integer fuelConsume;
    public Car(String model, int countOfWheels, int fuelConsume) {
        this.model = model;
        this.fuelConsume = fuelConsume;
        this.countOfWheels = countOfWheels;
    }
    @Override
    public String toString() {
        return "model: " + model + " / countOfWheels: " + countOfWheels + " / fuelConsume: " + fuelConsume;
    }
}
