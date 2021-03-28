package threTask;

import threTask.entity.*;

public class Test3 {
    public static void main(String[] args){
        Car vehicle0 = new Car(Marks.Volkswagen,new Wheel(15),130);
        Bicycle vehicle1 = new Bicycle(Marks.Toyota);
        vehicle0.calculateSpeed(vehicle0.getWheelRotation(),vehicle0.getWheel().getRadius());
        System.out.println(vehicle0.toString());
        vehicle1.calculateSpeed();
    }
}
