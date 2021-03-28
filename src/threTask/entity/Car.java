package threTask.entity;

public class Car extends Vehicle {

    private int wheelRotation;

    public Car(Marks CarBrend, Wheel wheel, int wheelRotation) {
        super(CarBrend, wheel);
        this.wheelRotation = wheelRotation;
    }

    @Override
    public double calculateSpeed(int n, double r) {
        return super.calculateSpeed(n, r);
    }

    public int getWheelRotation() {
        return wheelRotation;
    }

    public void setWheelRotation(int wheelRotation) {
        this.wheelRotation = wheelRotation;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
