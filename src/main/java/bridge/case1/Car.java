package bridge.case1;

public class Car extends Vehicle {

    public Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Car manufacture");
        workshop1.work();
        workshop2.work();
    }
}
