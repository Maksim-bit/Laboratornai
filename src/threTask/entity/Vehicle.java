package threTask.entity;

public class Vehicle  {
    private Marks CarBrend;
    private threTask.entity.Wheel wheel;
    private double speed;


    public Vehicle(Marks CarBrend, threTask.entity.Wheel wheel) {
        this.CarBrend = CarBrend;
        this.wheel = wheel;
    }

    public Vehicle(Marks carBrend) {
        CarBrend = carBrend;
    }

    public Vehicle() {

    }
    public double calculateSpeed(int n,double r){
        speed = 2*3.14*n*r;
        return speed;

    }

    public Marks getCarBrend() {
        return CarBrend;
    }

    public void setCarBrend(Marks carBrend) {
        CarBrend = carBrend;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "CarBrend=" + CarBrend +
                ", wheel=" + wheel +
                ", speed=" + speed +
                '}';
    }
}
