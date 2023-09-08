package ro.fasttrackit.course8.inheritance;

public class BikeMain {
    public static void main(String[] args) {
        Bike bike = new Bike(2);
        MountainBike mountainBike = new MountainBike(6);

        bike.protectedMethod();
        mountainBike.protectedMethod();

        System.out.println(bike);
        System.out.println(mountainBike);


    }
}
