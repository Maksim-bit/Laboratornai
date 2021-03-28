package threTask.entity;

public class Bicycle extends Vehicle {
    public Bicycle(Marks carBrend) {
        super(carBrend);
    }


    public void calculateSpeed() {
      System.out.println("Зависит от сил велосипедиста");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

