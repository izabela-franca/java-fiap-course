package exercises;

public class Vehicle {

    private double currentSpeed;

    public Vehicle(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double accelerate() {
        if (currentSpeed * 2 > 200) {
            throw new ExcessiveSpeedException("Too fast!");
        }

        this.currentSpeed *= 2;
        return currentSpeed;
    }
}
