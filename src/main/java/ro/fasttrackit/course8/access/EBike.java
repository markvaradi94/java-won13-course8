package ro.fasttrackit.course8.access;

import ro.fasttrackit.course8.inheritance.Bike;

public class EBike extends Bike {
    private int enginePower;

    public EBike() {
        super(5);
    }

    private void testAccess() {
        getTyrePressure();
//        flatTyre();
        protectedMethod();
//        defaultMethod();
    }
}
